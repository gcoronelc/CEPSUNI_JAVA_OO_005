package aprendiendojava.prueba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prueba06 {


  public static void main(String[] args) {
    
    List<Map<String,Object>> lista;
    lista = new ArrayList<>();
    
    Map<String,Object> rec;
            
    // Rec 1
    rec = new HashMap<>();
    rec.put("nombre", "Televisor");
    rec.put("precio", 4500.0);
    lista.add( rec );
    
    // Rec 2
    rec = new HashMap<>();
    rec.put("nombre", "Computadors");
    rec.put("precio", 5899.0);
    lista.add( rec );
    
    // Rec 3
    rec = new HashMap<>();
    rec.put("nombre", "Lapicero");
    rec.put("precio", 120.0);
    lista.add( rec );
    
    // Rec 4
    rec = new HashMap<>();
    rec.put("nombre", "Maletin");
    rec.put("precio", 470.0);
    lista.add( rec );
    
    // Listado
    for(Map<String,Object> r: lista){
      for(String key: r.keySet()){
        System.out.println(key + " ==> " + r.get(key).toString());
      }
    }
    
    // Listado 2
    System.out.println("======================");
    lista.forEach(r -> {
      r.keySet().forEach(key -> 
        System.out.println(key + " ==> " + r.get(key).toString()));
    });
    
  }
  
}
