package Greenfox.week02;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int a = 320;
        for (int i = 20; i > 0; i--){
            drawRect(16* i, graphics);
//            a -= (int)(Math.random() * 321);
        }

    }
public static void drawRect (int input ,Graphics graphics){
    graphics.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256),(int)(Math.random() * 256)));
    graphics.fillRect((WIDTH/2) - (input/2), (HEIGHT/2) - (input/2), input, input);

}
// Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}
