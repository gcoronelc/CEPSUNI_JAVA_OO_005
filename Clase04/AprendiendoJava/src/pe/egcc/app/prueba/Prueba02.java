package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase3;

public class Prueba02 {

  public static void main(String[] args) {
    Clase2 a = new Clase2();
    Clase1 b = a;
    
    // La siguiente linea da error en ejecución
    Clase3 c = (Clase3) a;
  }

  
}
