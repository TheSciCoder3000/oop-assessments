import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class PedestrianPanel extends JPanel{
	public static Image image;				// image container for pedestrians
	Timer timer = new Timer(50, new TimerListener());
	int origX, origY;						// original coordinates
	int x, y;								// current coordinates
	int maxX, maxY;							// max coordinates before reset
	int stepX, stepY;
	boolean loop = true;					// if animation is loop or not
	
	class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			x += stepX;
			y += stepY;
			if (!withinRange(x, origX, maxX) || !withinRange(y, origY, maxY) ) {
				if (loop) {
					x = origX;
					y = origY;
				} else {
					timer.stop();					
				}
			}
			repaint();
		}
		
	}
	
	// helper function if current coordinate is within range
	public boolean withinRange(int curr, int min, int max) {
		// if min is less than max
		if (min < max) {
			return (curr >= min && curr <= max);
		} else {
			return (curr >= max && curr <= min);
		}
	}
	
	// Constructor
	public PedestrianPanel(String imgPath, int corx, int cory, int mX, int mY, int sX, int sY) {
		origX = corx;
		origY = cory;
		x = corx;
		y = cory;
		maxX = mX;
		maxY = mY;
		stepX = sX;
		stepY = sY;
		setOpaque(false);
		
		try {               
			image = ImageIO.read(Main.class.getResource(imgPath));
		} catch (IOException e) {
			//Not handled.
		}
	}
	
	// main paint component for drawing the image
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, x, y, this);
	}
	
	// function for starting animation outside the class
	public void run() {
		timer.start();
	}
	
	// function for stopping the animation outside the class
	public void stop() {
		timer.stop();
	}
	
	// stop method overloaded
	public void stop(boolean reset) {
		timer.stop();
		if (reset) {
			x = origX;
			y = origY;
			repaint();
		}
	}
}
