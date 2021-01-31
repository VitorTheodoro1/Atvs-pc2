package ExercAgenda;


import java.util.ArrayList;

public class Agenda {

    private static ArrayList<Contato> nomes= new ArrayList<Contato>();

    public Agenda(){

    }

    static public void adicionarNome(Contato x){
        nomes.add(x);
    }

    static public int numeroTotal(){
        int b = nomes.size();

        return b;
    }

    static public String exibirContato(String n) {
        String saida = "";
        for(Contato x : nomes){
            if(x.getNome().equalsIgnoreCase(n)){
                saida += x.imprimir() + "\n";
            }
        }
        return saida;
     }

     static public void excluirContato(String v){
         for(Contato x : nomes){
            if(x.getNome().equalsIgnoreCase(v)){
                nomes.remove(x);
            }
         }
     }

     static public String exibirAll(){
         String said ="";
        for(Contato x : nomes){
            said += x.imprimir() + "\n";
            }
            return said;
        }

 }
 

    
