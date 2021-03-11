
package ProvaAtvZoo;

import java.util.ArrayList;

public class ItemOrcamentoComplexo {

    private ArrayList<String> gastos;
    private double valorTotal;

    public ItemOrcamentoComplexo(ArrayList<String> gastos, double total) {
        this.gastos = gastos;
        this.valorTotal = total;
    }

    public ItemOrcamentoComplexo() {
        this.gastos = new ArrayList<String>();
        this.valorTotal = 0;
    }

    public void adicionarGasto(String descricao, double valor) {
        this.gastos.add(descricao);
        this.valorTotal = this.valorTotal + valor;
    }

    public ArrayList<String> getGastos() {
        return this.gastos;
    }

    public void setGastos(ArrayList<String> gastos) {
        this.gastos = gastos;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean existeEmOrcamento(String descricao) {
        for (String d : this.gastos) {
            if (d == descricao)
                return true;
        }
        return false;
    }

}
