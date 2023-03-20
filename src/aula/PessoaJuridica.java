package aula;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public PessoaJuridica() {}

    @Override
    public String toString() {
        return super.toString()+"\nCnpj: "+cnpj;
    }
}
