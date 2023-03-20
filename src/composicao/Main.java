package composicao;

public class Main {
    public static void main(String[] args) {

        Automovel automovel = new Automovel(new Motor(1.0F, "gasolina", 254546565),new Direcao("preto", 25, true));
        System.out.println(automovel);

    }
}
