package com.leonardowlach.soccerapi.dto;

import com.goapigo.core.annotations.GoApiGo;
import com.goapigo.core.annotations.ListBy;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@GoApiGo
public class League {

  @ListBy("table.Table.Table--align-right.Table--fixed.Table--fixed-left > tbody > tr")
  private List<Team> teams;

  public League setTeams(List<Team> teams) {
    this.teams = teams;
    return this;
  }
}
