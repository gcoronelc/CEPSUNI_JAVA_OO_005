package pe.egcc.mateexpert.controller;

import pe.egcc.mateexpert.service.MateService;

public class AppController {

  public long factorial(int n) {
    return MateService.factorial(n);
  }
  
}
