package Score;
import java.awt.Graphics;

import javax.swing.JPanel;

public class VisualScore extends JPanel {

	Score score;
	public VisualScore(){
		score = new Score<Integer>();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawRect(10, 10, 70, 20);
	}
}
