package com.example.demo.service.data;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLDataServiceQuealifier")
public class MySQLDataService implements DataService {
  public int[] retrieveData() {
    return new int[] {1,2,3,4};
  }
}
