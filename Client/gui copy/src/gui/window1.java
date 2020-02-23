package gui;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class window1{

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window1 window = new window1();
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
	
	

	public window1() {
		initialize();
	}
	
	public void getActionCommand(ActionEvent action) {
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Study Priority Percentages");
		frame.setSize(500, 500);
		//frame.set
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel textBox = new JPanel();
		
		textBox.setLayout(new GridLayout(8, 8));
		
		JLabel labelBox = new JLabel();
		labelBox.setText("Insert Powerpoint as a txt file:");
		
		JTextField field = new JTextField();
		
		textBox.add(labelBox);
		textBox.add(field);
		
		JButton button = new JButton("Enter");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action) {
				window2 windowTwo = new window2();
				windowTwo.NewScreen();
			}
		});
		button.setSize(25, 25);
		textBox.add(button);
		
		frame.getContentPane().add(textBox);
		frame.setVisible(true);
	}

}
