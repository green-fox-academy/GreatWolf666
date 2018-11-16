package Greenfox.week03;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;


public class ProjectTrees extends JFrame {

  public ProjectTrees() {
    super("ProjectTree");
    setBounds(100, 100, 800, 600);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  private void drawTree(Graphics graphics, int x1, int y1, double angle, int depth) {
    if (depth == 0)
      return;
    int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
    int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
    graphics.drawLine(x1, x2, y1, y2);
    drawTree(graphics, x2, y2, angle - 20, depth - 1);
    drawTree(graphics, x2, y2, angle + 20, depth - 1);
  }

  @Override
  public void paint(Graphics graphics) {
    graphics.setColor(Color.BLACK);
    drawTree(graphics, 400, 500, -90, 9);
  }

  public static void main(String[] args) {
    new ProjectTrees().setVisible(true);
  }
}
