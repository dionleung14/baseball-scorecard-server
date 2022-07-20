package com.dcl.baseball.baseball.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/game")
public class Controller {
  private String baseUrl = "http://api.sportradar.us/mlb/trial/v7/en/games/";

  @Value("${api.key}")
  private String apiKey;

  @GetMapping("/home")
  public void testRoute() {
    System.out.println("We are in business");
    // System.out.println(apiKey);
    System.out.println(baseUrl + "2022/07/16/boxscore.json?api_key=" + apiKey);
  }
}
