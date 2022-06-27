package com.moazmar.stocksphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApistocksphereApplication {

  public static void main(String[] args) {
    SpringApplication.run(ApistocksphereApplication.class, args);
  }

}
