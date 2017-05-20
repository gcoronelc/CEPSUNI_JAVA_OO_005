package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.model.PagoModel;
import pe.egcc.pagoapp.service.PagoService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    PagoModel model = new PagoModel(5, 20, 130);
    // Proceso
    PagoService service = new PagoService();
    model = service.procesarPago(model);
    // Reporte
    System.out.println("Ingresos: " + model.getIngresos());
    System.out.println("Renta: " + model.getRenta());
    System.out.println("Neto: " + model.getNeto());
  }
  
}
