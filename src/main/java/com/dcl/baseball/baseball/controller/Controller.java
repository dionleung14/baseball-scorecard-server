package com.dcl.baseball.baseball.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/game")
public class Controller {

  @GetMapping("/home")
  public void testRoute() {
    System.out.println("We are in business");
  }
}
