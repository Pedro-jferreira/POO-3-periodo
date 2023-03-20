package aula_14_03;

public class ProfDe extends Professor{
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ProfDe(String nome, int matricula, double salario) {
        super(nome, matricula,40);
        this.salario = salario;
    }

    public ProfDe() {}

    @Override
    public String toString() {
        return super.toString()+ "\n salario: "+ salario;
    }
}

