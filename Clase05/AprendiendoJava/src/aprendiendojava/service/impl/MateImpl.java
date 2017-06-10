package aprendiendojava.service.impl;

import aprendiendojava.service.spec.MateSpec;
import java.util.Arrays;

public class MateImpl implements MateSpec {

  @Override
  public int suma(int... datos) {
    int suma = 0;

    // Caso 1
    /*for (int dato : datos) {
      suma += dato;
    }*/
    // Caso 2
    suma = Arrays.stream(datos).sum();

    return suma;
  }

  @Override
  public int promedio(int... datos) {
    int prom = (int) Arrays.stream(datos).average().getAsDouble();
    return prom;
  }

  @Override
  public int mayor(int... datos) {
    int ma = Arrays.stream(datos).max().getAsInt();
    return ma;
  }

  @Override
  public int menor(int... datos) {
    int me = Arrays.stream(datos).min().getAsInt();
    return me;
  }

  @Override
  public int moda(int... datos) {
    int mo = 0;
    
    return mo;
  }

  @Override
  public int mediana(int... datos) {
    int me = 0;
    
    return me;
  }

}
