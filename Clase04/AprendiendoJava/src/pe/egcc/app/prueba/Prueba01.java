package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase3;

public class Prueba01 {

  public static void main(String[] args) {
    
    // Datos
    int n1 = 45;
    int n2 = 5;
    
    // Proceso
    Clase3 bean = new Clase3();
    int suma = bean.sumar(n1, n2);
    
    // Reporte
    System.out.println(n1 + " + " + n2 + " = " + suma);
  }
  
}
