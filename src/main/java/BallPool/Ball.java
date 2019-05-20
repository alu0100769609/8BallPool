package BallPool;

import java.awt.Rectangle;

import javax.swing.ImageIcon;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

import java.util.Random;

public class Ball {

  private static Random rand = new Random();

  private int posX_;
  private int posY_;

  private float vel_ = 7.0f;
  private float acc_ = 0.08f;

  private static final int MAX_VEL = 10;

  private float xDir_ = 1;
  private float yDir_ = 1;

  private float angle_ = 50.0f;

  private Color ballColor = Color.RED;

  private ImageIcon ballIm;

  public Ball() {
    posX_ = 50;
    posY_ = 50;
  }

  public Ball(int posX, int posY, ImageIcon image) {
    posX_ = posX;
    posY_ = posY;

    ballIm = image;

    vel_ = (float) rand.nextInt(MAX_VEL) + 1;

    angle_ = rand.nextInt(360);
  }

  public void update(Rectangle boardDimensions) {

    vel_ -= acc_;

    if(vel_ < 0) {
      vel_ = 0;
    }

    float velX_ = (float) Math.cos(Math.toRadians(angle_)) * vel_ * xDir_;
    float velY_ = (float) Math.sin(Math.toRadians(angle_)) * vel_ * yDir_;

    posX_ = (int)(posX_ + velX_);
    posY_ = (int)(posY_ + velY_);

    if(posX_ < boardDimensions.getX() || posX_ > boardDimensions.getWidth()) {
      xDir_ *= -1;
    }

    if(posY_ < boardDimensions.getY() || posY_ > boardDimensions.getHeight()) {
      yDir_ *= -1;
    }
  }

  public void paintComponent(Graphics2D g2d) {

    g2d.setColor(ballColor);
    // g2d.fillOval(posX_, posY_, 20, 20);


    // System.out.println(ballIm.getImage());
    g2d.drawImage(ballIm.getImage(), posX_, posY_, null);
  }

  public String toString() {
    return String.format("x: %d. y: %d. v: %f a: %f", posX_, posY_, vel_, angle_);
  }
}

