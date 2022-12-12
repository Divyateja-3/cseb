package cse_project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecommerce {
    int i=0;
    int total=0;
  
    
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerce window = new ecommerce();
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
	public ecommerce() {
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
		
		JLabel h1 = new JLabel("cart-");
		h1.setFont(new Font("Tahoma", Font.BOLD, 11));
		h1.setBounds(356, 11, 68, 14);
		frame.getContentPane().add(h1);
		
		JLabel lblcost = new JLabel("total-");
		lblcost.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblcost.setBounds(356, 31, 68, 14);
		frame.getContentPane().add(lblcost);
		
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setBounds(181, 11, 111, 43);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(65, 54, 130, 155);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Desktop\\1.JPG"));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(257, 54, 130, 155);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Desktop\\2.JPG"));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rs-200");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(103, 218, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rs-250");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(305, 220, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				h1.setText("cart:"+i);
				total=total+200;
				lblcost.setText("cost:"+total);
			}	}
		);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(74, 238, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to card");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				h1.setText("cart:"+i);
				total=total+250;
				lblcost.setText("cost:"+total);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(273, 238, 114, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		
	}

}
