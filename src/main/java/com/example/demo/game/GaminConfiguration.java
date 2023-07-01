package com.example.demo.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.demo.game")
public class GaminConfiguration {
/*   @Bean
  public GamingConsole game() {
    return new BatMan();
  }
  @Bean
  @Primary
  public GamingConsole game1() {
    return new Mario();
  } */
}
