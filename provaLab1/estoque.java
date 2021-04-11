package provaLab1;

import java.util.ArrayList;


public class estoque {

    ArrayList<produto> codigo = new ArrayList<produto>();
 
    public void adicionarProduto(produto x) {
        codigo.add(x);
    }

    public int temNoEstoque(int x){
        for(produto b : codigo){
            if(b.getCodigo()==x){
                return 1;   
            }
        }
        return 0;
    }

    public String returnDescricao(int u){
        String help = "";
        for(produto b : codigo){
            if(b.getCodigo()==u){
               help = b.getDescricao();
            }
        }
        return help;
    }

    public double returValor(String x){
        double help = 0;
        for(produto b : codigo){
            if(b.getDescricao()==(x)){
               help = b.getValor();
            }
        }
      return help;
    }

    
}
