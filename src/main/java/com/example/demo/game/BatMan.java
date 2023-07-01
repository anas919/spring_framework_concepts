package com.example.demo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("BatManQualifier")
public class BatMan implements GamingConsole {

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