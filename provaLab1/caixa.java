/**
 *         PROGRAMAÇÃO DE COMPUTADORES II
 *             1aProva – Valor 15 pontos
 * 
 * @author: 
 * Vitor Theodoro Rocha Domingues
 * Henrique Pereira Cristófaro
 * Jefferson Costa Lima Silva
 * 
 */

package provaLab1;

import java.util.Scanner;

public class caixa {

    public static void main(String[] args){

    int ajd=1;
    estoque estoque = new estoque();
    Scanner input = new Scanner(System.in);


    produto objProduto = new produto(11111,"Detergente ABC",1.00);
    estoque.adicionarProduto(objProduto);
    objProduto = new produto(22222,"sabão em pó OMO",6.50);
    estoque.adicionarProduto(objProduto);
    objProduto = new produto(33333,"Shampoo Beleza Fácil",12.00);
    estoque.adicionarProduto(objProduto);
    objProduto = new produto(44444,"Creme dental Colgate",3.50);
    estoque.adicionarProduto(objProduto);
    objProduto = new produto(55555,"Sabonete Nívea",1.80);
    estoque.adicionarProduto(objProduto);
    objProduto = new produto(66666,"Biscoito Maizena",2.00);
    estoque.adicionarProduto(objProduto);
    objProduto = new produto(77777,"Leite desnatado Parmalat",3.00);
    estoque.adicionarProduto(objProduto);
    
 while(ajd!=0){
    System.out.println("Digite o codigo do produto que deseja comprar:");
    ajd = input.nextInt();
        if(estoque.temNoEstoque(ajd)==1){ 
            System.out.println("Digite a qtd que deseja comprar do respectivo produto:");
            int qtd = input.nextInt();
            String help = estoque.returnDescricao(ajd);
            double v = estoque.returValor(help);
            venda venda = new venda(help,qtd,v);
            venda.calcularPreco();
        }
        else if (ajd==0){
            break;
           
        }
        else {
            System.out.println("Codigo invalido digite outro:");
        }
    }

    System.out.println(venda.precoFinal());
   
    input.close();

}
}
