package ExercBaralho;

import java.security.SecureRandom;
//import java.util.ArrayList;
//import java.util.Iterator;

public class baralho {

    String[]naipes = {"Copas","Ouros","Espadas","Paus"};

    private carta[] baralho;

    private int x=0;

    private SecureRandom randomizador = new SecureRandom();


    public baralho()
    {  
        int cont =0;
        baralho = new carta[52];
         for(String naipe : naipes){
             for(int i=1;i<14;i++){
              baralho[cont] = new carta(i,naipe);
              cont+=1;
            }
        }  
        System.out.println("Mesa embaralhando........");
    }

    public void embaralhar(){
        int posicao = 0;
        carta aux;
        for(int i=0;i<baralho.length;i++){
            posicao = randomizador.nextInt(51);
            aux = baralho[i];
            baralho[i] = baralho[posicao];
            baralho[posicao] = aux;

            
        }
    }

    public  carta[] distribuirMao(int quantidade){
        carta[] aux = new carta[quantidade];
        for(int i=0;i<quantidade;i++)
        {

            aux[i] = baralho[x];
            //if(baralho[i] != null){
             //   aux[i] = baralho[i];
            //    baralho[i] = null;
        
          //  }
          x++;
        }
        return aux;

    }
   // public void percorrerBaralho(){
        //Iterator<carta> it = baralho.iterator();
       // while(it.hasNext()){
      //      System.out.println(it.next());
      //  }
        
   // }


}
