package biblioteca;

public class Funcionario extends Pessoa{

    protected String salario, matricula;

    public Funcionario(String nome, String cpf, String idade, String salario, String matricula) {
        super(nome, cpf, idade);
        this.salario = salario;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario='" + salario + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
