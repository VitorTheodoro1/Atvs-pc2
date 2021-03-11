package ProvaAtvZoo;


public abstract class Animal implements AnimalOrcamento {
    protected ItemOrcamentoComplexo meuOrcamentoMensal;

    public Animal() {
        this.meuOrcamentoMensal = new ItemOrcamentoComplexo();
    }
}
