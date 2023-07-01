package com.example.demo.postpreconstruct;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class PPDemoClass {
  private PPDependencyClass dependencyObject;

  public PPDemoClass(PPDependencyClass dependencyObject){
    this.dependencyObject = dependencyObject;
    System.out.println("All dependencies are ready!");
  }
  @PostConstruct
  public void postConstructMethodDemo(){
    dependencyObject.getReady();
  }
  @PreDestroy
  public void preRemoveMethodDemo(){
    System.out.println("Cleanup");
  }
}
