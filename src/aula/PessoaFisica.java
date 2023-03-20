package aula;

public class PessoaFisica extends Pessoa{
    private String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


    public PessoaFisica(String nome, String rg) {
        super(nome);
        this.rg = rg;
    }
    public PessoaFisica() {
    }

    @Override
    public String toString() {
        return super.toString()+"\nRg: "+rg;
    }
}
