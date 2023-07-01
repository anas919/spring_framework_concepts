package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements GamingConsole {

  @Override
  public void up() {
    // TODO Auto-generated method stub
    System.out.println("Batman up");
  }

  @Override
  public void down() {
    // TODO Auto-generated method stub
    System.out.println("Batman down");
  }

  @Override
  public void left() {
    // TODO Auto-generated method stub
    System.out.println("Batman left");
  }

  @Override
  public void right() {
    // TODO Auto-generated method stub
    System.out.println("Batman right");
  }
  
}