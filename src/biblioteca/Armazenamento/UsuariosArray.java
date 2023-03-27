package biblioteca.Armazenamento;

import biblioteca.Usuario.Usuario;

import java.io.File;
import java.util.ArrayList;

public class UsuariosArray implements Config{
    ArrayList<Usuario> usuarios= new ArrayList<>();

   public void PrencherArray(){
        Usuario usuario = new Usuario();
        File file = new File("C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\algo\\");
        for (File f : file.listFiles()){
            usuario = (Usuario) usuario.Ler(f.getName());
            usuarios.add(usuario);
        }

    }

    @Override
    public void addArray(Object objeto) {
        try {
            usuarios.add((Usuario) objeto);
            System.out.println(((Usuario) objeto).getNome()+" foi adicionado com sucesso\n"+((Usuario) objeto).Gravar()
            );
        } catch (Exception e) {
            System.out.println("nao foi possivel adiconar o usuario: "+((Usuario) objeto).getNome());
            throw new RuntimeException(e);
        }

    }

    @Override
    public void RemoverArray(Object objeto) {
        try {
            usuarios.remove((Usuario) objeto);
            System.out.println(((Usuario) objeto).getNome()+" foi removido com sucesso");

        } catch (Exception e) {
            System.out.println("nao foi possivel remover o usuario: "+((Usuario) objeto).getNome());
            throw new RuntimeException(e);
        }


    }

    @Override
    public void AtualizarArray(Object primario, Object objetoatualizado) {
        for (Usuario usuario:usuarios){
            if (usuario == (Usuario) primario){
                usuarios.set(usuarios.indexOf(usuario), (Usuario) objetoatualizado);
                System.out.println("o usuario:\n"+(Usuario)primario+ "\nfoi alterado para:\n"+(Usuario)objetoatualizado);
            }

        }


    }

    @Override
    public ArrayList<Object> retornar() {
        ArrayList<Object>object= new ArrayList<>();
        for (Usuario usuario:usuarios) {
            object.add(usuario);}

        return object ;
    }

    @Override
    public void Imprimir() {
        for (Usuario usuario:usuarios) {
            System.out.println(usuario);

        }
    }

}
