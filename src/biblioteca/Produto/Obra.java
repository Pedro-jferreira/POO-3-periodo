package biblioteca.Produto;

import java.io.Serializable;

public class Obra implements Serializable {
protected String nomeobra;
protected String autor;

    public Obra(String nomeobra, String autor) {
        this.nomeobra = nomeobra;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "nomeobra='" + nomeobra + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public String getNomeobra() {
        return nomeobra;
    }

    public void setNomeobra(String nomeobra) {
        this.nomeobra = nomeobra;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
