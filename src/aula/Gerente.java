package aula;

public class Gerente extends  Funcionario{

    int sala;
// get e set
    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    //contrutores


    public Gerente(String nome, String rg, String cartao, double salario, int sala) {
        super(nome, rg, cartao, salario);
        this.sala = sala;
    }
    public Gerente() {
    }


    @Override
    public String toString() {
        return super.toString()+"\nSala: "+sala;
    }
}
