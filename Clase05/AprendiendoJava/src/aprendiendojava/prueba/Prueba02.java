package aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prueba02 {

  public static void main(String[] args) {
    
    List lista = new ArrayList();
    
    lista.add("Java por Siempre.");
    lista.add(12345.6789);
    lista.add(8484848);
    lista.add(new Date());
    
    
    for (Object object : lista) {
      System.out.println(object);
    }
    
    
    
  }
  
}
