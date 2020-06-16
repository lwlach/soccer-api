package com.leonardowlach.soccerapi.dto;

import com.goapigo.core.annotations.GoApiGo;
import com.goapigo.core.annotations.TextBy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@GoApiGo
@NoArgsConstructor
@AllArgsConstructor
public class Team {

  @TextBy("div > span.hide-mobile > a")
  private String name;
}
