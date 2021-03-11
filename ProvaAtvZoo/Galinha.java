package ProvaAtvZoo;

public class Galinha extends Animal {

    public Galinha() {
        super();
    }

    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        this.meuOrcamentoMensal.adicionarGasto(descricao, valor);
        return this.meuOrcamentoMensal;
    }

}
