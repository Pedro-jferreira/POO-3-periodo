package biblioteca;

import biblioteca.Armazenamento.UsuariosArray;
import biblioteca.Usuario.Aluno;
import biblioteca.Usuario.Funcionario;
import biblioteca.Usuario.Professor;
import biblioteca.Usuario.Usuario;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    UsuariosArray usuariosArray = new UsuariosArray();



    public static void main(String[] args) {

        Main main = new Main();
        main.usuariosArray.PrencherArray();
        while (true){
            main.MenuPrincipal();
        }
    }
    public void MenuPrincipal(){
        switch (Integer.parseInt(InputScanner("""
                <<<<<<<<<<<<<Biblioteca virtual>>>>>>>>>>>>
                
                           Cadastrar usuario(1)
                            Cadastrar Livro(2)
                          Realizar emprestimo(3)
                            Devolver Livro (4)
                            Listar usuarios(5)
                             Listar livros(6)
                                 Sair (7)"""))){
            case 1->{CadastrarUsuario();}
            case 2->{}
            case 3->{}
            case 4->{}
            case 5->{usuariosArray.Imprimir();}
            case 6->{}
            case 7->{}
        }
    }

    public void CadastrarUsuario(){
        switch (Integer.parseInt(InputScanner("""
                Cadastrar usuario:
                
                         aluno(1)
                      Professor(2)
                     funcionario(3)
             atualizar informacoes do usuario(4)
                   excluir usuario(5)
                        Voltar(7)
                     
                digite um numero:"""))){
            case 1 ->{addArrayUsuario(new Usuario(CadastrarAluno()));}
            case 2 ->{addArrayUsuario(new Usuario(CadastrarProfessor()));}
            case 3 ->{addArrayUsuario(new Usuario(CadastrarFuncionario()));}
            case 4->{AtualizarInfo();}
            case 5->{}
            case 6->{}
            case 7->{}
            default -> System.out.println("erro digite um numero de 1-3");
        }

    }
    void addArrayUsuario(Usuario usuario){
        usuariosArray.addArray(usuario);
        usuario.Gravar();
        System.out.println("usuario cadastrado com sucesso!!");
    }

    String InputScanner(String menssagem){
        Scanner scanner = new Scanner(System.in);
        System.out.println(menssagem);
        return scanner.nextLine();
    }

    Funcionario CadastrarFuncionario(){
        System.out.println("cadastrar funcionario >>>>>>>>>>\n ");
        return new Funcionario(InputScanner("digite o nome: "),VerificarCpf(InputScanner("digite o cpf: ")),
                InputScanner("digite a matricula: "), InputScanner("digite o salario: "),
                InputScanner("digite o setor: "));
    }
    Professor CadastrarProfessor(){
        System.out.println("cadastrar Professor >>>>>>>>>>\n ");
        return new Professor(InputScanner("digite o nome: "),VerificarCpf(InputScanner("digite o cpf: ")),
                InputScanner("digite a matricula: "), InputScanner("digite o salario: "),
                InputScanner("digite o setor: "),InputScanner("digite a formacao: "));
    }
    Aluno CadastrarAluno(){
        System.out.println("cadastrar aluno >>>>>>>>>>\n ");
        return  new Aluno(InputScanner("digite o nome: "),VerificarCpf(InputScanner("digite o cpf: ")),
                InputScanner("digite a matricula: "),InputScanner("digite o curso: "),
                InputScanner("digite a turma: "));
    }
    String VerificarCpf(String cpf){
        File file = new File("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\algo\\"+cpf);
        if (!file.exists()){
            return cpf;
        }else return null;
    }
    void AtualizarInfo(){
        Object primario = UsuarioExiste(usuariosArray.retornar(), InputScanner("digite o cepf: "));
        Usuario usuario01 = (Usuario) primario;
        System.out.println("oba!! Usuario encontrado:");
        System.out.println(primario);
        System.out.println("agora digite as novas informacoes: ");
        Object secundario= AtualizarUsuario();
        Usuario usuario = new Usuario();
        usuario= (Usuario) primario;
        usuariosArray.AtualizarArray(usuario,secundario);
        usuario.Atualizar(secundario);
    }
    Object UsuarioExiste(ArrayList<Object> objects,String cpf){
        ArrayList<Usuario>usuarios= new ArrayList<>();
        for (Object objeto:objects) {usuarios.add((Usuario) objeto);}

        for (Usuario usuario:usuarios) {
            if (usuario.getCpf().equals(cpf)){
                return usuario;
            }
        }return null;
    }
    Usuario AtualizarUsuario(){
            switch (Integer.parseInt(InputScanner("""
                Cadastrar usuario:
                
                         aluno(1)
                      Professor(2)
                     funcionario(3)"""))){
            case 1 ->{return new Usuario(CadastrarAluno());}
            case 2 ->{return new Usuario(CadastrarProfessor());}
            case 3 ->{return new Usuario(CadastrarFuncionario());}
                default -> System.out.println("erro!!");
        }
        return null;
    }
    }

