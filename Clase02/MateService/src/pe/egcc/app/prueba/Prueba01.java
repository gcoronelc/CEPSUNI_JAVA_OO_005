package pe.egcc.app.prueba;

import pe.egcc.app.service.PromedioService;

public class Prueba01 {

  public static void main(String[] args) {
    PromedioService service = new PromedioService();
    System.out.println("15 y 18: " + service.promedio(15, 18));
  }
  
}
