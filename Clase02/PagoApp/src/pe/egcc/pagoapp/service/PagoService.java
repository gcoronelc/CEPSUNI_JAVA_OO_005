package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.model.PagoModel;

public class PagoService {
  
  public PagoModel procesarPago(PagoModel model){
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = model.getHorasDia() 
            * model.getDias() * model.getPagoHora();
    renta = ingresos * ((ingresos>1500.0)?0.08:0);
    neto = ingresos - renta;
    // Reporte
    model.setIngresos(ingresos);
    model.setRenta(renta);
    model.setNeto(neto);
    return model;
  }
  
  
}
