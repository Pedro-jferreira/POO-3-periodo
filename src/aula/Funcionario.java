package aula;

public class Funcionario extends  PessoaFisica{
    private String cartao;
    private double salario;


    public String getCartao() {
        return cartao;
    }
    public void setCartao(String cartao) {
        this.cartao = cartao;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }




    public Funcionario(String nome, String rg, String cartao, double salario) {
        super(nome, rg);
        this.cartao = cartao;
        this.salario = salario;
    }
    public Funcionario() {
    }



    @Override
    public String toString() {
        return super.toString()+"\nSalario: "+salario+"\nCartao: "+cartao;
    }
}
