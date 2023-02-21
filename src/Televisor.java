import javax.swing.*;
import java.io.*;

public class Televisor
{
    int volume;
    int canais;
    public int getCanais() {return canais;}
    public void setCanais(int canais, String mudar) {

        this.canais= lerCanais();

        if (VerificaCanais(canais, mudar))
        {

            switch (mudar)
            {
                case "++" -> {
                    this.canais++;
                    System.out.println(getCanais());
                }
                case "--" -> {
                    this.canais --;
                    System.out.println(getCanais());
                }
                case "=="-> this.canais=lerCanais();
                case "[["-> this.canais=canais;
                default -> System.out.println("erro1");
            }
            SalvarCanais();
        }else System.out.println("esse canal não existe");
    }
    public int MostrarCanais(int canais){setCanais(canais,"==");return getCanais();}
    public int getVolume() {return volume;}
    public void setVolume(String volume) {
        this.volume= lerVolume();

        boolean b = VerificaVolume(DelimitarVolume(getVolume(),volume));
        if (b)
        {
            switch (volume)
            {
                case "++" ->
                {
                    this.volume++;
                    System.out.println(getVolume());
                }
                case "--" -> {
                    this.volume--;
                    System.out.println(getVolume());
                }
            }

            SalvarVolume();

        }else System.out.println("erro");
    }
    public int MostrarVolume(){setVolume("==");return getVolume();}
    public Boolean VerificaVolume(int volume) {

        if (volume >= 0 && volume <= 100)
        {
            return true;
        }else
        {
            JOptionPane.showMessageDialog(null,"volume vai somente de 0 a 100");
            return false;
        }
    }
    public int DelimitarVolume(int volume, String op) {
        switch (op){
            case "++" -> {
                return volume+1;
            }
            case "--" -> {
                return volume-1;
            }
        }
        return volume;
    }
    public int lerVolume() {return Integer.parseInt(String.valueOf(getPaths(getVolumeUri())));}
    public void SalvarVolume() {setPaths(new StringBuilder(String.valueOf(getVolume())),getVolumeUri(),false);}
    public String getVolumeUri() {return "C:\\Users\\pedro\\IdeaProjects\\newpoo\\src\\volume.txt";}
    public boolean VerificaCanais(int canais,String op) {
        if (canais ==-2000)
        {
            switch (op)
            {
                case "++" -> canais = getCanais()+1;
                case "--" -> canais = getCanais()-1;
                case "=="-> {return true;}
                default -> System.out.println("erro2");
            }
        }

        if (canais >= 0 &&  canais <= 3)
        {
            return true;
        }else
        {
            JOptionPane.showMessageDialog(null,"só temos 3 canais no momento");
            return false;
        }
    }
    public int lerCanais(){return Integer.parseInt(String.valueOf(getPaths(getCanaisUri())));}
    public void SalvarCanais() {setPaths(new StringBuilder(String.valueOf(getCanais())),getCanaisUri(),false);}
    public String getCanaisUri() { return "C:\\Users\\pedro\\IdeaProjects\\newpoo\\src\\canal.txt";}
    public void setPaths(StringBuilder salvar, String URI, boolean concat) {
        try
        {
            BufferedWriter gravar;
            gravar = new BufferedWriter(new FileWriter(URI,concat));
            gravar.write(String.valueOf(salvar));
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
        try
        {
            BufferedReader ler = new BufferedReader(new FileReader(URI));
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