package javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;

public class login {

	JFrame frame;
	private JTextField textField;
	private static String username;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public login() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 545, 308);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO THE MINESWEEPER");
		lblNewLabel.setBounds(133, 44, 219, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username: ");
		lblNewLabel_1.setBounds(48, 137, 108, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(173, 142, 219, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Please enter your username");
		lblNewLabel_2.setBounds(111, 88, 281, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btncontinue = new JButton("Continue");
		btncontinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = textField.getText();
				
				Menu continue1 = new Menu();
				
				frame.setVisible(false);
			}
		});
		btncontinue.setBounds(203, 194, 149, 34);
		frame.getContentPane().add(btncontinue);
		frame.setVisible(true);
	}
	public static String getUsername() {
		return username;
		
	}
}
