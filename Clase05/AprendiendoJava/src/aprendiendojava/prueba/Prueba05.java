package aprendiendojava.prueba;

import aprendiendojava.model.Producto;
import java.util.HashMap;
import java.util.Map;

public class Prueba05 {

  public static void main(String[] args) {
    
    Map<String,Object> rec = new HashMap<>();
    
    rec.put("C01", "Gustavo Coronel");
    rec.put("P01", new Producto("Tamal", 10.0));
    rec.put("Precio", 678.90);
        
    System.out.println("==================================");
    for(String key: rec.keySet()){
      System.out.println(key + " ==> " + rec.get(key));
    }
    
    rec.put("C01", "Claudia Ramirez");
    
    System.out.println("==================================");
    rec.keySet().forEach( key -> 
      System.out.println(key + " ==> " + rec.get(key))
    );
    
  }
  
}
