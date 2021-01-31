package ExercAgenda;

/**
 * 
 * 
 * @author: Vitor Theodoro
 */
 
//import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);

        Contato objContato;
        String nome,email;
        int numero;
        int x;

        //Contato contato = new Contato();
        //Agenda agenda = new Agenda();

        do{
            System.out.println("Selecione a opção desejada: \n(1)-Insere novo contato na agenda\n(2)-Exibe o número total de contatos da agenda\n(3)-Exibe um contato (pesquisa pelo nome)\n(4)-Exclui um contato (pesquisa pelo nome)\n(5)-Exibe todos os contatos da agenda\n(0)-Sair");
            x = input.nextInt();

            switch(x){
                case 1: //inserir novo contato
                System.out.println("digite o nome:");
                nome = inputString.nextLine();
                System.out.println("digite o numero:");
                numero = input.nextInt();
                System.out.println("digite o email:");
                email = inputString.nextLine();

                objContato = new Contato(numero, nome, email);

                Agenda.adicionarNome(objContato);
                break;
                
                case 2://numero total de contatos
                System.out.println("O numero de livros listados e :");
                System.out.println(Agenda.numeroTotal());
                break;

                case 3://Exibe um contato 
                System.out.println("digite o nome para pesquisar:"); 
                String ajd = inputString.nextLine();
                System.out.println(Agenda.exibirContato(ajd));
                //System.out.println(imprimir());
                break;

                case 4://excluir um contato
                System.out.println("digite um contato para excluir");
                String help = inputString.nextLine();
                Agenda.excluirContato(help);
                break;

                case 5://exibe todos os contatos
                System.out.println(Agenda.exibirAll());
                break;

            }
        }

        while(x!=0);








            input.close();
            inputString.close();

    }


    
}
