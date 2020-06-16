package com.leonardowlach.soccerapi.controller;

import com.leonardowlach.soccerapi.LeagueService;
import com.leonardowlach.soccerapi.client.LeagueClient;
import com.leonardowlach.soccerapi.dto.League;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.goapigo.core.client.GoHttpClient.go;

@RestController
@RequestMapping("/api/league")
@RequiredArgsConstructor
public class LeagueController {

  private final LeagueClient client = go(LeagueClient.class);
  private final LeagueService service;

  @GetMapping("/brazil")
  public League getBrazilLeague() {
    return client.getBrazilLeague();
  }

  @GetMapping("/germany")
  public League getGermanyLeague() {
    return client.getGermanyLeague();
  }

  @GetMapping("/germany2")
  public League getGermanyLeague2() {
    return client.getGermanyLeague2();
  }

  @GetMapping("/austria")
  public League getAustriaLeague() {
    return service.getAustriaLeague();
  }

  @GetMapping("/england")
  public League getEnglandLeague() {
    return client.getEnglandLeague();
  }

  @GetMapping("/italy")
  public League getItalyLeague() {
    return client.getItalyLeague();
  }

  @GetMapping("/spain")
  public League getSpainLeague() {
    return client.getSpainLeague();
  }

  @GetMapping("/france")
  public League getFranceLeague() {
    return client.getFranceLeague();
  }

  @GetMapping("/portugal")
  public League getPortugalLeague() {
    return client.getPortugalLeague();
  }
}
