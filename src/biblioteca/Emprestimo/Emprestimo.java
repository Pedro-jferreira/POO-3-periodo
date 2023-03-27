package biblioteca.Emprestimo;

import biblioteca.Produto.Livro;
import biblioteca.Produto.Obra;
import biblioteca.Usuario.Usuario;

import java.io.Serializable;

public class Emprestimo implements Serializable {

    private String DatadoEmprestimo;
    private int hora;
    private Obra obra;
    private Usuario usuario;

    public Emprestimo(String datadoEmprestimo, int hora, Obra obra, Usuario usuario) {
        DatadoEmprestimo = datadoEmprestimo;
        this.hora = hora;
        this.obra = obra;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "DatadoEmprestimo='" + DatadoEmprestimo + '\'' +
                ", hora=" + hora +
                ", obra=" + obra +
                ", usuario=" + usuario +
                '}';
    }
}
