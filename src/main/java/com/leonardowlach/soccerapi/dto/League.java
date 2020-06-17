package com.leonardowlach.soccerapi.dto;

import com.goapigo.core.annotations.GoApiGo;
import com.goapigo.core.annotations.ListBy;
import com.goapigo.core.annotations.TextBy;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@GoApiGo
public class League {

  @ListBy("table.Table.Table--align-right.Table--fixed.Table--fixed-left > tbody > tr")
  private List<Team> teams;

  @TextBy("h1.headline.headline__h1.dib")
  private String name;

  private String path;

  public League setPath(String path) {
    this.path = path;
    return this;
  }

  public League setTeams(List<Team> teams) {
    this.teams = teams;
    return this;
  }

  public String getName() {
    var classificaoIndex = this.name.indexOf("Classificação");
    return this.name.substring(0, classificaoIndex - 3);
  }
}
