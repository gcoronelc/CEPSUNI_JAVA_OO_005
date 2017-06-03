package pe.egcc.ventaapp.controller;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompFactory;
import pe.egcc.ventaapp.util.TipoComp;

public class VentaController {

  public Item[] procesar(TipoComp tipo, double total) {
    return CompFactory.get(tipo).procesar(total);
  }

    
}
