package aula;

public class Pessoa {
    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }
    // retorno


    @Override
    public String toString() {
        return """
                
                <<<<<<< funcionario>>>>>>
                Nome:"""+" " + nome;
    }
}
