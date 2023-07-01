package com.example.demo.service.data;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {
  DataService dataService;
  
  //int[] dataService;
  
  public BusinessCalculationService(@Qualifier("MySQLDataServiceQuealifier") DataService dataService){
    this.dataService = dataService;
  }



  public int findMax() {
    int max=dataService.retrieveData()[0];
    for(int i=0;i<dataService.retrieveData().length;i++){
      if(max<dataService.retrieveData()[i]){
        max=dataService.retrieveData()[i];
      }
    }
    return max;
  }
}
