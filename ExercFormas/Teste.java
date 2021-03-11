package ExercFormas;

/**
 * 
 * @author : Vitor Theodoro
 * 
 * 
 * */

import java.util.Scanner;

public class Teste {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        CaixadeBrinquedo array = new CaixadeBrinquedo();
        
        biDimensional triangulo = new Triangulo(5,10);
        array.addValores(triangulo);

        biDimensional quadrado = new Quadrado(5,10);
        array.addValores(quadrado);

        biDimensional circulo = new Circulo(5);
        array.addValores(circulo);
        
        biDimensional circulo2 = new Circulo(10);
        array.addValores(circulo2);

        Tridimensional tetraedro = new Tetraedro(1);
        array.addValores(tetraedro);
        array.addValoresTri(tetraedro);

        Tridimensional cubo = new Cubo(1);
        array.addValores(cubo);
        array.addValoresTri(cubo);

        Tridimensional esfera = new Esfera(3);
        array.addValores(esfera);
        array.addValoresTri(esfera);

        System.out.println("Atenção Primeira letra maiuscula/Escreva corretamente o nome da forma");
        System.out.println("digite a forma que voce quer procurar: ");
        array.addFormaPedida(input.nextLine());
        array.calcular();

        
        input.close();
        
    }
    
}
