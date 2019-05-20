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
  private final int INITIAL_WIDTH = 1200;
  private final int INITIAL_HEIGHT = 800;

  // MVC Components
  private Controller controller_;
  private BoardView board_;
  
//  TestPanel panel = new TestPanel();
  public View() {
      this(new Controller());
  }

  

  public View(Controller controller) {
      controller_ = controller;
      board_ = new BoardView();
    // Set JFrame attributes
      System.out.println("view constructor");
    setTitle(TITLE);
    setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);

    // Add MVC components
    
    add(board_);

//    add(panel);
  }

  protected void paintComponent(Graphics g) {
      super.paintComponents(g);
      
      Graphics2D g2d = (Graphics2D) g;
      
      board_.paintComponent(g2d);
  }
  
  public Controller getController() {
    return controller_;
  }
  
  public class TestPanel extends JPanel {
      Ball testBall = new Ball();
      
      protected void paintComponent(Graphics g) {
          super.paintComponents(g);
          
          Graphics2D g2d = (Graphics2D) g;
          
          testBall.paintComponent(g2d);
      }
  }
}

