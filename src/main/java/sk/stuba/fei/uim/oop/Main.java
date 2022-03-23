package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame okno = new JFrame();  //vytvorenie okna
        okno.setVisible(true);   //zobrazenie okna
        okno.setSize(300,300);
        okno.setResizable(false);  //fiksuje velkost okna
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Ked stlacim krizik tak skonci program
        okno.setLayout(new GridLayout(3,4)); //zvacsuje zmensujje velkost okna

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,5));



        panel.add(new JLabel("TOP"), BorderLayout.PAGE_START);
        panel.add(new JLabel("BOTTOM"), BorderLayout.PAGE_END);
        panel.add(new JLabel("LEFT"), BorderLayout.PAGE_START);
        panel.add(new JLabel("Rigth"), BorderLayout.PAGE_END);
        JLabel labelPanel = new JLabel("CENTER", SwingConstants.CENTER);
        labelPanel.setAlignmentX(50);
        panel.add(labelPanel, BorderLayout.CENTER);

        panel.setBackground(new Color(190, 120, 150));
        okno.getContentPane().setBackground(Color.YELLOW);

        JLabel label = new JLabel("Hello world");
        okno.add(label);

        for (int i = 0;i<10;i++){
            okno.add(new JLabel("Hello " + i));

        }
        for (int i = 0;i<10;i++) {

            if (i == 8) {
                okno.add(panel);
            } else{
                okno.add(new JLabel("Hello " + i));
            }
        }

    }
}
