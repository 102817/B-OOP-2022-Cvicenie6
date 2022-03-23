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

        okno.add(new MyCanvas());

    }
}
