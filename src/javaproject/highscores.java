package javaproject;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class highscores {

	private JFrame frame;
	private static JTable table;

	
	public static void main(String[] args){
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					highscores window = new highscores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public highscores() throws Exception {
		initialize();
		createTable();
		post();
		display();
		
	}

	
	public static void display() throws Exception {
		
		try {
			Connection con =getConnection();
			String sql ="select * from MineSweeperScores3";
			PreparedStatement pst =con.prepareStatement(sql);
			ResultSet rs =pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e){System.out.println(e);}
		
		
	}
	
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 543, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 23, 378, 310);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "username", "score"
			}
		));
		
		JButton btnreturn = new JButton("Return to Menu");
		btnreturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Menu return1 = new Menu();
				
				
			}
		});
		btnreturn.setBounds(187, 364, 149, 21);
		frame.getContentPane().add(btnreturn);
		frame.setVisible(true);
	}
	public static void post() throws Exception {
		
		String username2 = login.getUsername();
		int score = timer.getTm();
		try {
			Connection con =getConnection();
			PreparedStatement posted =con.prepareStatement("INSERT INTO MineSweeperScores3(username,score) VALUES ('"+username2+"', '"+score+"')");
			posted.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		
		}
	
	public static void createTable() throws Exception{
		try {
			Connection con = getConnection();
			PreparedStatement create = con.prepareStatement("CREATE TABLE IF NOT EXISTS MineSweeperScores3(id int NOT NULL AUTO_INCREMENT,username varchar(255),score INTEGER,PRIMARY KEY(id))");
			create.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
	public static Connection getConnection() throws Exception{
		
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql:***";
			String username = "***";
			String password = "***";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			
			return conn;
		} catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		return null;
		
	}
}



