package aula_15_03;

public class Pessoa {
    protected String nome, cpf, datadenascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String datadenascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.datadenascimento = datadenascimento;
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

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }



    @Override
    public String toString() {
        return
                "<<<<< Pessoa >>>>>\n" +
                "\n nome: " + nome +
                "\n cpf: "+ cpf +
                "\n calendario: " + datadenascimento;
    }
}
