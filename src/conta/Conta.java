package conta;

public class Conta {

    private  int numero;
    private double saldo;
    private double limite;
    private String nome;


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
 

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

//<<<<<<<<<<<<<<<methods>>>>>>>>>>>>>>>>>>>>>
    
    public boolean Sacar(double valor)
    {
        if(getSaldo()>= valor)
        {
            setSaldo(getSaldo()-valor);
            System.out.println("operação efetuada com sucesso");
            return true;
        }else
        {            
            System.out.println("erro");
            return false;
        }
      
    }

    public void depositar(double valor)
    {
        setSaldo(getSaldo()+valor);
    }

    public void transfere(Conta destino, double valor)
    {
        if( Sacar(valor))
        { 
            destino.depositar(valor);           
        }else
        {
            System.out.println("valor fora do permitido");
        }
    }   
    

    public Conta(int numero, double saldo, double limite, String nome) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.nome = nome;
    }

    public Conta() {}
    public Conta(int numero, String nome) {
        this.numero = numero;
        this.nome =  nome;
    }
}