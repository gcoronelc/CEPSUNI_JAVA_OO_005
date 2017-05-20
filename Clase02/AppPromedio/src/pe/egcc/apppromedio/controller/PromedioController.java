package pe.egcc.apppromedio.controller;

import pe.egcc.app.service.PromedioService;

public class PromedioController {
  
  private PromedioService service;

  public PromedioController() {
    service = new PromedioService();
  }
  
  public int promedio(int n1, int n2){
    return service.promedio(n1, n2);
  }
  
  
  
  
}
