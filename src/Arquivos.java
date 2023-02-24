import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arquivos 
{
    String uripadrao;

    public String ExistsURI(String uri, String diretorio) 
    {
        File file = new File(diretorio);

        if (!file.exists()) 
        {
            file.mkdirs();
        }
        file = new File(uri);
        if (!file.exists()) 
        {
            try 
            {
                file.createNewFile();
            } catch (IOException e) 
            {
                throw new RuntimeException(e);
            }
        }
        return uri;
    }

    public String VerificarArq() 
    {
        uripadrao = "C:\\televisor\\televisor.txt";
        uripadrao = ExistsURI(uripadrao, "C:\\televisor");
        if (!VerificarTexto()) 
        {
            new Televisor().setPaths(new StringBuilder(String.valueOf(Solicitaruri())), uripadrao, false);
            VerificarArq();
        }
        return String.valueOf(new Televisor().getPaths(uripadrao));
    }

    public String Solicitaruri() 
    {
        return JOptionPane.showInputDialog(null, """
                não encontrei o seu arquivo padrão
                por favor digite o caminho completo da pasta de arquivos desse programa
                ou entre em contato com o desenvolvedor: pedrojferreiradev@gmail.com""");
    }

    public boolean VerificarTexto() 
    {
        File file = new File(uripadrao);
        String texto = null;
        try 
        {
            Scanner scan = new Scanner(file);
            if (scan.hasNextLine()) 
            {
                texto = scan.next();
            }
        } catch (FileNotFoundException e) 
        {
            throw new RuntimeException(e);
        }
        return texto != null;
    }
}