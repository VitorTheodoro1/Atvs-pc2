
package ProvaAtvZoo;

public class Tigre extends Animal {

    public Tigre() {
        super();
    }

    @Override
    public ItemOrcamentoComplexo orcamentoGastosAnimal(String descricao, double valor) {
        this.meuOrcamentoMensal.adicionarGasto(descricao, valor);
        return this.meuOrcamentoMensal;
    }

}
