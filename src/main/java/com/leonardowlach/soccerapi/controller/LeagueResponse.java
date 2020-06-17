package com.leonardowlach.soccerapi.controller;

import com.leonardowlach.soccerapi.dto.League;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LeagueResponse {

  private String name;
  private String path;

  public LeagueResponse(League league) {
    this.name = getFormattedName(league.getName());
    this.path = league.getPath();
  }

  private String getFormattedName(String name) {
    var classificaoIndex = name.indexOf("Classificação");
    return name.substring(0, classificaoIndex - 3);
  }
}
