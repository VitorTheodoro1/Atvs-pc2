// Henrique Pereira Cristofaro
// Vitor Theodoro Rocha Domingues

package ProvaAtvZoo;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        Galinha g = new Galinha();
        g.orcamentoGastosAnimal("vacina X", 1.0);
        g.orcamentoGastosAnimal("vacina Y", 1.0);
        g.orcamentoGastosAnimal("vacina W", 1.0);
        zoo.addAnimalOrcamento(g);

        Macaco m = new Macaco();
        m.orcamentoGastosAnimal("vacina X", 5.0);
        m.orcamentoGastosAnimal("vacina Y", 3.0);
        m.orcamentoGastosAnimal("vacina W", 7.0);
        zoo.addAnimalOrcamento(m);

        Urso u = new Urso();
        u.orcamentoGastosAnimal("vacina X", 5.0);
        u.orcamentoGastosAnimal("vacina Y", 3.0);
        u.orcamentoGastosAnimal("vacina Z", 7.0);
        zoo.addAnimalOrcamento(u);

        Tigre t = new Tigre();
        t.orcamentoGastosAnimal("vacina D", 2.5);
        t.orcamentoGastosAnimal("vacina F", 7.0);
        t.orcamentoGastosAnimal("vacina J", 8.5);
        zoo.addAnimalOrcamento(t);

        Leao l = new Leao();
        l.orcamentoGastosAnimal("vacina E", 7.0);
        l.orcamentoGastosAnimal("vacina D", 1.0);
        l.orcamentoGastosAnimal("vacina Q", 2.0);
        zoo.addAnimalOrcamento(l);

        ArrayList<AnimalOrcamento> arr = zoo.obtemAnimaisComDescricao("vacina W");

        System.out.println(arr.size());

        System.out.println("Apenas Leao, Macaco e Galinha possuem vacina W");
    }
}
