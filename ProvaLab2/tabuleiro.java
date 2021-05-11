package ProvaLab2;

public class tabuleiro {

    int pontuaçaojogador1 = 0,pontuaçaojogador2 = 0;
    int p1 = 0,p2 = 0;
    int u = 0,p = 0;
    int tabuleirojogador1[][] = new int[13][13],tabuleirojogador2[][] = new int[13][13];

    public void setJogador1ouro(int linha, int coluna) { tabuleirojogador1[linha][coluna] = 50; }

    public void setJogador1bronze(int linha, int coluna) { tabuleirojogador1[linha][coluna] = 40; }

    public void setJogador1platina(int linha, int coluna) {tabuleirojogador1[linha][coluna] = 30;}

    public void setJogador1gelo(int linha, int coluna) {tabuleirojogador1[linha][coluna] = 20;}

    public void setJogador1aluminio(int linha, int coluna) {tabuleirojogador1[linha][coluna] = 10;}

    public void setJogador1madeira(int linha, int coluna) { tabuleirojogador1[linha][coluna] = 5;}

    public void setJogador2ouro(int linha, int coluna) {tabuleirojogador2[linha][coluna] = 50;}

    public void setJogador2bronze(int linha, int coluna) { tabuleirojogador2[linha][coluna] = 40;}

    public void setJogador2platina(int linha, int coluna) {tabuleirojogador2[linha][coluna] = 30;}

    public void setJogador2gelo(int linha, int coluna) {tabuleirojogador2[linha][coluna] = 20;}

    public void setJogador2aluminio(int linha, int coluna) {tabuleirojogador2[linha][coluna] = 10;}

    public void setJogador2madeira(int linha, int coluna) {tabuleirojogador2[linha][coluna] = 5;}


    public String jogar1(int x, int y) {
        if (tabuleirojogador2[x][y] == 0) {
            return "Você errou";
        } else {
            p = tabuleirojogador2[x][y];
            pontuaçaojogador1 += tabuleirojogador2[x][y];
            tabuleirojogador2[x][y] = 0;
            p1++;
            if (p == 50) {
                return "Você acertou a espada de ouro, com isso ela foi retirada do campo de batalha" + p1+"xxx";
            } else if (p == 40) {
                return "Você acertou a espada de bronze, com isso ela foi retirada do campo de batalha";
            } else if (p == 30) {
                return "Você acertou a espada de platina, com isso ela foi retirada do campo de batalha";
            } else if (p == 20) {
                return "Você acertou a espada de gelo, com isso ela foi retirada do campo de batalha";
            } else if (p == 10) {
                return "Você acertou  a espada de aluminio, com isso ela foi retirada do campo de batalha";
            } return "Você acertou  a espada de madeira, com isso ela foi retirada do campo de batalha";
        }
    }

    public String jogar2(int x, int y) {
        if (tabuleirojogador1[x][y] == 0) {
            return "Você errou";
        } else {
            u = tabuleirojogador1[x][y];
            pontuaçaojogador2 += tabuleirojogador1[x][y];
            tabuleirojogador1[x][y] = 0;
            p2++;
            if (u == 50) {
                return "Você acertou a espada de ouro, com isso ela foi retirada do campo de batalha";
            } else if (u == 40) {
                return "Você acertou a espada de bronze, com isso ela foi retirada do campo de batalha";
            } else if (u == 30) {
                return "Você acertou a espada de platina, com isso ela foi retirada do campo de batalha";
            } else if (u == 20) {
                return "Você acertou a espada de gelo, com isso ela foi retirada do campo de batalha";
            } else if (u == 10) {
                return "Você acertou  a espada de aluminio, com isso ela foi retirada do campo de batalha";
            }return "Você acertou  a espada de madeira, com isso ela foi retirada do campo de batalha";
        }
    }

    public int pontuacaojogador1() {
        return pontuaçaojogador1;
    }
    public int pontuacaojogador2() {
        return pontuaçaojogador2;
    }
    public int getP1() {
        return p1;
    }
    public int getP2() {
        return p2;
    }
}
