package conta;

public class testaConta{
    public static void main(String[] args) {
        Conta origem = new Conta();
        Conta destino = new Conta();
        origem.setSaldo(1000);
        destino.setSaldo(500);
        System.out.println("saldo origem: "+ origem.getSaldo());
        System.out.println("saldo destino: "+ destino.getSaldo());
        origem.Sacar(50);
        destino.depositar(500);
        origem.transfere(destino, 200);
        System.out.println("saldo origem: "+ origem.getSaldo());
        System.out.println("saldo destino: "+ destino.getSaldo());
        Conta novaconta= new Conta(202,1000000,10000, "tua mae");
        System.out.println(novaconta.getSaldo());
    }




}