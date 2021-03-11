package ExercFormas;

public class Circulo extends biDimensional{

    double lado = 0.0;
  
    public Circulo(double lado){
        this.lado = lado;


    }

    @Override
    public double obterArea() {
        double res = Math.PI*(lado*lado);
        return res;
        
    }

    @Override
    public int conferir(String formaPedida) {
        if(formaPedida.equals("Circulo")){
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int qualForma() {
        return 0;
    }
    
}
