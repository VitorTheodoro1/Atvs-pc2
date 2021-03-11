package ExercFormas;

public class Tetraedro extends Tridimensional{

    double lado = 0.0;


    public Tetraedro(double lado){
        this.lado = lado;
    
    }

    @Override
    public double obterArea() {
        double area = 0.0;
        area = (lado*lado*lado)*Math.sqrt(3);
        return area;
    }

    @Override
    public double obterVolume() {
        double volume =0.0;
        volume = ((lado*lado*lado)*Math.sqrt(2))/12;
        return volume;
    }

    @Override
    public int conferir(String formaPedida) {
            if(formaPedida.equals("Tetraedro")){
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
