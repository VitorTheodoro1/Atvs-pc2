package Prova;

public class Produto {
    String descricao;
    double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    /*
     * public String imprimir(Produto x) {
     * 
     * return "Descricao: " + descricao + "\n preço: : " + preco;
     * 
     * }
     */
}