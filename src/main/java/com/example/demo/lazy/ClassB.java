package com.example.demo.lazy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {
  private ClassA classA;

  public ClassB(ClassA classA){
    System.out.println("Initialization Logic under ClassB constructor");
    this.classA = classA;
  }
}
