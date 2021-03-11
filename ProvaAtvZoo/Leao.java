package ProvaAtvZoo;

public class Leao extends Animal {

    public Leao() {
        super();
    }

    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        this.meuOrcamentoMensal.adicionarGasto(descricao, valor);
        return this.meuOrcamentoMensal;
    }

}
