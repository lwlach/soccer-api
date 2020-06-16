package com.leonardowlach.soccerapi;

import com.leonardowlach.soccerapi.client.LeagueClient;
import com.leonardowlach.soccerapi.dto.League;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.stream.Collectors;

import static com.goapigo.core.client.GoHttpClient.go;

@Service
@RequiredArgsConstructor
public class LeagueService {

  private final LeagueClient client = go(LeagueClient.class);

  public League getAustriaLeague() {
    var league = client.getAustriaLeague();
    var teams =
        league.getTeams().stream()
            .filter(team -> Objects.nonNull(team.getName()))
            .collect(Collectors.toList());
    return league.setTeams(teams);
  }
}
