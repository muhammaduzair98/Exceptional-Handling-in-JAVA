package pkg;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

/**
 * 
 * @author M.ROHAN FAROOQUI
 *Chemistry test class
 */
public class Chemistry_Test extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private final ButtonGroup buttonGroup_5 = new ButtonGroup();
	private final ButtonGroup buttonGroup_6 = new ButtonGroup();
	private final ButtonGroup buttonGroup_7 = new ButtonGroup();
	private final ButtonGroup buttonGroup_8 = new ButtonGroup();
	private final ButtonGroup buttonGroup_9 = new ButtonGroup();
	private static Test_Option test;
	private static controller con;
	
	public JRadioButton radio_CPU;
	public JRadioButton radio_Graphics_Windows;
	public JRadioButton radio_guidovanrossum;
	public JRadioButton radio_html;
	public JRadioButton radio_hypertextmarkuplanguage;
	public JRadioButton radio_transmitter;
	public JRadioButton radio_bjarnestroustrup;
	public JRadioButton radio_localareanetwork;
	public JRadioButton radio_uniformresourcelocator; 
	public JRadioButton radio_filetransferprotocol;
	public JRadioButton rdbtnNewRadioButton_1;
	public JRadioButton rdbtnNewRadioButton_3;  
	public JRadioButton rdbtnNewRadioButton_5;
	public JRadioButton rdbtnNewRadioButton_7;
	public JRadioButton rdbtnNewRadioButton_8;
	public JRadioButton rdbtnNewRadioButton_11;
	public JRadioButton rdbtnNewRadioButton_13;
	public JRadioButton rdbtnNewRadioButton_15;
	public JRadioButton rdbtnNewRadioButton_17;
	public JRadioButton rdbtnNewRadioButton_19;
	/*
	 * Check Correct Operations
	 */
    
	 
	private int button_handler(java.awt.event.ActionEvent evt)
	{
	 int correct_options =0;
	 int count =0;
	 //correct option
	 if(radio_CPU.isSelected()) {correct_options +=1;count=count+1;}
	 if(radio_Graphics_Windows.isSelected()) {correct_options +=1;count=count+1;}
	 if(radio_guidovanrossum.isSelected()) {correct_options +=1;count=count+1;}
	 if(radio_html.isSelected()) {correct_options +=1;count=count+1;}
	 if(radio_hypertextmarkuplanguage.isSelected()){correct_options +=1;count=count+1;}
	 if(radio_transmitter.isSelected()) {correct_options +=1;count=count+1;}
	 if(radio_bjarnestroustrup.isSelected()) {correct_options +=1;count=count+1;}
	 if(radio_localareanetwork.isSelected()) {correct_options +=1;count=count+1;}
	 if(radio_uniformresourcelocator.isSelected()){correct_options +=1;count=count+1;}
	 if(radio_filetransferprotocol.isSelected()) {correct_options +=1;count=count+1;}
	 //incorrect options
	 if(rdbtnNewRadioButton_1 .isSelected()) {count=count+1;}
	 if(rdbtnNewRadioButton_3 .isSelected()) {count=count+1;}
	 if(rdbtnNewRadioButton_5.isSelected()) {count=count+1;}
	 if(rdbtnNewRadioButton_7.isSelected()) {count=count+1;}
	 if(rdbtnNewRadioButton_8.isSelected()){count=count+1;}
	 if(rdbtnNewRadioButton_11.isSelected()) {count=count+1;}
	 if(rdbtnNewRadioButton_13.isSelected()) {count=count+1;}
	 if(rdbtnNewRadioButton_15.isSelected()) {count=count+1;}
	 if(rdbtnNewRadioButton_17.isSelected()){count=count+1;}
	 if(rdbtnNewRadioButton_19.isSelected()) {count=count+1;}
	 
	 //Now
	 if(count == 10) {return correct_options;}
	 else {return 0;}
	 
	 
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					Chemistry_Test  frame = new Chemistry_Test ();
					frame.setVisible(true);
					con = new controller(null,null,null,null,frame);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Chemistry_Test () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 639);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatIsCpu = new JLabel("1. Percentage of neon in air is");
		lblWhatIsCpu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWhatIsCpu.setBounds(37, 109, 248, 19);
		contentPane.add(lblWhatIsCpu);
		
		JLabel lblWhatsIsGw = new JLabel("2. At every 1 km increase in altitude, air gets about");
		lblWhatsIsGw.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWhatsIsGw.setBounds(37, 156, 331, 13);
		contentPane.add(lblWhatsIsGw);
		
		JLabel lblWhatIs = new JLabel("3. PH of acid rain is");
		lblWhatIs.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWhatIs.setBounds(37, 196, 232, 27);
		contentPane.add(lblWhatIs);
		
		JLabel lblNewLabel = new JLabel("4. Atmosphere is divided in to");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(37, 240, 295, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblHtmlIsAn = new JLabel("5. Preservatives are used to preserve :");
		lblHtmlIsAn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHtmlIsAn.setBounds(36, 293, 282, 13);
		contentPane.add(lblHtmlIsAn);
		
		JLabel lblIsA = new JLabel("6. Corrosive effect on skin is caused by");
		lblIsA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIsA.setBounds(37, 343, 355, 13);
		contentPane.add(lblIsA);
		
		JLabel lblLanIsAn = new JLabel("8. What is fourth step of raw water treatment?");
		lblLanIsAn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLanIsAn.setBounds(37, 427, 314, 13);
		contentPane.add(lblLanIsAn);
		
		JLabel lblUrlIsAn = new JLabel("9. Density of water becomes maximum at :");
		lblUrlIsAn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUrlIsAn.setBounds(37, 465, 295, 13);
		contentPane.add(lblUrlIsAn);
		
		JLabel lblFtpIsAn = new JLabel("10. Out of total amount of water available for human\r\n use is");
		lblFtpIsAn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFtpIsAn.setBounds(37, 497, 331, 38);
		contentPane.add(lblFtpIsAn);
		
		JLabel lblFatherOfC = new JLabel("7. What is source of lead compounds?");
		lblFatherOfC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFatherOfC.setBounds(37, 382, 273, 23);
		contentPane.add(lblFatherOfC);
		
		JLabel lblMcqsTest = new JLabel("BASIC CHEMISTRY  SCIENCE TEST :");
		lblMcqsTest.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblMcqsTest.setBounds(37, 32, 424, 32);
		contentPane.add(lblMcqsTest);
		
		radio_CPU = new JRadioButton("0.00%");
		buttonGroup.add(radio_CPU);
		radio_CPU.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_CPU.setBounds(401, 107, 171, 21);
		contentPane.add(radio_CPU);
		
		rdbtnNewRadioButton_1 = new JRadioButton("0.001%\r\n");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(635, 107, 204, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		radio_Graphics_Windows = new JRadioButton("6.5\u00B0C cooler");
		buttonGroup_1.add(radio_Graphics_Windows);
		radio_Graphics_Windows.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_Graphics_Windows.setBounds(401, 154, 171, 21);
		contentPane.add(radio_Graphics_Windows);
		
		rdbtnNewRadioButton_3 = new JRadioButton("20\u00B0C cooler");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_3.setBounds(635, 154, 171, 21);
		contentPane.add(rdbtnNewRadioButton_3);
		
		radio_guidovanrossum = new JRadioButton("less than 5.6");
		buttonGroup_2.add(radio_guidovanrossum);
		radio_guidovanrossum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_guidovanrossum.setBounds(401, 201, 171, 21);
		contentPane.add(radio_guidovanrossum);
		
		 rdbtnNewRadioButton_5 = new JRadioButton("more than 5.6");
		buttonGroup_2.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_5.setBounds(635, 201, 171, 21);
		contentPane.add(rdbtnNewRadioButton_5);
		
		radio_html = new JRadioButton("4 layers");
		buttonGroup_3.add(radio_html);
		radio_html.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_html.setBounds(401, 243, 105, 21);
		contentPane.add(radio_html);
		
		 rdbtnNewRadioButton_7 = new JRadioButton("3 layers");
		buttonGroup_3.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_7.setBounds(635, 243, 105, 21);
		contentPane.add(rdbtnNewRadioButton_7);
		
		rdbtnNewRadioButton_8 = new JRadioButton("Water");
		buttonGroup_4.add(rdbtnNewRadioButton_8);
		rdbtnNewRadioButton_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_8.setBounds(401, 291, 213, 21);
		contentPane.add(rdbtnNewRadioButton_8);
		
		radio_hypertextmarkuplanguage = new JRadioButton("Food");
		buttonGroup_4.add(radio_hypertextmarkuplanguage);
		radio_hypertextmarkuplanguage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_hypertextmarkuplanguage.setBounds(635, 291, 204, 21);
		contentPane.add(radio_hypertextmarkuplanguage);
		
        radio_transmitter = new JRadioButton("Acids");
		buttonGroup_5.add(radio_transmitter);
		radio_transmitter.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_transmitter.setBounds(401, 341, 105, 21);
		contentPane.add(radio_transmitter);
		
		rdbtnNewRadioButton_11 = new JRadioButton("Mercury");
		buttonGroup_5.add(rdbtnNewRadioButton_11);
		rdbtnNewRadioButton_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_11.setBounds(635, 341, 105, 21);
		contentPane.add(rdbtnNewRadioButton_11);
		
		radio_bjarnestroustrup = new JRadioButton("Exhaust fumes of motor vehicles\r\n");
		buttonGroup_6.add(radio_bjarnestroustrup);
		radio_bjarnestroustrup.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_bjarnestroustrup.setBounds(401, 385, 232, 21);
		contentPane.add(radio_bjarnestroustrup);
		
		rdbtnNewRadioButton_13 = new JRadioButton("Incomplete burning of wood");
		buttonGroup_6.add(rdbtnNewRadioButton_13);
		rdbtnNewRadioButton_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_13.setBounds(635, 382, 204, 21);
		contentPane.add(rdbtnNewRadioButton_13);
		
		radio_localareanetwork = new JRadioButton("Chlorination");
		buttonGroup_7.add(radio_localareanetwork);
		radio_localareanetwork.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_localareanetwork.setBounds(401, 425, 171, 21);
		contentPane.add(radio_localareanetwork);
		
		rdbtnNewRadioButton_15 = new JRadioButton("Sedimentation");
		buttonGroup_7.add(rdbtnNewRadioButton_15);
		rdbtnNewRadioButton_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_15.setBounds(635, 425, 171, 21);
		contentPane.add(rdbtnNewRadioButton_15);
		
		radio_uniformresourcelocator = new JRadioButton("4\u00B0C");
		buttonGroup_8.add(radio_uniformresourcelocator);
		radio_uniformresourcelocator.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_uniformresourcelocator.setBounds(401, 463, 204, 21);
		contentPane.add(radio_uniformresourcelocator);
		
		rdbtnNewRadioButton_17 = new JRadioButton("12\u00B0C");
		buttonGroup_8.add(rdbtnNewRadioButton_17);
		rdbtnNewRadioButton_17.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_17.setBounds(635, 463, 196, 21);
		contentPane.add(rdbtnNewRadioButton_17);
		
		radio_filetransferprotocol = new JRadioButton("0.20%");
		buttonGroup_9.add(radio_filetransferprotocol);
		radio_filetransferprotocol.setFont(new Font("Tahoma", Font.PLAIN, 13));
		radio_filetransferprotocol.setBounds(401, 500, 204, 21);
		contentPane.add(radio_filetransferprotocol);
		
		rdbtnNewRadioButton_19 = new JRadioButton("50%");
		buttonGroup_9.add(rdbtnNewRadioButton_19);
		rdbtnNewRadioButton_19.setFont(new Font("Tahoma", Font.PLAIN, 13));
		rdbtnNewRadioButton_19.setBounds(635, 500, 181, 21);
		contentPane.add(rdbtnNewRadioButton_19);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    int value = button_handler(null);
				if(value==0) {JOptionPane.showMessageDialog(null, "Please Attempt all MCQ's");}
				else if(value != 0) {
					LocalDate x= java.time.LocalDate.now();
					String y = String.valueOf(value);
					                con.test_record(null,"Chemistry Test" , y, x.toString());
					                JOptionPane.showMessageDialog(null, "Your Score is "+ value);
				                     hide();
				                     test.main(null);
				}}});
		
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSubmit.setBounds(487, 560, 85, 21);
		contentPane.add(btnSubmit);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
				test.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(266, 562, 85, 21);
		contentPane.add(btnNewButton);
	}
}
