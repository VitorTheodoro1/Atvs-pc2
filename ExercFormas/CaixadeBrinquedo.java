package ExercFormas;

import java.util.ArrayList;

public class CaixadeBrinquedo {

    ArrayList<Forma> ExercFormas = new ArrayList<Forma>();
    ArrayList<Tridimensional> formastri = new ArrayList<Tridimensional>();
    String formaPedida = "";

    public void addValores(Forma valores) {
        this.ExercFormas.add(valores);
    }

    public void addValoresTri(Tridimensional valores){
        this.formastri.add(valores);
    }

    public void addFormaPedida(String forma){
        this.formaPedida = forma;

    }

    public int calcular() {
        for (Forma formas : ExercFormas) {
            if (formas.qualForma() == 1) {
                for (Tridimensional tri : formastri) {
                    if(tri.conferir(formaPedida)==1){
                    System.out.println("Eu Sou um " + formaPedida + " minha area e " + formas.obterArea() + " e meu volume " + tri.obterVolume());
                    return 1;
                    }  
                }
                
            } else if (formas.qualForma() == 0){
                if(formas.conferir(formaPedida)==1){
                    System.out.println("Eu Sou um " + formaPedida + " minha area e " + formas.obterArea());
                    
                }
            } 

        }
        return 0;
        

    }

}
