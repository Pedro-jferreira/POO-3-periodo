package aula_14_03;

public class Professor {

    private String nome;
    private int matricula;
    private int cargahoraria;
    private  double salario;

    public double getSalario() {
        return 0;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public Professor(String nome, int matricula, int cargahoraria) {
        this.nome = nome;
        this.matricula = matricula;
        this.cargahoraria = cargahoraria;
    }
    public Professor(){}

    @Override
    public String toString() {
        return "<<<<<<Professor>>>>>"+
                "\n nome: " + nome +
                "\n matricula: " + matricula +
                "\n carga horaria: " + cargahoraria;
    }
}
