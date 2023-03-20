package composicao;

public class Automovel {
    Motor motor;
    Direcao direcao;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }


    public Automovel(Motor motor, Direcao direcao) {
        this.motor = motor;
        this.direcao = direcao;
    }


    @Override
    public String toString() {
        return "\n<<<<<<<Automovel>>>>>>"+motor + direcao;
    }
}
