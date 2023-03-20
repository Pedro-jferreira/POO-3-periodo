package Televisor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Paths {

    public void setPaths(StringBuilder stringBuilder, String URI, boolean concat) {
        
        try (BufferedWriter gravar = new BufferedWriter(new FileWriter(URI,concat))) {
            gravar.write(String.valueOf(stringBuilder));
            gravar.flush();
        }
    
    catch (IOException e)
    {
        JOptionPane.showMessageDialog(null,"nao foi possível gravar");
        throw new RuntimeException(e);
    }
}
public StringBuilder getPaths(String URI) {
    StringBuilder ItemSalvo;
    
    try (BufferedReader ler = new BufferedReader(new FileReader(URI))) 
    {
        ItemSalvo = new StringBuilder(ler.readLine());
     }
    catch (IOException e)
    {
        JOptionPane.showMessageDialog(null,"nao foi possível ler!");
        throw new RuntimeException(e);
    }
    return new StringBuilder(ItemSalvo);
}
}

