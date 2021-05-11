package Prova;


public class MeuVetor {
    private Produto lista[];
    private int tam;
    private int indice = 0;

    public MeuVetor(int capacidadeInicial) {
        // lista[capacidadeInicial];
        lista = new Produto[capacidadeInicial];
    }

    public boolean add(Produto obj) {
        lista[indice] = obj;
        indice++;
        return true;
    }

    public int size() {
        for (int i = 0; i <= indice; i++) {
            tam = i;
        }
        return tam;
    }

    public Produto get(int val) {
        Produto c;// = new Produto("", 0.0);
        c = lista[val];
        return c;
    }

    public int alvo(String descricao) {
        boolean existe = false;
        int i;
        for (i = 0; i < indice && !existe; i++) {
            if (descricao.equals(lista[i].getDescricao())) {
                existe = true;
            }
        }
        return i;

    }

    public void remove(int w) {
        // vetor[indice];
        for (int i = w; i < indice - 1; i++) {
            lista[i] = lista[i + 1];

        }
        indice--;
    }

    public void imprimir() {
        for (int i = 0; i < indice; i++) {
            System.out.println(lista[i].getDescricao() + " " + lista[i].getPreco());
        }
    }

}
