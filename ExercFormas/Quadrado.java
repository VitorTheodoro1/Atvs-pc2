package ExercFormas;

public class Quadrado extends biDimensional{

    double base = 0.0;
    double altura = 0.0;

    public Quadrado(double base, double altura){
        this.base = base;
        this.altura = altura;

    }

    @Override
    public double obterArea() {
        double res = (base*altura);
        return res;
        
    }

    @Override
    public int conferir(String formaPedida) {
        if(formaPedida.equals("Triangulo")){
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
