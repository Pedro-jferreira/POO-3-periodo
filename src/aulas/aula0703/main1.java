package aulas.aula0703;

public class main1 {
    public static void main(String[] args) {

        Carro carro = new Carro("4x4", "azul", "pxc0202", 4);
        Pessoa pessoa = new Pessoa("pedro ferreira", "70718430158", "masculino", 20, carro);
        carro.setProprietario(pessoa);

        System.out.println(pessoa);
        System.out.println("\n\n"+carro+"\n\n");

        pessoa.Ligar();
        pessoa.usarcambio(0);
        pessoa.getCarro().setCambio(1);
        pessoa.usarcambio(2);
        pessoa.Acelerar();
        pessoa.Freiar();
        pessoa.Desligar();

    }    
}
