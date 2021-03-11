package ExercSuporteTecnico;

import java.util.Scanner;

public class callCenter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int cont = 1;

        suporteTecnico st = new suporteTecnico();
        interpretadora in = new interpretadora();

        while (cont == 1) {
            System.out.println("Descrição do problema: ");
            String ajd = input.nextLine();
            
            String help = (st.buscarSolucao(in.interpretarProblema(ajd)));
            if (help.equals("x")) {
                System.out.println(st.buscarSolucaoPadrao());
            } else {
                System.out.println(help);
            }
            System.out.println("\nPressione <enter> para continuar ou digite 'sair' para sair do sistema.");
            String sair = input.nextLine();
            if (sair.equals("sair")) {
                cont = 0;
            }
        }

        input.close();

    }
}
