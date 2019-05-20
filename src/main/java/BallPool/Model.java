package BallPool;

import java.util.List;
import java.util.ArrayList;
import java.awt.Rectangle;

import BallPool.Ball;

public class Model {

  List<Ball> balls_ = new ArrayList<Ball>();

  public void updateBalls(Rectangle boardDimensions) {

    for(Ball ball : balls_) {
      ball.update(boardDimensions);
      System.out.println(ball);
    }
  }

  public void addBall(Ball ball) {
    balls_.add(ball);
  }

  public List<Ball> getBalls() {
    return balls_;
  }
}
