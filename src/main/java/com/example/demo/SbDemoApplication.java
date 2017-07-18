package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbDemoApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext cac = SpringApplication.run(SbDemoApplication.class, args);
    SbDemoApplication app = cac.getBean(SbDemoApplication.class);
    app.hello();
  }

  public void hello() {
    System.out.println("hello()");
  }
}