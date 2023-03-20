package composicao;

public class Direcao {
    private String cor;
    private int tamanhoraio;
    private boolean kitmultimidia;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanhoraio() {
        return tamanhoraio;
    }

    public void setTamanhoraio(int tamanhoraio) {
        this.tamanhoraio = tamanhoraio;
    }

    public boolean isKitmultimidia() {
        return kitmultimidia;
    }

    public void setKitmultimidia(boolean kitmultimidia) {
        this.kitmultimidia = kitmultimidia;
    }


    public Direcao(String cor, int tamanhoraio, boolean kitmultimidia) {
        this.cor = cor;
        this.tamanhoraio = tamanhoraio;
        this.kitmultimidia = kitmultimidia;
    }

    public Direcao() {
    }


    @Override
    public String toString() {
        return "\n Direcao>>>>>>" +
                "\n Cor: " + cor +
                "\n Tamanho do raio: " + tamanhoraio +
                "\n Kit Multimidia: " + kitmultimidia;
    }
}
