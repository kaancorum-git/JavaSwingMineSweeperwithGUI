package javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Menu() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 466);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblmenu = new JLabel("MENU");
		lblmenu.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblmenu.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnStart = new JButton("START THE GAME!");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				timer go = new timer();
				frame.setVisible(false);
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnscores = new JButton("HIGHSCORES");
		btnscores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					highscores go4 = new highscores();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				frame.setVisible(false);
				
			}
		});
		btnscores.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnrules = new JButton("GAME RULES");
		btnrules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rules rule = new rules();
				frame.setVisible(false);
			}
		});
		btnrules.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		JButton btnreturn = new JButton("RETURN");
		btnreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				login go = new login();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(181)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnscores, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
						.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblmenu, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
							.addComponent(btnStart, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
							.addComponent(btnrules, GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(63)
					.addComponent(btnreturn, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(43))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblmenu, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnscores, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnrules, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(357, Short.MAX_VALUE)
					.addComponent(btnreturn, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
}
