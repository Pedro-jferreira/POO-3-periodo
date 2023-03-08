package aulas.aula0703;

public class main1 {
    public static void main(String[] args) {
        
        Carro carro = new Carro("4x4", "azul", "pxc0202", 4);
        Pessoa pessoa = new Pessoa("claudia", "preto", "sei nao", 19,carro);
        System.out.println(carro);
        System.out.println("\n\n\n\n"+pessoa);
  carro.setPropietario(pessoa);
        System.out.println("\n\n\n\n"+pessoa);
    }    
}
