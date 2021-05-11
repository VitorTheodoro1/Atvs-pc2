package ProvaLab2;

import java.util.Scanner;

public class batalha {

    public static void main(String[] args) {

        tabuleiro tabuleiro = new tabuleiro();
        int linhaJogador1 = 0,colunaJogador1 = 0,linhaJogador2 = 0,colunaJogador2 = 0;
        String resultado = "";
        Scanner input = new Scanner(System.in);

        // 
        tabuleiro.setJogador1ouro(1, 2);
        tabuleiro.setJogador1bronze(12, 11);
        tabuleiro.setJogador1platina(4, 2);
        tabuleiro.setJogador1gelo(9, 2);
        tabuleiro.setJogador1aluminio(8, 2);
        tabuleiro.setJogador1madeira(8, 5);

        tabuleiro.setJogador2ouro(1, 1);
        tabuleiro.setJogador2bronze(9, 1);
        tabuleiro.setJogador2platina(7, 2);
        tabuleiro.setJogador2gelo(8, 2);
        tabuleiro.setJogador2aluminio(2, 2);
        tabuleiro.setJogador2madeira(2, 7);

        System.out.println(
                "-----------------------------------------------\nSeja Bem vindo a Batalha Naval de espadas\nEspadas automaticamente setadas se você deseja alterar mude os valores no main\ndigite numeros de 1 a 13 para tentar adivinha onde o coleguinha colocou a espada\n-----------------------------------------------");

        for (int i = 2; i < 180; i++) {

            if (i % 2 == 0) {
                System.out.println("Vez do Jogador numero 1 jogar:");
                System.out.print("linha: ");
                linhaJogador1 = input.nextInt();
                System.out.print("Coluna: ");
                colunaJogador1 = input.nextInt();
                resultado = tabuleiro.jogar1(linhaJogador1, colunaJogador1);
                System.out.println(resultado);
                System.out.println("pontuacao total do jogador 1 e : " + tabuleiro.pontuacaojogador1());
                System.out.println("-----------------------------------------------");
                if (tabuleiro.getP1() == 6) {
                    break;
                }
            }
            if (i % 2 != 0) {
                System.out.println("Vez do Jogador numero 2 jogar:");
                System.out.print("linha: ");
                linhaJogador2 = input.nextInt();
                System.out.print("Coluna: ");
                colunaJogador2 = input.nextInt();
                resultado = tabuleiro.jogar2(linhaJogador2, colunaJogador2);
                System.out.println(resultado);
                System.out.println("pontuacao total do jogador 2 e : " + tabuleiro.pontuacaojogador2());
                System.out.println("-----------------------------------------------");
                if (tabuleiro.getP2() == 6) {
                    break;
                }
            }
        }
        input.close();
    }
}
