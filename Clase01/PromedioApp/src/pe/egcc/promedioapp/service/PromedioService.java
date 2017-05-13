package pe.egcc.promedioapp.service;

public class PromedioService {

    public int calcPromLab(int n1, int n2, int n3, int n4){
        int prom = 0;
        //----------------------------------------------------------------
        int menor = calcMenor(n1,n2,n3,n4);
        prom = (n1 + n2 + n3 + n4 - menor) / 3;
        //----------------------------------------------------------------
        return prom;
    }

    private int calcMenor(int n1, int n2, int n3, int n4) {
        int menor=n1;
        if(menor>n2){
            menor=n2;
        }
        if(menor>n3){
            menor=n3;
        }
        if(menor>n4){
            menor=n4;
        }
        return menor;
    }

    
    
}
