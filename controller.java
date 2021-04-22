package pkg;

import javax.swing.JOptionPane;
import javax.swing.text.View;
/**
 * 
 * @author M.ROHAN FAROOQUI
 *
 *Controller  class
 */
public class controller {
	
	/*
	 * Define Variables 
	 */
	private  model model; // model
	private Gui view;    // Registration Forum
	private admin a;     // Admin Panel
	private Test_Option test; // Main window
	private Computer_Science_Test comp_test; //Computer Test
	private Chemistry_Test chem_test; //Chemistry Test
	private admin admin; //Admin Window
	public static String roll; //A variable roll to save roll Number in global
    /*
     * Constructor	
     */
	public controller(Test_Option c, Gui g, Computer_Science_Test comp,admin a,Chemistry_Test chem){
	      this.model = new model();
	      this.view = g;
	      this.test = c;
	      this.admin = a;
	      this.comp_test = comp;
	      this.chem_test = chem;}
	
	/*
	 * Register Student for test
	 */
	 public boolean fetch(String roll, String name, String gender, String email, String father) {   //Fetch data from forms 
			this.model.connect();
			if(this.model.check_user_name(name)== false & this.model.check_roll(roll)==  false) {
			            this.model.addStudentData(roll, name,gender,email,father);
			            return true;}
	   else {JOptionPane.showMessageDialog(null, "User is in Data Base !! Please Register with another Name, Roll no");
	         return false;}
	   }
	
	/*
	 * Computer Test
	 */
	public void computer_test(String roll_no)
	{
	 this.model.connect();
	 boolean value = this.model.check_roll(roll_no);
	 boolean date  = this.model.check_user_test(roll_no);
	 try {
		  if(value == true & date == true){JOptionPane.showMessageDialog(null, "You Have given one test Today !! kindly give Test Tomorrow ");}}
	 catch(Exception e) {
		  if(value == true & date == false){ 
			   roll = roll_no;
			   test.hide();
		 	   this.comp_test.main(null);}
		  else {JOptionPane.showMessageDialog(null, "You are not Register !! ");}} 
	}
	
	/*
	 * Chemistry Test
	 */
	public void chem_test(String roll_no)
	{
	  this.model.connect();
	  boolean value = this.model.check_roll(roll_no);
	  boolean date  = this.model.check_user_test(roll_no);
	  try {
		  if(value == true & date == true){JOptionPane.showMessageDialog(null, "You Have given one test Today !! kindly give Test Tomorrow ");}
	  }
	  catch(Exception e) {
		  if(value == true & date == false){ 
			  roll = roll_no;
			  test.hide();
			  this.chem_test.main(null);}
		  else {JOptionPane.showMessageDialog(null, "You are not Register !! ");}
	  } 
	  
	}
	/*
	 * Store Test Numbers
	 */
	public void test_record(String Roll_no  ,String test_name , String Score,String date) {  
		this.model.connect();
	    Roll_no = roll;
		this.model.Store_record(Roll_no, test_name, Score, date);}
	
	
	
   


}
