package biblioteca.Produto;

import biblioteca.Produto.Obra;

import java.io.Serializable;

public class Livro extends Obra implements Serializable {
    private String   Editora, categoria, Ano, Edicao, Ndepaginas;
    private boolean Emprestimo;

    public Livro(String nomeobra, String autor, String editora, String categoria) {
        super(nomeobra, autor);
        Editora = editora;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Editora='" + Editora + '\'' +
                ", categoria='" + categoria + '\'' +
                ", nomeobra='" + nomeobra + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isEmprestimo() {
        return Emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        Emprestimo = emprestimo;
    }
}


