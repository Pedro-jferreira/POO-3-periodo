package aulas.aula0703;

public class Pessoa {
	private String nome;
	private String cpf;
	private String genero;
	private int idade;
	private Carro carro;

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	void  usarcambio(int cambio){
		carro.setCambio(cambio);
		carro.getCambio();
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

	public Pessoa(String nome, String cpf, String genero, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.idade = idade;
	}

	public Pessoa(String nome, String cpf, String genero, int idade, Carro carro) {
		this.nome = nome;
		this.cpf = cpf;
		this.genero = genero;
		this.idade = idade;
		this.carro = carro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\n INFORMAÇÕES PESSOAIS->\n nome: " + nome + "\n cpf: " + cpf + "\n genero: " + genero + "\n idade: " + idade +"\n"+ carro;
	}

}
