package ExercFormas;

public class Esfera extends Tridimensional{

    double raio = 0.0;


    public Esfera(double raio){
        this.raio= raio;
    }

    @Override
    public double obterArea() {
        double area = 0.0;
        area = 4*Math.PI*(raio*raio);
        return area;
    }

    @Override
    public double obterVolume() {
        double volume =0.0;
        volume = (4/3)*Math.PI*(raio*raio*raio);
        return volume;
    }

    @Override
    public int conferir(String formaPedida) {
            if(formaPedida.equals("Esfera")){
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
