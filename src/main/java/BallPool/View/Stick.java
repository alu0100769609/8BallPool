package BallPool.View;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

/**
 * Billiards' stick.
 */
public class Stick {
	
	// Stick's initial height
	private static final int DEFAULT_HEIGHT = 300;
	// Stick's thickness
	private static final int THICKNESS = 3;
	
	// Angle in radians
	private double angle = 0;
	// Stick's origin and height
	private int x, y, h;
	
	/**
	 * Default constructor. Do nothing
	 */
	public Stick() {}
	
	/**
	 * Construct the stick starting at (x, y) coordinates
	 */
	public Stick(int x, int y) {
		setOrigin(x, y);
		setHeight(DEFAULT_HEIGHT);
	}
	
	/**
	 * Set stick's origin to (x, y)
	 */
	public void setOrigin(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Set stick's height
	 */
	public void setHeight(int h) {
		this.h = h;
	}
	
	/**
	 * @return	stick's angle
	 */
	public double getAngle() {
		return angle;
	}
	
	/**
	 * Set sticks's angle
	 * @param angle
	 */
	public void setAngle(double angle) {
		this.angle = angle;
	}
	
	
	/**
	 * Draw the stick
	 */
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		AffineTransform originalTransform = g2.getTransform();
		Stroke originalStroke = g2.getStroke();
		
		g2.setColor(Color.YELLOW);
		g2.setStroke(new BasicStroke(THICKNESS));
		g2.translate(x, y);
		g2.rotate(angle);
		g2.drawLine(0, 0, 0, h);
		
		g2.setStroke(originalStroke);
		g2.setTransform(originalTransform);
	}
	
}