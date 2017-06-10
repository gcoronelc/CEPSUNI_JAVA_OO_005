package aprendiendojava.prueba;

import aprendiendojava.service.impl.MateImpl;
import aprendiendojava.service.spec.MateSpec;

public class Prueba01 {

  public static void main(String[] args) {
    MateSpec bean = new MateImpl();
    
    System.out.println("Suma: " + bean.suma(5,7,8,12,54,12));
    System.out.println("Promedio: " + bean.promedio(10,8,2));
    
  }
  
  
}
