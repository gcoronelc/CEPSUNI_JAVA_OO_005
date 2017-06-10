package aprendiendojava.prueba;

import aprendiendojava.model.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prueba03 {

  public static void main(String[] args) {
    
    List<Producto> lista = new ArrayList<>();
    
    lista.add(new Producto("Papas", 5.0));
    lista.add(new Producto("Teclado", 125.0));
    lista.add(new Producto("Chocolate", 10.0));
    lista.add(new Producto("Paneton", 45.0));
    lista.add(new Producto("Carro de Juguete", 35.0));
    lista.add(new Producto("Camisa", 105.0));
    
    // Recorredo usando Iterator
    System.out.println("Recorredo usando Iterator");
    Iterator<Producto> it = lista.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    
    
    // Recorrido Indexado
    System.out.println("Recorrido Indexado");
    for (int i = 0; i < lista.size(); i++) {
      Producto p = lista.get(i);
      System.out.println(p);
    }
    
    
    // Recorrido tipo colección
    System.out.println("Recorrido Tipo Colección");
    for (Producto producto : lista) {
      System.out.println(producto);
    }
    
    // Recorrido usando Strem y Lambda
    System.out.println("Recorrido usando Strem");
    lista.stream().forEach( p -> System.out.println(p) );
    
  }

  
}
