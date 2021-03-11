package ExercBaralho;

/**
 * 
 * 
 * 
 * 
 * @author : Vitor Theodoro
 * 
 * */

import java.util.Scanner;

public class mesa {

    private static jogador j1, j2;
    private static baralho oficial;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        oficial = new baralho();
        oficial.embaralhar();
        j1 = new jogador();
        j2 = new jogador();

        System.out.print("\nInforme o número de cartas a distribuir para os jogadores:  ");
        int quant = input.nextInt();

        j1.setMao(oficial.distribuirMao(quant));
        j2.setMao(oficial.distribuirMao(quant));
        System.out.println("\nMesa distribui as 5 cartas para jogador A e para o jogador B.");
        carta x = j1.jogar();
        carta y = j2.jogar();
        System.out.printf("\nO jogador A joga a carta de naipe " + x.getNaipe()+" e de valor " + x.getValor()+ "\n");
        System.out.printf("\nO jogador B joga a carta de naipe " + y.getNaipe()+" e de valor " + y.getValor()+ "\n\n");
        System.out.println(j1.mostrarMao());
        System.out.println(j2.mostrarMao());
        System.out.printf("\no resultado e %d ",x.comparaValor(y));
    

        input.close();

    }


}
