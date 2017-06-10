package pe.egcc.prestamoapp.service;

import pe.egcc.prestamoapp.model.PrestamoModel;

/**
 *
 * @author OSWALDO
 */
public class PrestamoService {

  public static PrestamoModel[] procesarCredito(int meses, double capital,
          double intMes) {
    PrestamoModel[] reporte = new PrestamoModel[meses];

    //variables
    double cuotaImporte, cuotaCapital, cuotaInteres;
    int contMes;
    //proceso       
    cuotaImporte = dosDec(capital * ((Math.pow((1 + intMes / 100), meses) * (intMes / 100)) / (Math.pow((1 + intMes / 100), meses) - 1)));

    for (int cont = 0; cont < meses; cont++) {

      // Calculo de la cuota
      if (cont == (meses - 1)) {
        cuotaCapital = dosDec(capital);
      }
      contMes = cont + 1;
      cuotaInteres = dosDec(intMes * capital / 100.0);
      cuotaCapital = dosDec(cuotaImporte - cuotaInteres);
      PrestamoModel model = new PrestamoModel();

      model.setMeses(contMes);
      model.setCapital(cuotaCapital);
      model.setIntMes(cuotaInteres);
      model.setCuotaAPagar(cuotaImporte);
      reporte[cont] = model;
      // Proxima cuota
      capital = capital - cuotaCapital;

    }
    return reporte;
  }

  public static double dosDec(double valor) {
    valor = Math.round(valor * 100.0) / 100.0;
    return valor;
  }

}
