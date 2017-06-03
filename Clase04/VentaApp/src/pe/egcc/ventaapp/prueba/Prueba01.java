package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    double total = 1480.0;
    // Proceso
    CompAbstract service = new FacturaService();
    Item[] repo = service.procesar(total);
    // Reporte
    for (Item item : repo) {
      System.out.println(item.getConcepto() + " ==> " + item.getValor());
    }
  }
  
}
