package BallPool.View;

import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import BallPool.Controller;
import BallPool.Model;

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
  private Model model_;

//  TestPanel panel = new TestPanel();
  public View() {
      this(new Model(), new Controller());
  }



    public View(Model model, Controller controller) {
      controller_ = controller;
      board_ = new BoardView();
      model_ = model;
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


      for(Ball ball : model_.getBalls()) {
        ball.paintComponent(g2d);
      }
  }

  public Controller getController() {
    return controller_;
  }

  public Rectangle getBoardDimension() {
      return board_.getVisibleRect();
    }

    public class TestPanel extends JPanel {
        private static final long serialVersionUID = 1L;

        protected void paintComponent(Graphics g) {
          super.paintComponents(g);

          Graphics2D g2d = (Graphics2D) g;

          for(Ball ball : model_.getBalls()) {
            ball.paintComponent(g2d);
          }
        }
    }
}

