package aulas.aula0703;

public class Pessoa {
	private String nome;
	private String corDoCabelo;
	private String biotipo;
	private int idade;
	private Carro carro;

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	void Ligar() {
		carro.Ligar();
	}

	void Desligar() {
		carro.Desligar();
	}

	void Acelerar() {
		carro.Acelerar();
	}

	void Freiar() {
		carro.Freiar();
	}

	public Pessoa() {

	}

	public Pessoa(String nome, String corDoCabelo, String biotipo, int idade) {
		this.nome = nome;
		this.corDoCabelo = corDoCabelo;
		this.biotipo = biotipo;
		this.idade = idade;
	}

	public Pessoa(String nome, String corDoCabelo, String biotipo, int idade, Carro carro) {
		this.nome = nome;
		this.corDoCabelo = corDoCabelo;
		this.biotipo = biotipo;
		this.idade = idade;
		this.carro = carro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCorDoCabelo() {
		return corDoCabelo;
	}

	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}

	public String getBiotipo() {
		return biotipo;
	}

	public void setBiotipo(String biotipo) {
		this.biotipo = biotipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\nnome = " + nome + "\ncorDoCabel = " + corDoCabelo + "\nbiotipo = " + biotipo + "\nidade = " + idade
				+ "\n Carro->" + carro;
	}

}
