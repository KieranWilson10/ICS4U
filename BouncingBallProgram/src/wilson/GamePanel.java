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

	static int playerX = 500;
	static int playerY = 300;
	int width = 1000;
	int height = 600;
	static int score = 0;
	static int lives = 3;
	final private static int GAURD_BALLS = 5;
	
	/**
	 * The number of balls on the screen.
	 */
	final static int numBalls = 100;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 50;
	/**
	 * An array of balls.
	 */
	static FlashingBall[] ball = new FlashingBall[numBalls];
	static GaurdBalls[] guardBall = new GaurdBalls[GAURD_BALLS];

	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Squares Vs Circles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1000, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();
		
		
		
		KeyListener k = new KeyListener(){
		
		/**
		 * Gets input from the user when a key is pressed, if the key is pressed collision is enabled.
		 * The collision works for the player along the walls and agianst the other balls.
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			char key = e.getKeyChar();	
			
			for(int i = 0; i < numBalls ;i++ ){
				if(ball[i].getX()+22 >= playerX  &&  ball[i].getX()-22 <= playerX && ball[i].getY()+22 >= playerY && ball[i].getY()-22 <= playerY ){			
					ball[i].setX(-90000);
					for( int j = 0 ; j < numBalls; j++){
							ball[j].setColor(new Color((int) (Math.random() * 256), (int) (Math
							.random() * 256), (int) (Math.random() * 256)));
					}
					score = score +1;
				}
			}
			for(int i = 0; i < guardBall.length ;i++ ){
				if(guardBall[i].getX()+75 >= playerX  &&  guardBall[i].getX()-75 <= playerX && guardBall[i].getY()+75 >= playerY && guardBall[i].getY()-75 <= playerY ){			
					lives--;
					for( int j = 0 ; j < guardBall.length; j++){
							playerX = 50;
							playerY = 500;
							guardBall[j].setColor(new Color((int) (Math.random() * 256), (int) (Math
							.random() * 256), (int) (Math.random() * 256)));
					}
					score = score +1;
				}
			}
			
			if(key == 'W' || key == 'w'&& playerY >= 0 && playerY <= 575){
				playerY = playerY -5;
				if(playerY <= 0){
					playerY = 0;
				}
				if(playerY >= 575){
					playerY = 574;
				}
			}
			if(key == 'S' || key == 's'&& playerY >= 0 && playerY <= 575){
				playerY = playerY +5;
				if(playerY <= 0){
					playerY = 0;
				}
				if(playerY >= 575){
					playerY = 574;
				}
			}
			if(key == 'A' || key == 'a' && playerX >= 0 && playerX <= 975){
				playerX = playerX - 5;
				if(playerX <= 0){
					playerX = 0;
				}
				if(playerX >= 975){
					playerX = 974;
				}
			}
			if(key == 'D' || key == 'd' && playerX >= 0 && playerX <= 975){
				playerX = playerX + 5;
				if(playerX <= 0){
					playerX = 0;
				}
				if(playerX >= 975){
					playerX = 974;
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
		for (int i = 0; i < guardBall.length; i++) {
			guardBall[i] = new GaurdBalls(Math.random() * 1000, Math.random()* 600, 0, width, 0, height);
			guardBall[i].setXSpeed(Math.random()*4);
			guardBall[i].setYSpeed(Math.random()*4);
			guardBall[i].setColor(new Color((int) (Math.random() * 256), (int) (Math
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
		for (int i = 0; i < guardBall.length; i++) {
			guardBall[i].draw(g);
		}
		g.setColor(Color.BLACK);
		g.fillRect(playerX, playerY, 40, 40);
		String scoreString = "Balls Collected - " + score + " / " + numBalls;
		g.drawString(scoreString,20, 20);
		String liveString = "Lives Remaining " + lives + " / 3";
		g.drawString(liveString, 800, 20);
		if(score == numBalls){
			g.drawString("You Win", 200, 150);
		}
		if(lives <= 0){
			 System.exit(0);
		}
		
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
