package ProvaAtvZoo;

public class Macaco extends Animal {

    public Macaco() {
        super();
    }

    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        this.meuOrcamentoMensal.adicionarGasto(descricao, valor);
        return this.meuOrcamentoMensal;
    }

}
