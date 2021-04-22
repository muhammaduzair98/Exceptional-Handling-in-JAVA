package pkg;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
/**
 * 
 * @author M.ROHAN FAROOQUI
 *Registration forum 
 */
public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField txtRollNo;
	private JTextField txtName;
	private JTextField txtFName;
	private JTextField txtEmail;
	private JComboBox cmbGender;
	private static controller con;
	private static Gui frame;
	private static Test_Option test;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//Gui frame;
				
				frame = new Gui();
				frame.setVisible(true);
				con = new controller(null,frame,null,null,null);
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRollNo = new JLabel("Roll No: ");
		lblRollNo.setBounds(28, 87, 64, 20);
		contentPane.add(lblRollNo);
		
		txtRollNo = new JTextField();
		txtRollNo.setBounds(128, 87, 141, 20);
		contentPane.add(txtRollNo);
		txtRollNo.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(28, 127, 52, 20);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(128, 127, 141, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setBounds(28, 170, 99, 20);
		contentPane.add(lblFathersName);
		
		txtFName = new JTextField();
		txtFName.setBounds(128, 170, 141, 20);
		contentPane.add(txtFName);
		txtFName.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(28, 209, 64, 20);
		contentPane.add(lblGender);
		
		cmbGender = new JComboBox();
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		cmbGender.setBounds(128, 209, 141, 20);
		contentPane.add(cmbGender);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(28, 251, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(128, 248, 141, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String a = txtRollNo.getText();
				String b = txtName.getText();
				String c = cmbGender.getSelectedItem().toString();
				String d = txtEmail.getText();
				String e = txtFName.getText();
				if(a.length() != 0 & b.length() != 0 & d.length() != 0 & e.length() != 0) {
				      boolean too= con.fetch(txtRollNo.getText(), txtName.getText(), cmbGender.getSelectedItem().toString(), txtEmail.getText(), txtFName.getText());
				      if(too == true) {
				       hide();
				       test.main(null);}}
				else {
					JOptionPane.showMessageDialog(null, "Please Fill All Field !!");
					
				}
			}
			    
			    
		});
		btnRegister.setBounds(223, 292, 89, 23);
		contentPane.add(btnRegister);
		
		JLabel lblStudentRegistrationForm = new JLabel("Student Registration Form");
		lblStudentRegistrationForm.setFont(new Font("Arial Black", Font.PLAIN, 17));
		lblStudentRegistrationForm.setBounds(34, 25, 247, 20);
		contentPane.add(lblStudentRegistrationForm);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				test.main(null);
				
			}
		});
		btnNewButton.setBounds(38, 293, 89, 21);
		contentPane.add(btnNewButton);
	}
}
