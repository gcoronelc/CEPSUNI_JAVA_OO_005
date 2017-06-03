package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

public abstract class CompAbstract {


  public abstract Item[] procesar(double total);

  public void validarTotal(double total){
    if(total<0){
      throw new RuntimeException("El total no puede ser negativo.");
    }
  }
  
  public double redondear(double valor){
    valor *= 100;
    valor = Math.round(valor);
    valor /= 100.0;
    return valor;
  }
  
  
}
