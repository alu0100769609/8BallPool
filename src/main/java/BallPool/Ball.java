package BallPool;

import java.awt.Rectangle;

import javax.swing.ImageIcon;

import java.awt.Graphics2D;
import java.awt.Color;

import java.util.Random;

public class Ball {

  private static Random rand = new Random();

  private int posX_;
  private int posY_;

  private float velX_ = 5.0f;
  private float velY_ = 5.0f;

  private static final int MAX_VEL = 5;

  private Color ballColor = Color.RED;

  private ImageIcon ballIm;
  
  public Ball() {
    posX_ = 50;
    posY_ = 50;
  }

  public Ball(ImageIcon image) {
	  posX_ = 50;
	  posY_ = 50;
	  ballIm = image;
  }
  
  public Ball(int posX, int posY) {
    posX_ = posX;
    posY_ = posY;

    setVelX((float)rand.nextInt(MAX_VEL));
    setVelY((float)rand.nextInt(MAX_VEL));
  }

  public void setVelX(float velX) {
    velX_ = velX;
  }

  public void setVelY(float velY) {
    velY_ = velY;
  }

  public void update(Rectangle boardDimensions) {
    posX_ = (int)(posX_ + velX_);
    posY_ = (int)(posY_ + velY_);

    if(posX_ < boardDimensions.getX() || posX_ > boardDimensions.getWidth()) {
      velX_ *= -1;
    }

    if(posY_ < boardDimensions.getY() || posY_ > boardDimensions.getHeight()) {
      velY_ *= -1;
    }
  }

  public void paintComponent(Graphics2D g2d) {
    g2d.setColor(ballColor);
    g2d.fillOval(posX_, posY_, 20, 20);


  }

  /*public void paintComponent(Graphics2D g2d) {
	    g2d.setColor(ballColor);
	    g.drawImage(ballIm.getImage(), posX_, posY_, null);
  }*/
  
  public String toString() {
    return String.format("x: %d. y: %d. vx: %f. vy: %f", posX_, posY_, velX_, velY_);
  }
}

