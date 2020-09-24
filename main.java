/*****************************
        Name Cards
        Oct 17th 2018
 ****************************/

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

class NameCard extends JFrame {

    /***** Constructor *****/
    public NameCard() {
        // Setup the Windows
        setSize(397, 300); // Setting the Size of the Window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /***** paint *****/
    public void paint(Graphics g) {
        // Setup the Polygons Point for Canadian National Flag
        int[] x = {132, 131, 155, 153, 176, 171, 174, 161, 157, 144, 149, 140, 130, 121, 112, 115, 103, 98, 86, 89, 84, 107, 104, 129, 128};
        int[] y = {140, 116, 119, 111, 91, 88, 72, 75, 68, 80, 52, 57, 40, 57, 52, 80, 68, 75, 72, 88, 91, 111, 119, 116, 140};

        // Draw the Canadian National Flag
        g.setColor(Color.red);
        g.fillRect(10, 31, 240, 121);
        g.setColor(Color.white);
        g.fillRect(70, 31, 120, 121);
        g.setColor(Color.red);
        g.fillPolygon(x, y, 25);
        g.setColor(Color.black);
        g.drawRect(9, 31, 241, 121);

        // Draw the Simplified Japanese National Flag
        g.setColor(Color.white);
        g.fillRect(265, 31, 120, 121);
        g.setColor(Color.red);
        g.fillOval(295, 60, 60, 60);
        g.setColor(Color.black);
        g.drawRect(264, 31, 121, 121);

        // Draw the Text about Personal Information
        Font font1 = new Font("Arial", Font.PLAIN | Font.BOLD, 22);
        g.setFont(font1);
        g.setColor(Color.RED);
        g.drawString("Raymond Aleksandr", 40, 190);
        Font font2 = new Font("Arial", Font.PLAIN, 16);
        g.setFont(font2);
        g.setColor(Color.black);
        g.drawString("Information System Science and Engineering", 40, 210);
        g.drawString("As A Second Year Student in Japan", 40, 230);
        g.drawString("Nationality: Canadian Chinese", 40, 250);
        g.drawString("Student No.: 114514810893-1919", 40, 270);
    }
    /***** main *****/
    // Run the Program
    public static void main(String[] args) {
        new NameCard();
    }

}
