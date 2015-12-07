package wilson;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015
 * 
 * @author Christina Kemp adapted from Sam Scott
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, KeyListener{

	static int playerX = 50;
	static int playerY = 50;
	int width = 500;
	int height = 300;

	/**
	 * The number of balls on the screen.
	 */
	final static int numBalls = 50;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 50;
	/**
	 * An array of balls.
	 */
	static FlashingBall[] ball = new FlashingBall[numBalls];

	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Squares Vs Circles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();
		
		
		
		KeyListener k = new KeyListener(){
			
		@Override
		public void keyPressed(KeyEvent e) {
			char key = e.getKeyChar();	
			
			for(int i = 0; i < numBalls ;i++ ){
				if(ball[i].getX()+12 >= playerX  &&  ball[i].getX()-12 <= playerX && ball[i].getY()+12 >= playerY && ball[i].getY()-12 <= playerY ){			
					ball[i].setX(-90000);
				}
			}
			
			if(key == 'W' || key == 'w'&& playerY >= 0 && playerY <= 275){
				playerY = playerY -5;
				if(playerY <= 0){
					playerY = 0;
				}
				if(playerY >= 275){
					playerY = 274;
				}
			}
			if(key == 'S' || key == 's'&& playerY >= 0 && playerY <= 275){
				playerY = playerY +5;
				if(playerY <= 0){
					playerY = 0;
				}
				if(playerY >= 275){
					playerY = 274;
				}
			}
			if(key == 'A' || key == 'a' && playerX >= 0 && playerX <= 475){
				playerX = playerX - 5;
				if(playerX <= 0){
					playerX = 0;
				}
				if(playerX >= 475){
					playerX = 474;
				}
			}
			if(key == 'D' || key == 'd' && playerX >= 0 && playerX <= 475){
				playerX = playerX + 5;
				if(playerX <= 0){
					playerX = 0;
				}
				if(playerX >= 475){
					playerX = 474;
				}
				
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		@Override
		public void keyTyped(KeyEvent e) {			
			
		}
		};frame.addKeyListener(k);


	}

	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);
		
		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(50, 50, 0, width, 0, height);
			ball[i].setXSpeed(Math.random() * 16-8);
			ball[i].setYSpeed(Math.random() * 16-8);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math
					.random() * 256), (int) (Math.random() * 256)));
		}
		
		
		Thread gameThread = new Thread(this);
		gameThread.start();

	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}

	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(g);
		}
		g.setColor(Color.CYAN);
		g.fillRect(playerX, playerY, 25, 25);	
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
