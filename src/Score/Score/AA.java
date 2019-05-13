package Score;
import java.util.ArrayList;
/**
 * Class Score
 * Keeps track of the balls scored on the table
 * @author cristian
 *
 * @param quantity 		How many balls has been scored 
 * @param balls			Array of the balls scored
 */
public class AA<T> {

	//Stripes = bolas rayadas
	//Solid = bolas lisas
	private int quantity;
	private ArrayList<T> balls;
	
	/**
	 * Default constructor
	 */
	public AA() {
		balls = new ArrayList<T>();
	}
	
	/**
	 * Returns how many balls has been scored
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Return the arrays of balls that have been scored
	 * @return
	 */
	public ArrayList<T> getScoredBalls(){
		return balls;
	}
	
	/**
	 * Adds a scored ball
	 * @param ball
	 */
	public void addBall(T ball) {
		balls.add(ball);
	}
	
	/**
	 * Resets score by emptying the score array 
	 */
	public void resetScore() {
		balls.clear();
	}
	
	/**
	 * Returns the scored stripes balls
	 * @return
	 */
	public T getStripes() {
		return balls.get(0);
	}
	
	/**
	 * Returns the scored solid balls
	 * @return
	 */
	public T getSolid() {
		return balls.get(0);
	}
	public static void main(String[] args) {
		System.out.println("a");
	}
}
