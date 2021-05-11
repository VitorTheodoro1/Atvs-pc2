package prova3;

import java.util.ArrayList;

public class Detran {

    private ArrayList<Veiculo> veiculos;
    private ArrayList<Proprietario> proprietarios;

    public boolean adicionaProp (Proprietario prop){
        int pos = procuraProPrietario(prop.getCpf());
        if(pos != 1){
            proprietarios.add(prop);
            return true; // proprietario adicionados
        } else return false; // proprietario já existe
    }

    private int procuraProPrietario(Object cpf) {
        return 0;
    }
    
    
}
