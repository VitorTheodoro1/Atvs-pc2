package ExercCartas;


public class cartas {

    private int VALOR;
    private String NAIPE;

    public cartas(){
        VALOR = 0;
        NAIPE = "";
    }

    public cartas(int valor, String naipe){
        this.VALOR = valor;
        this.NAIPE = naipe;
    }

    public void setValor(int valor){
        this.VALOR = valor;
    }

    public void setNaipe(String naipe){
        this.NAIPE = naipe;
    }

    public int getValor(){
        return VALOR;
    }

    public String getNaipe(){
        return NAIPE;
    }

    public int comparaValor(cartas carta){

        if(this.VALOR>carta.getValor())
        {
            return 1;
        }
        else if(this.VALOR == carta.getValor()){
            return 0;
        }
        else {
            return -1;
        }
    }

    public int comparaNaipe(cartas carta)
    {
        if(this.NAIPE.equals(carta.getNaipe()))
        {
            return 1;
        }
        else
        return 0;
    }

    }

       
