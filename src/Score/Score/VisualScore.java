package Score;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.util.*;
import javax.swing.*;

/**
 * Class VisualScore
 * In charge of painting the score of the game
 * @author cristian
 *
 * @param Score			In charge of managing the score
 */
public class VisualScore<T> extends JPanel {

	Score score;
	ImageIcon[] balls;
	List<File> dir;
	public VisualScore(){
		score = new Score<Integer>();
		//Todo esto iria en la clase donde se construyen las bolas-----------------------------------
		balls = new ImageIcon[16];
		int it = 0;
		dir = Arrays.asList(new File("/home/cristian/Escritorio/8BallPool/src/Score/BolasR").listFiles());
		//TODO ORDENAR Y COMO LEER DEL FICHERO CORRECTO, AHORA ESTÁ LEYENDO DEL MISMO LUGAR DONDE ESTÁ COLOCADO ESTE FICHERO
		Collections.sort(dir); //No ordena
		for(File file : dir) {
			balls[it] = new ImageIcon(this.getClass().getResource(file.getName()));
			Image image = balls[it].getImage(); // transform it 
			Image newimg = image.getScaledInstance(25, 25,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
			balls[it] = new ImageIcon(newimg);  // transform it back
			it++;
		}
		//-------------------------------------------------------------------------------

	}
	
	/**
	 * Adds ball to the score
	 * @param ball
	 */
	public void addBall(T ball) {
		score.addBall(ball);
	}

	/**
	 * Resets score
	 */
	public void resetScore() {
		score.resetScore();
	}
	
	/**
	 * Paints the score
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g2.setColor(Color.RED);
		int x = 10, y = 10;
		g.drawRect(8, 8, 25*16 + 3, 28);
		for(int i = 0; i < balls.length; i++) {
			g.drawImage(balls[i].getImage(), x, y, null);
			x += 25;
		}
		/*for(int i = 0; i < score.size(); i++) {
			g.drawImage(score.get(i).getImage(), x, y, null);
			x += 25;
		}*/
	}
}
