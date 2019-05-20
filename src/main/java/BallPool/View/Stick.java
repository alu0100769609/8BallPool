package BallPool.View;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;

/**
 * Billiards' stick.
 * It paint itself with a gap beetween its origin and the actual stick and rotates arround it.
 */
public class Stick {
	
	// Stick's initial height
	private static final int DEFAULT_HEIGHT = 300;
	// Stick's initial gap
	private static final int DEFAULT_GAP = 10;
	// Stick's thickness
	private static final int THICKNESS = 3;
	
	// Angle in radians
	private double angle = 0;
	// Stick's origin and height
	private int x, y, h;
	// Stick's gap
	private int gap;
	
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
		setGap(DEFAULT_GAP);
	}
	
	/**
	 * Set stick's gap
	 */
	public void setGap(int gap) {
		this.gap = gap;
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
		g2.drawLine(0, gap, 0, h);
		
		g2.setStroke(originalStroke);
		g2.setTransform(originalTransform);
	}
	
}