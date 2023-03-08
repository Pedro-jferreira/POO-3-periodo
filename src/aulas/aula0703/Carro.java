package aulas.aula0703;

public class Carro {
	private String tipo;
	private String cor;
	private String placa;
	private int numPortas;
	private Pessoa proprietario;
	private int cambio;
	private int marcha;

	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}


	public int getCambio() {
		System.out.println("marcha: "+this.cambio);
		return cambio;
	}
	public void setCambio(int marcha) {
		this.cambio = marcha;
	}
	void Ligar(){
	System.out.println("carro ligado");
	}
	void Desligar(){
		System.out.println("carro desligado");
	}
	void Acelerar(){
		System.out.println("acelerando");
	}
	void Freiar(){
		System.out.println("freiando");
	}
    public Pessoa getPropietario() {
        return getPropietario();
    }
    public void setPropietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
	public Carro(String tipo, String cor, String placa, int numPortas, Pessoa pessoa) {
		this.tipo=tipo;
		this.cor=cor;
		this.placa=placa;
		this.numPortas=numPortas;
		this.proprietario = pessoa;
	}
	public Carro(String tipo, String cor, String placa, int numPortas) {
		this.tipo=tipo;
		this.cor=cor;
		this.placa=placa;
		this.numPortas=numPortas;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	@Override
	public String toString() {
		return  "Carro ->\ntipo = " + tipo + "\ncor = " + cor + "\nplaca = " + placa + "\nnumPortas = " + numPortas + "\nproprietario -> " + proprietario;

	}
	public Carro() {}
}
