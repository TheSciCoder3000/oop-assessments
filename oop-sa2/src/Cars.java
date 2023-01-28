import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Cars extends JLabel {
//	public void paint(Graphics g) {
//		g.setColor(Color.red);
//		g.fillRect(0, 0, 50, 20);
//	}
	Timer timer = new Timer(50, new TimerListener());
	
	Cars(String res) {
		super("test");
		setBackground(Color.red);
		setIcon(new ImageIcon(Main.class.getResource(res)));
	}
	
	public void run() {
		timer.start();
	}
	
	class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setLocation(getX()+10, getY());
		}
		
	}
}
