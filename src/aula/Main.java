package aula;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("pedro");

        PessoaFisica pessoaFisica = new PessoaFisica("pedro", "6666169");

        PessoaJuridica pessoaJuridica = new PessoaJuridica("pedro", "12546585619165/00001");

        Funcionario funcionario = new Funcionario("pedro", "6666169", "785 854 855", 1500.00);

        Gerente gerente = new Gerente("pedro", "6666169", "785 854 855", 1500.00, 2);

        Secretaria secretaria = new Secretaria("pedro", "5555165", "785 854 855", 1500.00, "25444");
        System.out.println(pessoa +""+ pessoaFisica + pessoaJuridica + funcionario + gerente + secretaria);

        funcionario.setNome(pessoa.getNome());






    }
}
