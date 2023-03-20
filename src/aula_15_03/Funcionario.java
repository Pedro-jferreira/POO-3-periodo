package aula_15_03;

import java.util.Calendar;

public class Funcionario extends Pessoa{
    private String matricula;
    private String datadeadimissao;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String datadenascimento, String matricula, String datadeadimissao, double salario) {
        super(nome, cpf, datadenascimento);
        this.matricula = matricula;
        this.datadeadimissao = datadeadimissao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDatadeadimissao() {
        return datadeadimissao;
    }

    public void setDatadeadimissao(String datadeadimissao) {
        this.datadeadimissao = datadeadimissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n\n Funcionario>>>\n" +
                "\n matricula: " + matricula +
                "\n datadeadimissao: " + datadeadimissao+
                "\n salario: " + salario;
    }
}
