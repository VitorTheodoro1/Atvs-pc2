package ExercAgenda;

import java.util.HashMap;

public class novaAgenda {

        HashMap<String,contato> nomes = new HashMap<String,contato>();
    
        public novaAgenda() {
    
        }
    
        public void adicionarNome(String y,contato x) {
            nomes.put(y, x);
        }
    
        public int numeroTotal() {
            int b = nomes.size();
    
            return b;
        }
    
        public String exibirContato(String n) {
            String saida = "";
            for (contato x : nomes.values()) {
                if (x.getNome().equals(n)) {
                    saida += x.imprimir() + "\n";
                }
            }
            return saida;
        }
    
        public void excluirContato(String v) {
            for (String x : nomes.keySet()) {
                if (x.equals(v)) {
                    nomes.remove(x);
                }
            }
        }
    
        public String exibirAll() {
            String said = "";
            for (contato x : nomes.values()) {
                said += x.imprimir() + "\n";
            }
            return said;
        }
    
}
