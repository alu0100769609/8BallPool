package BallPool;

import java.util.List;
import java.util.ArrayList;
import java.awt.Rectangle;
import java.io.File;
import java.util.*;
import javax.swing.*;
import java.awt.Image;
import java.io.File;
import java.util.*;
import javax.swing.*;

import java.util.Random;

import BallPool.Ball;

public class Model {

  private Random rand = new Random();

  List<Ball> balls_ = new ArrayList<Ball>();
	List<File> dir;

	ImageIcon[] ballIcons_;


	public Model() {

		ballIcons_ = new ImageIcon[16];
		int it = 0;
		dir = Arrays.asList(new File("./src/Score/Score/BolasR").listFiles());

		//TODO ORDENAR Y COMO LEER DEL FICHERO CORRECTO, AHORA ESTÁ LEYENDO DEL MISMO LUGAR DONDE ESTÁ COLOCADO ESTE FICHERO
		Collections.sort(dir); //No ordena

		System.out.println(dir);

		for(File file : dir) {
			ballIcons_[it] = new ImageIcon(file.getAbsolutePath());
			Image image = ballIcons_[it].getImage(); // transform it
			Image newimg = image.getScaledInstance(25, 25,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
			ballIcons_[it] = new ImageIcon(newimg);  // transform it back
			it++;
		}
  }



  public void updateBalls(Rectangle boardDimensions) {
    for(Ball ball : balls_) {
      ball.update(boardDimensions);
    }
  }

  public void addBall(int x, int y) {
    balls_.add(new Ball(x, y, ballIcons_[rand.nextInt(ballIcons_.length)]));
  }

  public List<Ball> getBalls() {
    return balls_;
  }
}
