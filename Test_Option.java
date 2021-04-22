package pkg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Muhammad Uzair
 * main window  Class
 */

public class Test_Option extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private static controller con;
	private static Test_Option frame;
	public  static Gui gui;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					frame = new Test_Option();
					frame.setVisible(true);
					con = new controller(frame,null,null,null,null);
				
			}
		});
	}
	/*
	 * Call Computer test window
	 */
	public void value(String x) {
		con.computer_test(x);
	}
	
	
	
	/**
	 * Create the frame.
	 */
	public Test_Option() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 576, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnComputerScienceTest = new JButton("Computer Science Test");
		btnComputerScienceTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x;
				x = JOptionPane.showInputDialog("Enter Roll No:");
				value(x);}
		});
		btnComputerScienceTest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComputerScienceTest.setBounds(10, 119, 193, 40);
		contentPane.add(btnComputerScienceTest);
		
		JButton btnChemistryTest = new JButton("Chemistry Test");
		btnChemistryTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x;
				x = JOptionPane.showInputDialog("Enter Roll No:");
				con.chem_test(x);;}
		});
		btnChemistryTest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnChemistryTest.setBounds(10, 204, 193, 40);
		contentPane.add(btnChemistryTest);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClose.setBounds(232, 263, 85, 21);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel = new JLabel("Test List & Registration Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(163, 32, 240, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblOr = new JLabel("OR");
		lblOr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOr.setBounds(249, 169, 27, 21);
		contentPane.add(lblOr);
		
		JButton btnNewButton_2 = new JButton("Register for Test");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				gui.main(null);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBounds(341, 159, 193, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnAdmin = new JButton("Admin Login");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				String x = JOptionPane.showInputDialog("Enter User Name :");
				String y = JOptionPane.showInputDialog("Enter Password : ");
				if(x.equals("ADMIN") & y.equals("ADMIN")){admin.main(null);}
				else {
					JOptionPane.showMessageDialog(null, "Wrong Password !! try again");
					Test_Option.main(null);
				}
			}
		});
		btnAdmin.setBounds(436, 21, 112, 21);
		contentPane.add(btnAdmin);
	}
}
