package Televisor;

import javax.swing.*;

public class Televisor
{
    private int volume;
    private int canais;

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
                case "[]"-> this.canais=canais;
                default -> System.out.println("erro1");
            }
            SalvarCanais();
        }else System.out.println("esse canal não existe");
    }

    public int MostrarCanais(){setCanais(-2000,"==");return getCanais();}

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

    private Boolean VerificaVolume(int volume) {

        if (volume >= 0 && volume <= 100)
        {
            return true;
        }else
        {
            JOptionPane.showMessageDialog(null,"volume vai somente de 0 a 100");
            return false;
        }
    }

    private int DelimitarVolume(int volume, String op) {
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

    private int lerVolume() {return Integer.parseInt(String.valueOf(new Paths().getPaths(getVolumeUri())));}

    private void SalvarVolume() {new Paths().setPaths(new StringBuilder(String.valueOf(getVolume())),getVolumeUri(),false);}

    private String getVolumeUri() {return new Arquivos().VerificarArq()+"\\volume.txt";}

    private boolean VerificaCanais(int canais,String op) {
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
            JOptionPane.showMessageDialog(null,"só temos 4 canais no momento");
            return false;
        }
    }

    private int lerCanais(){return Integer.parseInt(String.valueOf(new Paths().getPaths(getCanaisUri())));}

    private void SalvarCanais() { new Paths().setPaths(new StringBuilder(String.valueOf(getCanais())),getCanaisUri(),false);}

    private String getCanaisUri() { return new Arquivos().VerificarArq()+"\\canal.txt";}

}