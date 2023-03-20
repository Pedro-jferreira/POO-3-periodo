package aula_14_03;

public class ProfHorista extends Professor{
    private double salariohora;

    public double getSalariohora() {
        return salariohora;
    }
    public double getSalario() {
        return (getSalariohora() * getCargahoraria()*4.5);
    }



    public void setSalariohora(double salariohora) {
        this.salariohora = salariohora;
    }

    public ProfHorista(String nome, int matricula, int cargahoraria, double salariohora) {
        super(nome, matricula, cargahoraria);
        this.salariohora = salariohora;
    }

    public ProfHorista() {}

    @Override
    public String toString() {
        return super.toString()+ "\n Salario hora: "+salariohora+
                "\n salario: "+ getSalario();
    }
}
