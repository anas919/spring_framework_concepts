package com.example.demo.postpreconstruct;

import org.springframework.stereotype.Component;

@Component
public class PPDependencyClass {
  public void getReady(){
    System.out.println("Logic on PPDependencyClass dependency of PPDemoClass");
  }
}
