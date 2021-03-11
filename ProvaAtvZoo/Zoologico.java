
package ProvaAtvZoo;


import java.util.ArrayList;

public class Zoologico {
    private ArrayList<AnimalOrcamento> animaisOrcamentos;

    public Zoologico() {
        this.animaisOrcamentos = new ArrayList<AnimalOrcamento>();
    }

    public void addAnimalOrcamento(AnimalOrcamento animalOrcamento) {
        this.animaisOrcamentos.add(animalOrcamento);
    }

    public ArrayList<AnimalOrcamento> obtemAnimaisComDescricao(String descricao) {
        ArrayList<AnimalOrcamento> retorno = new ArrayList<AnimalOrcamento>();

        for (AnimalOrcamento animal : this.animaisOrcamentos) {
            ItemOrcamentoComplexo orcamentoAnimal = animal.orcamentoGastosAnimal("", 0.0);
            if (orcamentoAnimal.existeEmOrcamento(descricao)) {
                retorno.add(animal);
            }
        }

        return retorno;
    }
}
