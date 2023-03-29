package biblioteca.Usuario;

import java.io.Serializable;

public class Professor extends Funcionario  {
  
    private String formacao;

    public Professor() {
    }

    public Professor(String nome, String cpf, String matricula) {
        super(nome, cpf, matricula);
    }

    public Professor(String nome, String cpf, String matricula, String salario, String setor, String formacao) {
        super(nome, cpf, matricula, salario, setor);
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", salario='" + salario + '\'' +
                ", setor='" + setor + '\'' +
                ", formacao='" + formacao + '\'' +
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

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
