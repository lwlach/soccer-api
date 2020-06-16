package com.leonardowlach.soccerapi.client;

import com.goapigo.core.client.annotations.GoClient;
import com.goapigo.core.client.annotations.GoGet;
import com.goapigo.core.client.annotations.GoPath;
import com.leonardowlach.soccerapi.dto.League;

@GoClient(url = "https://www.espn.com.br/futebol/classificacao/_/liga")
public interface LeagueClient {

  @GoGet
  @GoPath("/bra.1")
  League getBrazilLeague();

  @GoGet
  @GoPath("/ger.1")
  League getGermanyLeague();

  @GoGet
  @GoPath("/ger.2")
  League getGermanyLeague2();

  @GoGet
  @GoPath("/aut.1")
  League getAustriaLeague();

  @GoGet
  @GoPath("/eng.1")
  League getEnglandLeague();

  @GoGet
  @GoPath("/ita.1")
  League getItalyLeague();

  @GoGet
  @GoPath("/esp.1")
  League getSpainLeague();

  @GoGet
  @GoPath("/fra.1")
  League getFranceLeague();

  @GoGet
  @GoPath("/por.1")
  League getPortugalLeague();
}
