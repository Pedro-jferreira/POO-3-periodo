package biblioteca.Usuario;

import biblioteca.Usuario.Pessoa;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Serializable {

    protected String salario,setor;

    public Funcionario(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String matricula, String salario, String setor) {
        super(nome, cpf, matricula);
        this.salario = salario;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salario='" + salario + '\'' +
                ", setor='" + setor + '\'' +
                '}';
    }

    @Override
    public String Imprimir() {
        return super.Imprimir();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


}
