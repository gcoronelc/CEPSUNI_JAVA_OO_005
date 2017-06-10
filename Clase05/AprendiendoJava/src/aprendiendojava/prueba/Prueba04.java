package aprendiendojava.prueba;

import aprendiendojava.model.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prueba04 {

  public static void main(String[] args) {
    
    List<Producto> lista = new ArrayList<>();
    
    lista.add(new Producto("Papas", 5.0));
    lista.add(new Producto("Teclado", 125.0));
    lista.add(new Producto("Chocolate", 10.0));
    lista.add(new Producto("Paneton", 45.0));
    lista.add(new Producto("Carro de Juguete", 35.0));
    lista.add(new Producto("Camisa", 105.0));
    
    // Eliminar los dos últimos
    lista.remove(4);
    lista.remove(4);
    
    // Recorrido usando Strem y Lambda
    System.out.println("Recorrido usando Strem");
    lista.stream().forEach( p -> System.out.println(p) );
    
    
  }

  
}
