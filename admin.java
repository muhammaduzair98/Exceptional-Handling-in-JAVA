package pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Muhammad Uzair
 *
 *Admin panel window class
 */
public class admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	
	private Test_Option test;
	private static controller con;
     
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				admin frame = new admin();
				frame.setVisible(true);
				con = new controller(null,null,null,frame,null);
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Admin Panel");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(201, 33, 123, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheTest = new JLabel("Enter the Test name :");
		lblEnterTheTest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterTheTest.setBounds(31, 109, 160, 35);
		contentPane.add(lblEnterTheTest);
		
		textField = new JTextField();
		textField.setBounds(201, 109, 236, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(201, 173, 85, 21);
		contentPane.add(btnAdd);
		
		JLabel label = new JLabel("Enter the Test name :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(31, 214, 160, 35);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(201, 214, 236, 29);
		contentPane.add(textField_1);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(201, 278, 85, 21);
		contentPane.add(btnRemove);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				test.main(null);
			}
		});
		btnClose.setBounds(201, 343, 85, 21);
		contentPane.add(btnClose);
		
		
	}
}
