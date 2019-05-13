package BallPool.View;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;

import BallPool.Controller;

import BallPool.Ball;

public class View extends JFrame {
  private static final long serialVersionUID = 1L;

  // JFrame attributes
  private final String TITLE = "8BallPool";
  private final int INITIAL_WIDTH = 800;
  private final int INITIAL_HEIGHT = 600;

  // MVC Components
  Controller controller_;

  public class TestPanel extends JPanel {
    Ball testBall = new Ball();

    protected void paintComponent(Graphics g) {
      super.paintComponents(g);

      Graphics2D g2d = (Graphics2D) g;

      testBall.paintComponent(g2d);
    }
  }

  TestPanel panel = new TestPanel();

  public View(Controller controller) {
    // Set JFrame attributes
    setTitle(TITLE);
    setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Add MVC components
    controller_ = controller;

    add(panel);
  }

  public Controller getController() {
    return controller_;
  }
}
