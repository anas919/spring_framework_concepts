package com.example.demo.service.data;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
  public int[] retrieveData() {
    return new int[] {11,22,44,33};
  }
}

