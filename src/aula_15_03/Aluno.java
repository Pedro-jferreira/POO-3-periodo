package aula_15_03;

import java.util.Calendar;
import java.util.Date;

public class Aluno extends  Pessoa{
    private String matricula;

    public Aluno(String pedro, String cpf, Date time, String matricula) {
    }

    public String getMatricula() {
        return matricula;
    }

    public Aluno(String nome, String cpf, String datadenascimento, String matricula) {
        super(nome, cpf, datadenascimento);
        this.matricula = matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\n Aluno>>>>\n" +
                "\n matricula: " + matricula;
    }
    void MostrarAluno() {
        System.out.println("\n ALUNO CADASTRADO>>>>> \n\n"+toString()+"\n<<<<<<<<<<><><><><><><><><><><><>>>>>>>>>>");
    }
}
