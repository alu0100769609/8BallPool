package BallPool;

import BallPool.View.View;
import BallPool.Model;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Rectangle;

public class Controller {
  // MVC Components
  private Model model_;
  private View view_;

  private final int FRAMES_PER_SECOND = 30;
  private final int FRAME_DELAY = 1000 / FRAMES_PER_SECOND;
  private Timer gameTimer_ = new Timer(FRAME_DELAY, new ActionListener() {

    public void actionPerformed(ActionEvent e) {
      updateGame(view_.getBoardDimension());
    }

  });

  public void setView(View view) {
    view_ = view;
  }

  public void setModel(Model model) {
    model_ = model;
  }

  public void updateGame(Rectangle boardDimensions) {
    model_.updateBalls(boardDimensions);
    view_.repaint();
  }

  public void startGame() {
    gameTimer_.start();
  }

  public void stopGame() {
    gameTimer_.stop();
  }

  public void addBall(Ball ball) {
    model_.addBall(ball);
  }
}


