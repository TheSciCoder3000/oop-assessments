import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Road extends JPanel{

	public void paint(Graphics g) {
		//north-south road
		g.setColor(Color.black);
		g.fillRect(200, 0, 220, 480);
		
		//west-east road
		g.setColor(Color.black);
		g.fillRect(0, 120, 640, 220);
		
		//pedestrian
		g.setColor(Color.white);
		g.fillRect(203, 65, 5, 50);
		g.fillRect(218, 65, 5, 50);
		g.fillRect(233, 65, 5, 50);
		g.fillRect(248, 65, 5, 50);
		g.fillRect(263, 65, 5, 50);
		g.fillRect(278, 65, 5, 50);
		g.fillRect(293, 65, 5, 50);
		g.fillRect(308, 65, 5, 50);
		g.fillRect(323, 65, 5, 50);
		g.fillRect(338, 65, 5, 50);
		g.fillRect(353, 65, 5, 50);
		g.fillRect(368, 65, 5, 50);
		g.fillRect(383, 65, 5, 50);
		g.fillRect(398, 65, 5, 50);
		g.fillRect(413, 65, 5, 50);
		//
		g.fillRect(425, 123, 50, 5);
		g.fillRect(425, 138, 50, 5);
		g.fillRect(425, 153, 50, 5);
		g.fillRect(425, 168, 50, 5);
		g.fillRect(425, 183, 50, 5);
		g.fillRect(425, 198, 50, 5);
		g.fillRect(425, 213, 50, 5);
		g.fillRect(425, 228, 50, 5);
		g.fillRect(425, 243, 50, 5);
		g.fillRect(425, 258, 50, 5);
		g.fillRect(425, 273, 50, 5);
		g.fillRect(425, 288, 50, 5);
		g.fillRect(425, 303, 50, 5);
		g.fillRect(425, 318, 50, 5);
		g.fillRect(425, 333, 50, 5);
		
	}
}