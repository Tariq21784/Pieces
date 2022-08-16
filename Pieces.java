/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pieces;

/**
 *
 * @author arnol
 */
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class Pieces extends JFrame {
    public Pieces() {
        setTitle("Pieces");
        setSize(500, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(50,50, 200, 200);
    }

    public static void main(String[] args) {
        Pieces t = new Pieces();
        t.paint(null);
    }
}
