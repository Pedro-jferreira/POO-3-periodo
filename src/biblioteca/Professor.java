package biblioteca;

public class Professor extends Funcionario{
    private String formacao, turno,materiaaulas;

    @Override
    public String getNome() {
        return super.getNome();
    }

    public Professor(String nome, String cpf, String idade, String salario, String matricula, String formacao, String turno, String materiaaulas) {
        super(nome, cpf, idade, salario, matricula);
        this.formacao = formacao;
        this.turno = turno;
        this.materiaaulas = materiaaulas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "formacao='" + formacao + '\'' +
                ", turno='" + turno + '\'' +
                ", materiaaulas='" + materiaaulas + '\'' +
                ", salario='" + salario + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
}
