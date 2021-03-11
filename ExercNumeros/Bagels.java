package ExercNumeros;

import java.util.ArrayList;

public class Bagels {

    char[] numeroEscolhido;
    char[] numeroAdivinha;
    int finish = 0;
    int vezes=0;
    NumerosPalpitados vetor = new NumerosPalpitados();

    public void setNumEscolhido(int numEscolhido) {
        String number = String.valueOf(numEscolhido);
        numeroEscolhido = number.toCharArray();
    }

    public void setNumAdivinha(int numAdivinha) {

        String number = String.valueOf(numAdivinha);
        numeroAdivinha = number.toCharArray();

    }

    public ArrayList<String> Desvendar() {

        ArrayList<String> respostas = new ArrayList<String>();
        vezes++;
        finish = 0;

        if (numeroAdivinha[0] == numeroEscolhido[0]) {
            respostas.add("Fermi");
            finish++;
        }
        if (numeroAdivinha[0] == numeroEscolhido[1]) {
            respostas.add("Pico");
        }
        if (numeroAdivinha[0] == numeroEscolhido[2]) {
            respostas.add("Pico");
        }
        if (numeroAdivinha[1] == numeroEscolhido[1]) {
            respostas.add("Fermi");
            finish++;
        }
        if (numeroAdivinha[1] == numeroEscolhido[0]) {
            respostas.add("Pico");
        }
        if (numeroAdivinha[1] == numeroEscolhido[2]) {
            respostas.add("Pico");
        }
        if (numeroAdivinha[2] == numeroEscolhido[2]) {
            respostas.add("Fermi");
            finish++;
        }
        if (numeroAdivinha[2] == numeroEscolhido[0]) {
            respostas.add("Pico");
        }
        if (numeroAdivinha[2] == numeroEscolhido[1]) {
            respostas.add("Pico");
        }
        if (respostas.size() == 0) {
            respostas.add("Bagels");
        }

        return respostas;
    }

    public int conferirTermino() {
        if (finish == 3) {
            return 1;
        }
        return 0;
    }

    public int getVezes(){
        return vezes;

    }

}
