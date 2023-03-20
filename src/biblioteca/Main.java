package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         ArrayList<Usuario> usuarios = new ArrayList<>();
         ArrayList<Livro>livros= new ArrayList<>();
         ArrayList<Emprestimo>emprestimos=new ArrayList<>();
        Main main = new Main();
        boolean iniciar = true;
        while (iniciar){
        switch (main.MenuInicial()){
            case 1 ->{livros.add(main.CadastrarLivro());
                System.out.println("livro cadastrado com sucesso");}
            case 2 ->{usuarios.add(main.CadastrarUsuario());
                System.out.println("usuario cadastrado com sucesso");}
            case 3 ->{emprestimos.add(main.RealizarEmprestimo(usuarios,livros));
                System.out.println("emprestimo realizado com sucesso");}
            case 4 -> main.Devolverlivro(emprestimos);
            case 5 ->{
                for (Emprestimo emprestimo:emprestimos) {
                    System.out.println(emprestimo);
                }
            }
            case 6-> iniciar=false;
            default -> System.out.println("erro!!\n digite um numero de 1 - 5");
        }}
        System.exit(0);


    }
    int MenuInicial(){
        System.out.println("""
                <<<<<<<Biblioteca Virtual>>>>>>
                
                digite um numero para:
                
                       cadastrar livro(1)
                      cadastrar usuario(2)
                     realizar emprestimo(3)
                     devolver emprestimo(4)
                   listar todos emprestimos(5)
                           sair(6)
               <<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>""");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();

    }
    String Scanner(String mensagem){
        Scanner scan = new Scanner(System.in);
        System.out.println(mensagem);
        return scan.nextLine();
    }

    Livro CadastrarLivro(){
        return   new Livro(Scanner("digite o titulo do livro"),Scanner("digite o nome do autor"));
    }
    Usuario CadastrarUsuario(){
        System.out.println("""
                <<<<<<<<<cadastrar usuario>>>>>>>
                 
                  voce quer cadastrar um:
                       aluno(1)
                     professor(2)
                    funcionario(3)""");
        switch (Integer.parseInt(Scanner("digite um numero de 1-3"))){
            case 1->{
                return new Usuario(CadastrarAluno());
            }
            case 2->{
                return new Usuario(CadastrarProfessor());}
            case 3->{
                return new Usuario(CadastrarFuncionario());}
            default -> System.out.println("erro!!\n digite um numero de 1-3");
        }

        return null;
    }
    Aluno CadastrarAluno(){
        return new Aluno(Scanner("digite o nome do aluno:"), Scanner("digite o numero de cpf:"),
                Scanner("digite a idade:"), Scanner("digite a matricula:"),
                Scanner("digite o curso:"),Scanner("digite a sala:"));
    }
    Professor CadastrarProfessor(){
        return new Professor(Scanner("digite o nome:"), Scanner("digite o cpf:"),Scanner("digite a idade:"),
                Scanner("digite o salario:"), Scanner("digite a matricula:"), Scanner("digite a formacao:")
                , Scanner("digite o turno:"), Scanner("digite a materia a ser ministrada:"));
    }
    Funcionario CadastrarFuncionario(){
        return new Funcionario(Scanner("digite o nome:"), Scanner("digite o cpf:"), "digite a idade:",
                "digite o salario:", "digite a ,atricula:");
    }

    Emprestimo RealizarEmprestimo(ArrayList<Usuario> usuarios, ArrayList<Livro> livros){

        Emprestimo emprestimo = new Emprestimo(Scanner("digite a data do emprestimo:"), Integer.parseInt(Scanner("digite a hora:")));
        String nome = Scanner("digite o nome do usuario:");
        String titulo = Scanner("digite o titulo do livro:");

        for (Usuario usuario:usuarios) {
            if (usuario.aluno == null && usuario.funcionario==null){
                if (usuario.professor.getNome().equals(nome)) {emprestimo.setUsuario(usuario);}

            } else if (usuario.professor == null && usuario.funcionario == null) {
                if (usuario.aluno.getNome().equals(nome)){emprestimo.setUsuario(usuario);}
            }else{if (usuario.funcionario.getNome().equals(nome)){emprestimo.setUsuario(usuario);}}
        }

        for (Livro livro:livros) {
            System.out.println(livro);
            if (livro.getTitulo().equals(titulo)){
                livro.setEmprestimo(false);
                emprestimo.setLivro(livro);
            }

        }
        return emprestimo;

    }
    void Devolverlivro(ArrayList<Emprestimo>emprestimos){
        String titulo = Scanner("digite o titulo do livro:");
        for (Emprestimo emprestimo: emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals(titulo)){
                emprestimo.DevolverLivro();
            }}

    }
}
