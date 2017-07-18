package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

  @RequestMapping("/web")
  public String hello() {
    return "hello()";
  }

}