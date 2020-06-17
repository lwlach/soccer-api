package com.leonardowlach.soccerapi;

import com.leonardowlach.soccerapi.client.LeagueClient;
import com.leonardowlach.soccerapi.controller.LeagueResponse;
import com.leonardowlach.soccerapi.dto.League;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.goapigo.core.client.GoHttpClient.go;

@Service
@RequiredArgsConstructor
public class LeagueService {

  private final LeagueClient client = go(LeagueClient.class);

  public List<LeagueResponse> getLeagues() {
    try {
      var leagues = new LinkedList<LeagueResponse>();
      var methods = client.getClass().getMethods();
      var leaguesMethods =
          Arrays.stream(methods)
              .filter(method -> method.getReturnType().getName().contains("League"))
              .collect(Collectors.toList());
      for (var leagueMethod : leaguesMethods) {
        var league = (League) leagueMethod.invoke(client);
        league.setPath(getLeaguePath(leagueMethod));
        leagues.add(new LeagueResponse(league));
      }
      return leagues;
    } catch (Exception e) {
      return Collections.emptyList();
    }
  }

  private String getLeaguePath(Method leagueMethod) {
    return leagueMethod.getName().replace("get", "/").replace("League", "").toLowerCase();
  }

  public League getBrazilLeague() {
    return client.getBrazilLeague().setPath("/brazil");
  }

  public League getGermanyLeague() {
    return client.getGermanyLeague().setPath("/germany");
  }

  public League getGermanyLeague2() {
    return client.getGermanyLeague2().setPath("/germany2");
  }

  public League getEnglandLeague() {
    return client.getEnglandLeague().setPath("/england");
  }

  public League getItalyLeague() {
    return client.getItalyLeague().setPath("/italy");
  }

  public League getSpainLeague() {
    return client.getSpainLeague().setPath("/spain");
  }

  public League getFranceLeague() {
    return client.getFranceLeague().setPath("/france");
  }

  public League getPortugalLeague() {
    return client.getPortugalLeague().setPath("/portugal");
  }

  public League getAustriaLeague() {
    var league = client.getAustriaLeague();
    var teams =
        league.getTeams().stream()
            .filter(team -> Objects.nonNull(team.getName()))
            .collect(Collectors.toList());
    return league.setTeams(teams);
  }
}
