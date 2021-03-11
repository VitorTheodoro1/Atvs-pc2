package ExercNumeros;

/**
 * 
 * Nomes: Vitor Theodoro Rocha Domingues
 * Henrique Pereira Cristófaro
 * 
 * */

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Bagels num = new Bagels();
        NumerosPalpitados setar = new NumerosPalpitados();
        int valor = 0;

        System.out.println("Digite o numero escolhido: ");
        num.setNumEscolhido(input.nextInt());

         int x=0;
        while(x<20){//20 tentativas
            
            System.out.println("\nPalpitador tente adivinhar esse numero: ");
            valor = (input.nextInt());
            num.setNumAdivinha(valor);
            setar.addNumTentativas(valor);
 
            System.out.println("\n"+num.Desvendar());
            if(num.conferirTermino()==1){
                System.out.println("Parabéns você acertou o numero!");
                System.out.println("Você demorou "+num.getVezes()+" vezes para acertar!");
                System.out.print("Seus numeros foram: \n");
                for (int k : setar.todosValores()) {
                    System.out.println(k);
                  }

                break;
            } 
            //System.out.println("é sua " + num.getVezes() +" tentativa\n");
            x++;
        }


        
        



        input.close();

    }

    

    
}
