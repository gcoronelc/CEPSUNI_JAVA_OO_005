package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompFactory;
import pe.egcc.ventaapp.util.TipoComp;

public class Prueba03 {

  public static void main(String[] args) {
    // Dato
    TipoComp tipo = TipoComp.FACTURA;
    double total = 1480.0;
    // Proceso
    Item[] repo = CompFactory.get(tipo).procesar(total);
    // Reporte
    for (Item item : repo) {
      System.out.println(item.getConcepto() + " ==> " + item.getValor());
    }
  }
  
}
