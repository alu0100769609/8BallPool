package BallPool;
import java.awt.Point;

/**
 * 
 * @author 8BallPool team
 *
 */

public class Board {

	private int width_;
	private int height_;
	private double holeRadio_;
	private Point holes[];
	private int posX;
	private int posY;

	/**
	 * 
	 */
	public Board() {
	    this(0, 0, 0);
	}
	
	public Board(int width, int posX, int posY) {
		width_ = width;
		height_ = width_/2;
		holeRadio_ = width_/24;
		holes = new Point[6];
		this.posX = posX;
		this.posY = posY;
		calcHoles();
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
	
	public void calcHoles() {
		holes[0] = new Point(posX + 0 - (int)(holeRadio_ / 2), posY + 0 - (int)(holeRadio_ / 2));
		holes[1] = new Point(posX + width_/2 - (int)(holeRadio_ / 2), posY + 0 - (int)(holeRadio_ / 2));
		holes[2] = new Point(posX + width_ - (int)(holeRadio_ / 2), posY + 0 - (int)(holeRadio_ / 2));
		holes[3] = new Point(posX + 0 - (int)(holeRadio_ / 2), posY + height_ - (int)(holeRadio_ / 2));
		holes[4] = new Point(posX + width_/2 - (int)(holeRadio_ / 2), posY + height_ - (int)(holeRadio_ / 2));
		holes[5] = new Point(posX + width_ - (int)(holeRadio_ / 2), posY + height_ - (int)(holeRadio_ / 2));
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
	public void resize(int width) {
		width_ = width;
		height_ = width_/2;
		holeRadio_ = width_/24;
		calcHoles();
	}

    public Point[] getHoles() {
        return holes;
    }

    public void setHoles(Point[] holes) {
        this.holes = holes;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}