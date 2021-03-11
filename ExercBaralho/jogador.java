package ExercBaralho;

public class jogador {
    private carta[] mao;
    public Object mostrarC;
    carta aux_maior = new carta();

    public jogador() {

    }

    // mesa
    public carta jogar() {
        for (carta carta : mao) {
            if (carta.comparaValor(aux_maior) == 1) {
                aux_maior = carta;
            }
        }
        return aux_maior;
    }

    public void receberCartas(carta[] cartas) {
        mao = cartas;

    }

    public carta[] getMao() {
        return mao;
    }

    public void setMao(carta[] mao) {
        this.mao = mao;
    }

    public carta mostrarCartaDaMao(int posicao) {
        return mao[posicao];
    }

    public String mostrarMao() {
        String retorno = "";
        for (carta carta : mao) {
            retorno = retorno + "  " + carta.getValor() + "-" + carta.getNaipe();
        }
        return retorno;
    }

}
