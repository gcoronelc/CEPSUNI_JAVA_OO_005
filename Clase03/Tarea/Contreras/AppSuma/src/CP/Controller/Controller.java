package CP.Controller;
import App.Promedios.Promedios;


public class Controller {
    private Promedios service;
    
    public Controller(){
        service = new Promedios();
        
    }
 public int Promedio2(int n1, int n2){
    return service.Promedio2(n1, n2);
}
  public int Promedio3(int n1, int n2, int n3){
    return service.Promedio3(n1, n2, n3);
}
 public int Promedio4(int n1, int n2, int n3, int n4){
    return service.Promedio4(n1, n2, n3, n4);
}
  public int Promedio5(int n1, int n2, int n3, int n4, int n5){
    return service.Promedio5(n1, n2, n3, n4, n5);
}
}
