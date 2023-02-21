import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScreenTelevisor extends JFrame {
    Icon icon1 = new ImageIcon(new Icons().icon1());
    Icon icon2 = new ImageIcon(new Icons().icon2());
    Icon icon3 = new ImageIcon(new Icons().icon3());
    Icon icon4 = new ImageIcon(new Icons().icon4());
    Color cor1 = new Color(255, 255, 255);
    Color cor2 = new Color(0, 51, 255);
    Color cor3 = new Color(11, 165, 227);
    Color cor4 = new Color(2, 16, 96);
    Color cor5 = new Color(57, 120, 255);
    JButton JB1, JB2, JB3, JB4, JB5;
    JLabel JL1, JL2, JL3, JL4;

    JTextField JTF1;





    public ScreenTelevisor(){
        System.out.println(new Televisor().getVolume());
        setLayout(null);
        setTitle("televisor");
        setSize(500, 410);
        getContentPane().setBackground(cor5);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JB1 = new JButton("V+");
        JB1.setBounds(20, 20, 60, 50);
        JB1.setBackground(cor2);
        JB1.setFont(new Font("Arial", Font.BOLD, 10));
        JB1.setForeground(cor1);
        JB1.setVisible(true);
        JB1.addActionListener(e -> {
            new Televisor().setVolume("++");
            int i = new Televisor().MostrarVolume();
            JL1.setBounds(20, 170-i, 60, i);
            atualiza();

        });

        JB2 = new JButton("V-");
        JB2.setBounds(20, 170, 60, 50);
        JB2.setBackground(cor2);
        JB2.setFont(new Font("Arial", Font.BOLD, 10));
        JB2.setForeground(cor1);
        JB2.setVisible(true);
        JB2.addActionListener(e -> {
            new Televisor().setVolume("--");
            int i = new Televisor().MostrarVolume();
            JL1.setBounds(20, 170-i, 60, i);
            atualiza();

        });

        JB3 = new JButton("canal +");
        JB3.setBounds(100, 320, 80, 50);
        JB3.setBackground(cor2);
        JB3.setFont(new Font("Arial", Font.BOLD, 10));
        JB3.setForeground(cor1);
        JB3.setVisible(true);
        JB3.addActionListener(e -> {
            new Televisor().setCanais(-2000, "++");
            TrocarCanais();
        });


        JB4 = new JButton("canal -");
        JB4.setBounds(400, 320, 80, 50);
        JB4.setBackground(cor2);
        JB4.setFont(new Font("Arial", Font.BOLD, 10));
        JB4.setForeground(cor1);
        JB4.setVisible(true);
        JB4.addActionListener(e -> {
            new Televisor().setCanais(-2000, "--");
            TrocarCanais();
        });

        JB5 = new JButton("IR->");
        JB5.setBounds(340, 320, 60, 50);
        JB5.setBackground(cor2);
        JB5.setFont(new Font("Arial", Font.BOLD, 10));
        JB5.setForeground(cor1);
        JB5.setFocusable(true);
        JB5.setVisible(true);


        JTF1 = new JTextField("digite um canal");
        JTF1.setBounds(180, 320, 160, 50);//x=130 y= 4
        JTF1.setBackground(cor2);
        JTF1.setForeground(cor1);
        JTF1.setFont(new Font("Arial", Font.BOLD, 10));
        JTF1.setVisible(true);
        JTF1.addActionListener(e -> {
            new Televisor().setCanais(Integer.parseInt(JTF1.getText()),"[[");
            TrocarCanais();
        });
        JB5.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    new Televisor().setCanais(Integer.parseInt(JTF1.getText()),"[[");
                    TrocarCanais();}
            }


            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        JTF1.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                String a = JTF1.getText();
                if (JTF1.getText().equals(a))
                {
                    JTF1.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e)
            {
                if (JTF1.getText().isEmpty())
                {
                    JTF1.setText("digite um canal");
                }
            }
        });

        JL1 = new JLabel();
        JL1.setBackground(cor3);
        int i = new Televisor().MostrarVolume();
        JL1.setBounds(20, 170-i , 60, i);
        JL1.setOpaque(true);
        JL1.setVisible(true);


        JL2 = new JLabel();
        JL2.setBackground(cor4);
        JL2.setBounds(20, 70, 60,100);
        JL2.setOpaque(true);
        JL2.setVisible(true);
        JL4 = new JLabel();
        JL4.setBackground(cor2);
        JL4.setForeground(cor1);
        JL4.setBounds(100, 0, 100,20);
        JL4.setOpaque(true);
        JL4.setVisible(true);

        JL3 = new JLabel(icon1);
        TrocarCanais();
        JL3.setBackground(cor4);
        JL3.setBounds(100, 20, 380,300);
        JL3.setOpaque(true);
        JL3.setVisible(true);


        add(JL4);
        add(JB1);
        add(JB2);
        add(JL1);
        add(JL2);
        add(JB5);

        add(JB3);
        add(JB4);
        add(JTF1);
        add(JL3);


        setVisible(true);

    }
    public void TrocarCanais(){
        int d = new Televisor().MostrarCanais(-2000);
        switch (d){
            case 0 -> {
                System.out.println("canal 0");
                JL4.setText("canal 0 -> band tv");
                JL3.setIcon(icon1);
                JL3.setVisible(true);
                add(JL3);
                atualiza();
            }
            case 1 -> {
                System.out.println("canal 1");
                JL4 .setText("canal 2 -> globo");
                JL3.setIcon(icon2);
                JL3.setVisible(true);
                add(JL3);
                atualiza();
            }
            case 2 -> {
                System.out.println("canal 2");
                JL4.setText("canal 2 -> rede tv");
                JL3.setIcon(icon3);
                JL3.setVisible(true);
                add(JL3);
                atualiza();
            }
            case 3 -> {
                System.out.println("canal 3");
                JL4.setText("canal 3 -> sbt");
                JL3.setIcon(icon4);
                JL3.setVisible(true);
                add(JL3);
                atualiza();
            }
            default -> System.out.println("só existem 3 canais no momento");
        }
    }

    public void atualiza(){
        setSize(501,410);
        setSize(500,410);
        setVisible(true);
    }



}
class Icons {
    public Image icon1() {
        return Toolkit.getDefaultToolkit().getImage("C:\\Users\\pedro\\IdeaProjects\\newpoo\\src\\bandft.jpeg");
    }
    public Image icon2() {
        return Toolkit.getDefaultToolkit().getImage("C:\\Users\\pedro\\IdeaProjects\\newpoo\\src\\globoft.jpeg");
    }
    public Image icon3(){
        return Toolkit.getDefaultToolkit().getImage("C:\\Users\\pedro\\IdeaProjects\\newpoo\\src\\redetvft.jpeg");
    }
    public Image icon4(){
        return Toolkit.getDefaultToolkit().getImage("C:\\Users\\pedro\\IdeaProjects\\newpoo\\src\\sbtft.jpeg");
    }}
