package aula;

public class Secretaria extends Funcionario{
    String ramal;

    public String getRamal() {
        return ramal;
    }

    public void setRamal(String ramal) {
        this.ramal = ramal;
    }


    public Secretaria(String nome, String rg, String cartao, double salario, String ramal) {
        super(nome, rg, cartao, salario);
        this.ramal = ramal;
    }

    public Secretaria() {}

    @Override
    public String toString() {
        return super.toString()+"\nRamal: "+ramal;
    }
}
