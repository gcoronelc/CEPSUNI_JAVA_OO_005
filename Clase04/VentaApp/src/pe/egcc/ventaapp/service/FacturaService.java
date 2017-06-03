package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

public class FacturaService extends CompAbstract {

  @Override
  public Item[] procesar(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Validar
    validarTotal(total);
    // Proceso
    consumo = redondear(total / 1.18);
    impuesto = redondear(total - consumo);
    servicio = redondear(total * 0.10);
    totalGeneral = redondear(total + servicio);
    // Reporte
    Item[] repo = {
      new Item("Consumo", consumo),
      new Item("Impuesto", impuesto),
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral)
    };
    return repo;
  }

}
