package pe.egcc.mateexpert.prueba;

import pe.egcc.mateexpert.MateExpert;
import pe.egcc.mateexpert.service.MateService;

public class Prueba01 {

  public static void main(String[] args) {
    // Dato
    int n = 5;
    // Proceso
    long f = MateService.factorial(n);
    // Reporte
    String repo = "Factorial de " + n + " es " + f;
    System.out.println(repo);
  }
}
