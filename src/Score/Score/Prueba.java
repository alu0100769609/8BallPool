package Score;
import javax.swing.*;

public class Prueba extends JFrame {

	VisualScore visualScore;
	public Prueba() {
		visualScore = new VisualScore();
		add(visualScore);
	}

	
	public static void main(String[] args) {
	    Prueba frame = new Prueba();
	    frame.setLocationRelativeTo(null); // Center the frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(1000, 1000);
	    frame.setVisible(true);
	  }

	
}
