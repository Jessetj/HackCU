package gui;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.JTextField;



public class window2 {

	private JFrame frame;
	//private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window2 window = new window2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Study Priority Percentages Calculated");
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel textBox = new JPanel();
		textBox.setLayout(new GridLayout(10, 10));
		
		JLabel labelBox = new JLabel();
		labelBox.setText("Study Guide Percentage");
		
		textBox.add(labelBox);
		
		frame.getContentPane().add(textBox);
		frame.setVisible(true);

	}
}
