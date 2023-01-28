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
	public static Image image;
	Timer timer = new Timer(50, new TimerListener());
	int origX, origY;
	int x, y;
	int maxX, maxY;
	int stepX, stepY;
	boolean loop = true;
	
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
	
	public boolean withinRange(int curr, int min, int max) {
		// if min is less than max
		if (min < max) {
			return (curr >= min && curr <= max);
		} else {
			return (curr >= max && curr <= min);
		}
	}
	
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
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, x, y, this);
	}
	
	public void run() {
		timer.start();
	}
	
	public void stop() {
		timer.stop();
	}
	
	public void stop(boolean reset) {
		timer.stop();
		if (reset) {
			x = origX;
			y = origY;
			repaint();
		}
	}
}
