package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField t1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(168, 11, 201, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblt1 = new JLabel("Username");
		lblt1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblt1.setBounds(50, 100, 123, 24);
		frame.getContentPane().add(lblt1);
		
		JLabel lablet2 = new JLabel("Password");
		lablet2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lablet2.setBounds(50, 154, 167, 24);
		frame.getContentPane().add(lablet2);
		
		t1 = new JTextField();
		t1.setBounds(229, 108, 167, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				JOptionPane.showMessageDialog(btnNewButton, "Hey! "+name+" Your registration is successful");                          
			}
		});
		btnNewButton.setBounds(278, 207, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(227, 162, 169, 20);
		frame.getContentPane().add(passwordField);
	}
}
