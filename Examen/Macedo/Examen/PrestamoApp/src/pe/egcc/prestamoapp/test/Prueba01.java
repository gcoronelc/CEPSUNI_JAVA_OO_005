
package pe.egcc.prestamoapp.test;

import pe.egcc.prestamoapp.model.PrestamoModel;
import pe.egcc.prestamoapp.service.PrestamoService;

/**
 *
 * @author OSWALDO
 */
public class Prueba01 {
    public static void main(String[] args) {
        //Asignacion de Variables
        int meses=12;
        double capital = 1000;
        double intMes = 4;
        
        //Reporte
        PrestamoModel[] reporte = PrestamoService.procesarCredito(meses, capital, intMes);
        for( PrestamoModel model:reporte){
         String texto = "";
      texto += model.getMeses()+ " mes \t";
      texto += model.getCapital()+ " amortizacion \t";
      texto += model.getIntMes()+ " interes \t";
      texto += model.getCuotaAPagar() + " cuota mensual";
      
      System.out.println(texto);
        
        }
        
    }
}
