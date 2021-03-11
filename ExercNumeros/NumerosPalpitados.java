package ExercNumeros;

import java.util.ArrayList;

public class NumerosPalpitados {

    ArrayList<Integer> vetor = new ArrayList<Integer>();

	public void addNumTentativas(int numAdivinha) {
        vetor.add(numAdivinha);
        
	}

    public ArrayList<Integer> todosValores(){
        return vetor;
    }
    
}
