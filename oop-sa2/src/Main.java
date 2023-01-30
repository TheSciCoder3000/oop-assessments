import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class Main {
	private JFrame frame;
	JLayeredPane layeredPane = new JLayeredPane();
	Light light = new Light();
	Road road = new Road();
	JLabel Counter;
	
	// Moving car objects
	CarPanel lrCarPanel = new CarPanel("/res/anemo_samachurl_low.png", 0, 140, 630, 140, 10, 0);
	CarPanel rlCarPanel = new CarPanel("/res/anemo_samachurl_flip.png", 500, 250, 0, 250, -10, 0);
	CarPanel tbCarPanel = new CarPanel("/res/anemo_samachurl_low.png", 220, -15, 220, 480, 0, 10);
	CarPanel btCarPanel = new CarPanel("/res/anemo_samachurl_low.png", 340, 360, 340, 0, 0, -10);
	
	// moving pedestrians
	PedestrianPanel tbPedPanel = new PedestrianPanel("/res/klee.png", 420, 350, 340, 40, 0, -7);
	PedestrianPanel lrPedPanel = new PedestrianPanel("/res/yaoyao.png", 120, 45, 400, 45, 7, 0);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Main();
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
		Timer timer = new Timer(1000, new TimerListener());		// timer for updating the traffic counter
		timer.start();
	}
	
	class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			light.decreaseCounter();
			Counter.setText("" + light.counter);
			if (light.counter == 0) {
				if (light.moving == "NS") {
					lrCarPanel.stop(true);
					rlCarPanel.stop(true);
					tbCarPanel.run();
					btCarPanel.run();
					lrPedPanel.stop(true);
					tbPedPanel.run();
				} else {
					lrCarPanel.run();
					rlCarPanel.run();
					tbCarPanel.stop(true);
					btCarPanel.stop(true);
					lrPedPanel.run();
					tbPedPanel.stop(true);
				}
			}
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// initialize window properties
		frame = new JFrame();
		frame.setResizable(false);
		frame.setSize(640, 480);
		frame.setTitle("Traffic Lights");
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.getContentPane().add(layeredPane);
		
		// adding lights layer
		light.setBounds(0, 0, 640, 480);
		layeredPane.add(light);

		// adding cars and pedestrians
		lrCarPanel.setBounds(0, 0, 640, 480);
		rlCarPanel.setBounds(0, 0, 640, 480);
		tbCarPanel.setBounds(0, 0, 640, 480);
		btCarPanel.setBounds(0, 0, 640, 480);
		tbPedPanel.setBounds(0, 0, 640, 480);
		lrPedPanel.setBounds(0, 0, 640, 480);
		layeredPane.add(lrCarPanel);
		layeredPane.add(rlCarPanel);
		layeredPane.add(tbCarPanel);
		layeredPane.add(btCarPanel);
		layeredPane.add(tbPedPanel);
		layeredPane.add(lrPedPanel);
		
		// adding roads layer
		road.setBounds(0, 0, 640, 480);
		layeredPane.add(road);
		
		// adding counter label
		Counter = new JLabel("20");
		Counter.setHorizontalAlignment(SwingConstants.CENTER);
		Counter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Counter.setOpaque(true);
		Counter.setBackground(Color.white);
		Counter.setBounds(0, 0, 90, 50);
		
		layeredPane.add(Counter);
		
		
		
	}
}
