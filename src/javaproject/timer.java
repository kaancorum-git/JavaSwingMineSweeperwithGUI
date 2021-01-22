package javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class timer {

	private static JFrame frame;
	static Timer tm;
	static int i=0;
	public static void close() {
		frame.setVisible(false);
		
	}

	public static void stop() {
		tm.stop();
	}
	public static int getTm() {
		i=i-1;
		return i;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timer window = new timer();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public timer() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(1000,200);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("TIME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(162, 43, 213, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_1.setBounds(207, 79, 219, 100);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		
		JButton buttonstart = new JButton("START!");
		buttonstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MineSweeper oyun =new MineSweeper();
				tm.start();
			}
		});
		
			
		
		buttonstart.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		
		buttonstart.setBounds(22, 92, 136, 57);
		frame.getContentPane().add(buttonstart);
		
		JButton btnreturnmenu = new JButton("Return to Menu");
		btnreturnmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MineSweeper.close();
				frame.setVisible(false);
				tm.stop();
				i=0;
				Menu go = new Menu();
			}
		});
		btnreturnmenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnreturnmenu.setBounds(165, 189, 213, 44);
		frame.getContentPane().add(btnreturnmenu);
		frame.setVisible(true);
		
		tm = new Timer(1000, new ActionListener() {
			   
			   @Override
			   public void actionPerformed(ActionEvent e) {
			    
				lblNewLabel_1.setText(Integer.toString(i));
			    i++;
			    
			   }
			  });
			
			
	}
}
