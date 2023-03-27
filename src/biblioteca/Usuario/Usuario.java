package biblioteca.Usuario;

import biblioteca.DAO;

import java.io.*;

public class Usuario implements Serializable, DAO {
Pessoa pessoa;

    public Usuario() {
    }

    public Usuario(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getNome(){
        return pessoa.getNome();
    }
    public String getCpf(){
        return pessoa.cpf;
    }
    public void Imprimir(){
        System.out.println(pessoa.Imprimir());
    }

    Pessoa getPessoa() {
        return pessoa;
    }

    void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    void LerLivro(){
        System.out.println("você está lendo livro");
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "pessoa=" + pessoa +
                '}';
    }

    @Override
    public String Gravar() {
        String caminho = "C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\algo\\";
        String ret = "usuario: "+ getCpf()+"\n nome: "+ getNome()+"\n foi armazenado com sucesso!";
        try {
            FileOutputStream file = new FileOutputStream(caminho+this.getCpf());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(this);
            stream.flush();
            stream.close();
        }catch (Exception erro) {
            ret = "Falha de gravação\n "+erro.toString();
        }
        return ret;
    }

    @Override
    public Object Ler(String codigo) {
        String caminho = "C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\algo\\";
        try {
            FileInputStream file = new FileInputStream(caminho+ codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return stream.readObject();
        }catch (Exception erro) {
            System.out.println("Falha na leitura \n "+ erro.toString());

        }
        return null;    }

    @Override
    public  String Excluir(String codigo) {

        String caminho = "C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\algo\\";
        try {
            File file = new File(caminho+codigo);
            if (file.exists()){
                file.delete();

            }else return "esse usuario não existe no armazenamento, tente gravar";


            return "o usuario: "+getNome()+" foi apagado com sucesso";
        }catch (Exception erro) {
            System.out.println("Falha na ao apagar \n "+ erro.toString());

        }
        return "não foi possivel apagar o usuario: "+getNome();

    }

    @Override
    public String Atualizar( Object objtatualizado) {
        String caminho = "C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\algo\\";
        Usuario usuarionovo = new Usuario();
        usuarionovo =  (Usuario)objtatualizado;
        Usuario usuarioantigo = new Usuario(getPessoa());
        try {

            File file1 = new File(caminho + this.getCpf());
            FileOutputStream file = new FileOutputStream(caminho + this.getCpf());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.reset();
            stream.writeObject(objtatualizado);
            stream.flush();
            stream.close();
            setPessoa(usuarionovo.getPessoa());
            file1.renameTo(new File(caminho + this.getCpf()));


        } catch (FileNotFoundException e) {
            System.out.println("não foi possivel ler o arquivo");
            setPessoa(usuarioantigo.getPessoa());

           throw new RuntimeException(e);
       } catch (IOException e) {
            System.out.println("não foi possivel alterar o usuario");
           throw new RuntimeException(e);
       }
        return "usuario alterado com sucesso!!";
    }

}
