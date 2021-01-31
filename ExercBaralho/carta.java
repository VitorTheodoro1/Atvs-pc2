package  ExercBaralho;

public class carta {

    private int VALOR;
    private String NAIPE;

    public carta(){
        VALOR = 0;
        NAIPE = "";
    }

    public carta(int valor, String naipe){
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

    public int comparaValor(carta carta){

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

    public int comparaNaipe(carta carta)
    {
        if(this.NAIPE.equals(carta.getNaipe()))
        {
            return 1;
        }
        else
        return 0;
    }

        public void displayMessageA(carta carta){
            System.out.printf("\no resultado e %d ",comparaValor(carta));
        }
        public void displayMessageB(carta carta){

            if(comparaNaipe(carta)==1)
            {
                System.out.printf("\no naipe e igual ");
            }
            else
            System.out.printf("\no naipe e diferente ",comparaValor(carta));
        }

}
