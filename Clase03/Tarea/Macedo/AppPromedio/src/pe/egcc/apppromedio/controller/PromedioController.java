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
  
  public int promedio(int n1, int n2, int n3){
    return service.promedio(n1, n2, n3);
  }  
  
  public int promedio(int n1, int n2, int n3, int n4){
    return service.promedio(n1, n2, n3, n4);
  } 
  
  public int promedio(int n1, int n2, int n3, int n4, int n5){
    return service.promedio(n1, n2, n3, n4, n5);
  } 
  
}
