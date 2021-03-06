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
public class Score<T> {

	//Stripes = bolas rayadas
	//Solid = bolas lisas
	private ArrayList<T> balls;
	
	/**
	 * Default constructor
	 */
	public Score() {
		balls = new ArrayList<T>();
	}
	
	/**
	 * Returns how many balls has been scored
	 * @return
	 */
	public int size() {
		return balls.size();
	}
	
	/**
	 * Return the array of balls that have been scored
	 * @return
	 */
	public ArrayList<T> getScoredBalls(){
		return balls;
	}
	
	/**
	 * Returns de ball in the position pos
	 * @param pos
	 * @return
	 */
	public T getBall(int pos) {
		return balls.get(pos);
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
		//TODO
		return balls.get(0);
	}
	
	/**
	 * Returns the scored solid balls
	 * @return
	 */
	public T getSolid() {
		//TODO
		return balls.get(0);
	}
	
}
