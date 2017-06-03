package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.util.TipoComp;

public final class CompFactory {

  private CompFactory() {
  }

  public static CompAbstract get(TipoComp tipo) {
    CompAbstract bean = null;
    switch (tipo) {
      case FACTURA:
        bean = new FacturaService();
        break;
      case BOLETA:
        bean = new BoletaService();
        break;
    }
    return bean;
  }

}
