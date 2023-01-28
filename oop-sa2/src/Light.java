import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Light extends JPanel{
	int counter = 1;
	String moving = "WE";			// direction of moving cars
	int trafficLimit = 10;			// max traffic counter
	int yellowThresh = 4;			// value before yellow stop light
	
	public void decreaseCounter() {
		if (counter == 0) {
			moving = moving == "NS" ? "WE" : "NS";
			repaint();
			counter = trafficLimit;
		} else {
			counter--;
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		if (moving == "NS") {
			//north-south pedestrian light
			setPedLightNS(g, false, true);
			
			//west-east pedestrian light
			setPedLightWE(g, true, false);
			
			//north-south traffic light
			setTrafficNS(g, true, false, false);
			
			//west-east traffic light
			if (counter <= yellowThresh) {
				setTrafficWE(g, false, true, false);
			} else {
				setTrafficWE(g, false, false, true);				
			}
			
		} else {
			//north-south pedestrian light
			setPedLightNS(g, true, false);
			
			//west-east pedestrian light
			setPedLightWE(g, false, true);
			
			//north-south traffic light
			if (counter <= yellowThresh) {
				setTrafficNS(g, false, true, false);
			} else {
				setTrafficNS(g, false, false, true);				
			}
			
			//west-east traffic light
			setTrafficWE(g, true, false, false);
		}
		
	}
	
	private void setPedLightNS(Graphics g, boolean red, boolean green) {
		g.setColor(red ? Color.red : Color.gray);
		g.fillOval(180, 100, 15, 15);
		g.setColor(green ? Color.green : Color.gray);
		g.fillOval(160, 100, 15, 15);
	}
	
	private void setPedLightWE(Graphics g, boolean red, boolean green) {
		g.setColor(red ? Color.red : Color.gray);
		g.fillOval(425, 345, 15, 15);
		g.setColor(green ? Color.green : Color.gray);
		g.fillOval(425, 365, 15, 15);
	}
	
	private void setTrafficNS(Graphics g, boolean red, boolean yellow, boolean green) {
		g.setColor(red ?  Color.red : Color.gray);
		g.fillOval(390, 215, 25, 25);
		g.setColor(yellow ? Color.yellow : Color.gray);
		g.fillOval(360, 215, 25, 25);
		g.setColor(green ? Color.green : Color.gray);
		g.fillOval(330, 215, 25, 25);
	}
	
	private void setTrafficWE(Graphics g, boolean red, boolean yellow, boolean green) {
		g.setColor(red ?  Color.red : Color.gray);
		g.fillOval(300, 125, 25, 25);
		g.setColor(yellow ? Color.yellow : Color.gray);
		g.fillOval(300, 155, 25, 25);
		g.setColor(green ? Color.green : Color.gray);
		g.fillOval(300, 185, 25, 25);
		
	}
}
