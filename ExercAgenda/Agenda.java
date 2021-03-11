package ExercAgenda;

import java.util.ArrayList;

public class agenda {

    ArrayList<contato> nomes = new ArrayList<contato>();

    public agenda() {

    }

    public void adicionarNome(contato x) {
        nomes.add(x);
    }

    public int numeroTotal() {
        int b = nomes.size();

        return b;
    }

    public String exibirContato(String n) {
        String saida = "";
        for (contato x : nomes) {
            if (x.getNome().equals(n)) {
                saida += x.imprimir() + "\n";
            }
        }
        return saida;
    }

    public void excluirContato(String v) {
        for (contato x : nomes) {
            if (x.getNome().equalsIgnoreCase(v)) {
                nomes.remove(x);
            }
        }
    }

    public String exibirAll() {
        String said = "";
        for (contato x : nomes) {
            said += x.imprimir() + "\n";
        }
        return said;
    }

}
