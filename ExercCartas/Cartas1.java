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

public class Cartas1 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Cartas carta1 = new Cartas();
        System.out.print("Digite o valor da primeira carta: ");
        carta1.setValor(input.nextInt());
        System.out.print("Digite o naipe da primeira carta: ");
        carta1.setNaipe(input.next());
        Cartas carta2 = new Cartas();
        System.out.print("Digite o valor da segunda carta: ");
        carta2.setValor(input.nextInt());
        System.out.print("Digite o valor da primeira carta: ");
        carta2.setNaipe(input.next());

        System.out.printf("\n%d %d\n ",carta1.getValor(),carta2.getValor());
        System.out.printf("%s %s\n\n ",carta1.getNaipe(),carta2.getNaipe());

        carta1.displayMessageA(carta2);
        carta1.displayMessageB(carta2);


        input.close();
    }
    
}
