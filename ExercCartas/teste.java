package ExercCartas;

/**
 * 
 * 
 * 
 * 
 * @author : Vitor Theodoro
 * 
 */

import java.util.Scanner;

public class teste {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        cartas carta1 = new cartas();
        System.out.print("Digite o valor da primeira carta: ");
        carta1.setValor(input.nextInt());
        System.out.print("Digite o naipe da primeira carta: ");
        carta1.setNaipe(input.next());
        cartas carta2 = new cartas();
        System.out.print("Digite o valor da segunda carta: ");
        carta2.setValor(input.nextInt());
        System.out.print("Digite o valor da primeira carta: ");
        carta2.setNaipe(input.next());

        System.out.printf("o resultado e %d ",carta1.comparaValor(carta2));

        if(carta1.comparaNaipe(carta2)==1)
            {
                System.out.printf("\no naipe e igual ");
            }
            else
            System.out.printf("\no naipe e diferente ",carta1.comparaValor(carta2));

        input.close();
    }

}
