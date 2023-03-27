package biblioteca.Produto;

import java.io.Serializable;

public class MidiaAudio extends Livro implements Serializable {
    public MidiaAudio(String nomeobra, String autor, String editora, String categoria) {
        super(nomeobra, autor, editora, categoria);
    }
}
