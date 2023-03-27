package biblioteca.Produto;

import biblioteca.Usuario.Usuario;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObraPersiste {
    Obra obra;
    public ObraPersiste(Obra obra) {
        this.obra = obra;
    }



    public String gravar() {


        String caminho = "C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\algo\\";
        String ret = "Produto armazenado com sucesso!";
        try {
            FileOutputStream file = new FileOutputStream(caminho+obra.getNomeobra());
            ObjectOutputStream stream = new ObjectOutputStream(file);
            stream.writeObject(obra);
            stream.flush();
            System.out.println("salvo");
        }catch (Exception erro) {
            ret = "Falha de gravação\n "+erro.toString();
        }
        return ret;
    }

    public static Obra ler(String codigo) {

        String caminho = "C:\\Users\\pedro\\OneDrive\\Área de Trabalho\\algo\\";
        try {
            FileInputStream file = new FileInputStream(caminho+ codigo);
            ObjectInputStream stream = new ObjectInputStream(file);
            return (Obra) stream.readObject();
        }catch (Exception erro) {
            System.out.println("Falha na leitura \n "+ erro.toString());
            return null;
        }
    }
}
