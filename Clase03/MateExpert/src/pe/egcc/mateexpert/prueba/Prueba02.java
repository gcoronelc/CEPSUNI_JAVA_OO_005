package pe.egcc.mateexpert.prueba;

public class Prueba02 {

  public static void main(String[] args) {
    int n = 5;
    int f = 1;
    while(n > 1){
      f *= n;
      n = n - 1;
    }
    System.out.println("f = " + f);
  }
  
}
