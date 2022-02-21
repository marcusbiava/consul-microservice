package com.biava;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class EnviaNumerosApplication {

  @Value("${spring.application.name}")
  private String appName;

  public static void main(String[] args) {
    SpringApplication.run(EnviaNumerosApplication.class, args);
  }

  @GetMapping("/")
  public String hello() {
    return appName;
  }

}
