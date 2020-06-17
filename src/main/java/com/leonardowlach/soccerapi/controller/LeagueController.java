package com.leonardowlach.soccerapi.controller;

import com.leonardowlach.soccerapi.LeagueService;
import com.leonardowlach.soccerapi.dto.League;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/leagues")
@RequiredArgsConstructor
public class LeagueController {

  private final LeagueService service;

  @GetMapping
  public List<LeagueResponse> getLeagues() {
    return service.getLeagues();
  }

  @GetMapping("/brazil")
  public League getBrazilLeague() {
    return service.getBrazilLeague();
  }

  @GetMapping("/germany")
  public League getGermanyLeague() {
    return service.getGermanyLeague();
  }

  @GetMapping("/germany2")
  public League getGermanyLeague2() {
    return service.getGermanyLeague2();
  }

  @GetMapping("/england")
  public League getEnglandLeague() {
    return service.getEnglandLeague();
  }

  @GetMapping("/italy")
  public League getItalyLeague() {
    return service.getItalyLeague();
  }

  @GetMapping("/spain")
  public League getSpainLeague() {
    return service.getSpainLeague();
  }

  @GetMapping("/france")
  public League getFranceLeague() {
    return service.getFranceLeague();
  }

  @GetMapping("/portugal")
  public League getPortugalLeague() {
    return service.getPortugalLeague();
  }

  @GetMapping("/austria")
  public League getAustriaLeague() {
    return service.getAustriaLeague();
  }
}
