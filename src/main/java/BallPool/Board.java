package BallPool;
import java.awt.geom.Point2D;

/**
 * 
 * @author 8BallPool team
 *
 */

public class Board {

	private double width_;
	private double height_;
	private double holeRadio_;
	/**
	 * 
	 */
	public Board() {
		width_ = 0.0;
		height_ = 0.0;
		holeRadio_ = 0.0;
	}
	public Board(double width) {
		width_ = width;
		height_ = width_/2;
		holeRadio_ = width_/12;
	}
	public boolean isHole(double x,double y) {
		if((x>=0 && x<= holeRadio_) 
				|| (x>=width_/2-holeRadio_ && x<=width_/2+holeRadio_)
				|| (x>=width_-holeRadio_ && x<=width_)) {
			if((y>=0 && y<=holeRadio_)
					|| (y>= height_ -holeRadio_ && y<=height_))
						return true;
		}
		return false;
	}
	public Point2D.Double[] getHoles() {
		Point2D.Double[] Holes= new Point2D.Double[6];
		Holes[0] = new Point2D.Double(0,0);
		Holes[1] = new Point2D.Double(width_/2,0);
		Holes[2] = new Point2D.Double(width_,0);
		Holes[3] = new Point2D.Double(0,height_);
		Holes[4] = new Point2D.Double(width_/2,height_);
		Holes[5] = new Point2D.Double(width_,height_);
		return Holes;
	}
	public double getWidth() {
		return width_;
	}
	public double getHeight() {
		return height_;
	}
	public double getHoleRadio() {
		return holeRadio_;
	}
	public void resize(double width) {
		width_ = width;
		height_ = width_/2;
		holeRadio_ = width_/12;
	}
}