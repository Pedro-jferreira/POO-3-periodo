package biblioteca.Produto;

import biblioteca.Produto.Obra;

import java.io.Serializable;

public class Fotografia extends Obra implements Serializable {
    public Fotografia(String nomeobra, String autor) {
        super(nomeobra, autor);
    }
}
