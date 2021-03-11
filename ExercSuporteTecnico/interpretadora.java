package ExercSuporteTecnico;

import java.util.HashSet;

public class interpretadora {

    private HashSet<String> palavraChave = new HashSet<String>();

    public HashSet<String> interpretarProblema(String problema) {

        String[] palavras = problema.split(" ");
        for (String x : palavras) {
            palavraChave.add(x);
        }
        return palavraChave;

    }

}
