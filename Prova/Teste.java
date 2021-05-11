package Prova;

public class Teste {
    private static MeuVetor listaC;

    public static void main(String[] args) {
        int num;
        Produto one = new Produto("Arroz integral", 8.50);
        Produto two = new Produto("Feijao Preto", 4.00);
        Produto three = new Produto("Cachaca da boa", 7.50);

        listaC = new MeuVetor(3);
        // a
        listaC.add(one);
        listaC.add(two);
        listaC.add(three);
        listaC.imprimir();
        System.out.println();

        // b
        num = listaC.alvo("Cachaca da boa");
        listaC.remove(num);
        // c
        listaC.imprimir();

    }

}
