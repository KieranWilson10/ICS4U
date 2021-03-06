package wilson;

import java.awt.Color;
import java.awt.Graphics;
/**
 * This class controls the guard balls inside the main method.
 * This class extends MovingObject.
 * @author Kieran Wilson
 */
public class GaurdBalls extends MovingObject {
	/**
	 * The radius of the guard balls.
	 */
	private int radius;
	
	/**
	 * This class initializes all of the variables needed to create the guard ball class.
	 * @param x
	 * @param y
	 * @param left
	 * @param right
	 * @param top
	 * @param bottom
	 */
	public GaurdBalls(double x, double y, int left, int right, int top, int bottom) {
		super(x, y, left - 75, right + 75, top -75, bottom + 75);
		radius = 75;
	}
	/**
	 * This method draws the guard balls.
	 */
	@Override
	public void draw(Graphics g) {
		int drawX = (int) getX() - radius;
		int drawY = (int) getY() - radius;

		g.setColor(color);
		g.fillOval(drawX, drawY, radius * 2, radius * 2);	
		
	}

	@Override
	public void animateOneStep() {
		
		
	}

}
