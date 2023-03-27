package biblioteca.Usuario;


import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable {
    private String curso,turma;

    public Aluno(String nome, String cpf, String matricula, String curso, String turma) {
        super(nome, cpf, matricula);
        this.curso = curso;
        this.turma = turma;
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
        super.setNome(nome);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", turma='" + turma + '\'' +

                '}';
    }
}

