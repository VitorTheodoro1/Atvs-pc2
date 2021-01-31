package  ExercBaralho;

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

    private static jogador j1,j2;
    private static baralho oficial;

    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
        
    oficial = new baralho();
        oficial.embaralhar();
        j1 = new jogador();
        j2 = new jogador();
        
    System.out.print("Informe o número de cartas a distribuir para os jogadores:  ");
    int quant = input.nextInt(); 

    j1.setMao(oficial.distribuirMao(quant));
    j2.setMao(oficial.distribuirMao(quant));
    System.out.println("Mesa distribui as 5 cartas para jogador A e para o jogador B.");
    //System.out.println(j1.mostrarMao());
    //System.out.println(j2.mostrarMao());
    carta x = j1.jogar();
    carta y = j2.jogar();
    //System.out.println(j1.maiorCarta());
    x.displayMessageA(y);

    input.close();
    
}
}
