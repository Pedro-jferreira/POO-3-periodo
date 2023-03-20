package composicao;

public class Motor {
    private float potencia;
    private String combustivel;
    private int chassi;

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }


    public Motor(float potencia, String combustivel, int chassi) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.chassi = chassi;
    }

    public Motor() {
    }


    @Override
    public String toString() {
        return  "\n Motor >>>>>>"+
                "\n potencia: " + potencia +
                ",\n combustivel: " + combustivel +
                ",\n chassi: " + chassi;
    }
}
