package javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rules {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rules window = new rules();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public rules() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 430);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbltitle = new JLabel("RULES");
		lbltitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setBounds(167, 23, 293, 40);
		frame.getContentPane().add(lbltitle);
		
		JTextArea textArea = new JTextArea("   Use the left click button on the mouse to select a space on the grid. "
				+ "If you hit a bomb, you lose. The numbers on the board represent how many bombs are       adjacent to a"
				+ " square. For example, if a square has a \"3\" on it, then there are 3     bombs next to that square."
				+ " The bombs could be above, below, right left, or          diagonal to the square. Avoid all the bombs and e"
				+ "xpose all the empty spaces to  win Minesweeper. Tip: Use the numbers to determine where you know a bom"
				+ "b    is. Tip: You can right click a square with the mouse to place a flag where you       think a bomb is. Thi"
				+ "s allows you to avoid that spot.",6,20);
		textArea.setBounds(90, 83, 421, 209);
		 textArea.setLineWrap(true);
		 textArea.setEditable(false);
		frame.getContentPane().add(textArea);
		
		JButton btreturn = new JButton("Return to Menu");
		btreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu return1 = new Menu();
				frame.setVisible(false);
			}
		});
		btreturn.setBounds(193, 321, 183, 40);
		frame.getContentPane().add(btreturn);
		frame.setVisible(true);
	}
}
