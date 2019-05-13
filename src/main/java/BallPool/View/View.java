package BallPool.View;

import javax.swing.*;

import BallPool.Controller;

public class View extends JFrame {
  private static final long serialVersionUID = 1L;

  // JFrame attributes
  private final String TITLE = "8BallPool";
  private final int INITIAL_WIDTH = 800;
  private final int INITIAL_HEIGHT = 600;

  // MVC Components
  Controller controller_;


  public View(Controller controller) {
    // Set JFrame attributes
    setTitle(TITLE);
    setSize(INITIAL_WIDTH, INITIAL_HEIGHT);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Add MVC components
    controller_ = controller;
  }

  public Controller getController() {
    return controller_;
  }
}
