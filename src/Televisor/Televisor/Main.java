package Televisor;

public class Main {
    public static void main(String[] args) {
        new Arquivos().VerificarArq();
        Televisor televisor = new Televisor();
        televisor.setVolume("==");
        televisor.setCanais(-2000,"==");
        new ScreenTelevisor();
    }
}