package ExercFormas;

public class Triangulo extends biDimensional{

    double base = 0.0;
    double altura = 0.0;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;

    }

    @Override
    public double obterArea() {
        double res = (base*altura)/2;
        return res;
        
    }

    @Override
    public int conferir(String formaPedida) {
        if(formaPedida.equals("Quadrado")){
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
