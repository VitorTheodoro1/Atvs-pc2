package provaLab1;

import java.util.ArrayList;


public class venda {

    private int quantd;
    ArrayList<String> produto = new ArrayList<String>();
    int vetor[] = new int[10];
    private double valorP;
    private int i=0;
    private static double total = 0.0;
    //private estoque estoque = new estoque();

    public venda(String descricao, int qtd, double valor) {
        produto.add(descricao);
        vetor[i] = qtd;
        quantd = qtd;
        valorP = valor;
        i++;
    }

    public void calcularPreco() {
      total = total + (valorP*quantd);
    }
 
    static public double precoFinal() {
        return total;
    }
    
}
