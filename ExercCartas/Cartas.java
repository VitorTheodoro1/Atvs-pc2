package ExercCartas;


public class Cartas {

    private int VALOR;
    private String NAIPE;

    public Cartas(){
        VALOR = 0;
        NAIPE = "";
    }

    public Cartas(int valor, String naipe){
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

    public int comparaValor(Cartas carta){

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

    public int comparaNaipe(Cartas carta)
    {
        if(this.NAIPE.equals(carta.getNaipe()))
        {
            return 1;
        }
        else
        return 0;
    }

        public void displayMessageA(Cartas carta){
            System.out.printf("o resultado e %d ",comparaValor(carta));
        }



        
        public void displayMessageB(Cartas carta){

            if(comparaNaipe(carta)==1)
            {
                System.out.printf("\no naipe e igual ");
            }
            else
            System.out.printf("\no naipe e diferente ",comparaValor(carta));
        }

}
