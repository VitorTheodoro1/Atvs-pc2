package ProvaAtvZoo;

public class Urso extends Animal {

    public Urso() {
        super();
    }

    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        this.meuOrcamentoMensal.adicionarGasto(descricao, valor);
        return this.meuOrcamentoMensal;
    }

}
