package pe.egcc.promedioapp.prueba;

import pe.egcc.promedioapp.service.PromedioService;

/**
 * Prueba del servicio para calcular el promedio de laboratorio
 * @author Master
 */
public class Prueba01 {

    public static void main(String[] args) {
        // Datos
        int n1 = 16;
        int n2 = 18;
        int n3 = 20;
        int n4 = 10;
        // Proceso
        PromedioService service = new PromedioService();
        int pr = service.calcPromLab(n1, n2, n3, n4);
        // Reporte
        System.out.println("Promedio: " + pr);
        
    }

    
}
