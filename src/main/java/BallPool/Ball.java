package BallPool;

import java.awt.Rectangle;

import java.awt.Graphics2D;
import java.awt.Color;

public class Ball {

  private int posX_;
  private int posY_;

  private float velX_ = 5;
  private float velY_ = 5;

  private float aceleration = -0.4f;

  private Color ballColor = Color.RED;

  public Ball() {
    posX_ = 50;
    posY_ = 50;
  }

  public Ball(int posX, int posY) {
    posX_ = posX;
    posY_ = posY;
  }

  public void setVelX(int velX) {
    velX_ = velX;
  }

  public void setVelY(int velY) {
    velX_ = velY;
  }

  public void update(Rectangle boardDimensions) {
    posX_ = (int)(posX_ + velX_);
    posY_ = (int)(posY_ + velY_);

    if(velX_ > 0) {
      velX_ += aceleration;
    }

    if(velY_ > 0) {
      velY_ += aceleration;
    }
  }

  public void paintComponent(Graphics2D g2d) {
    g2d.setColor(ballColor);
    g2d.fillOval(posX_, posY_, 20, 20);
  }

  public String toString() {
    return String.format("x: %d. y: %d. vx: %f. vy: %f", posX_, posY_, velX_, velY_);
  }
}

