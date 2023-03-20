package biblioteca;

public class Aluno extends Pessoa{
    private String matricula, curso,sala;

    @Override
    public String getNome() {
        return super.getNome();
    }

    public Aluno(String nome, String cpf, String idade, String matricula, String curso, String sala) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.curso = curso;
        this.sala = sala;
    }
    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                ", sala='" + sala + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}

