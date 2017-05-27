package pe.egcc.mateexpert.service;

public final class MateService {

  private MateService() {
  }

  public static long factorial(int n){
    long f = 1;
    for (int i = 2; i <= n; i++) {
      f *= i;
    }
    return f;
  }

  public static long mcd(int n1, int n2){
    return 0;
  }

  public static long mcm(int n1, int n2){
    return 0;
  }

  public static int[] fibonacci(int n){
    return null;
  }

  public static boolean esPrimo(int n){
    return false;
  }

}
