package ExercFormas;

public class Cubo extends Tridimensional{

    double lado = 0.0;


    public Cubo(double lado){
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        double area = 0.0;
        area = 6*(lado*lado);
        return area;
    }

    @Override
    public double obterVolume() {
        double volume =0.0;
        volume = ((lado*lado*lado));
        return volume;
    }

    @Override
    public int conferir(String formaPedida) {
            if(formaPedida.equals("Cubo")){
                return 1;
            }
        else{
            return 0;
        }
    }

    @Override
    public int qualForma() {
        return 1;
    }
    
}
