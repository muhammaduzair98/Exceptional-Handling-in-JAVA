package pkg;


import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.mysql.cj.xdevapi.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
/**
 * 
 * @author M.ROHAN FAROOQUI
 * This class contain all sql query && database related function
 */

public class model {
	
    /*
     * Connection Variable
     */
    private Connection cn;
    /*
     * Java Sql Statment
     */
    private java.sql.Statement s;
    /*
     * Resultset Statment
     */
    private ResultSet rs;
    
    /*
     * Function Connect with dataBase
     */
    
    public void connect() { 
    	try {
			cn =DriverManager.getConnection("jdbc:mysql://localhost/student_registration_form?serverTimezone=UTC","root","");}
		catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Connection Error !! \n Reason :"+e.getMessage());}}
    
    /*
     * Add Data To DATABASE
     */
    public void addStudentData(String roll, String name, String gender, String email, String father) 
    {   
		String query = "Insert Into student_record VALUES('"+roll+"','"+name+"','"+father+"','"+gender+"','"+email+"')";
		try {
			s= cn.createStatement();
			s.execute(query);
			JOptionPane.showMessageDialog(null, "You are Registered Sucessfully");}
		catch (SQLException e) {
			e.printStackTrace();}}
    /*
     * Check user while adding it in database
     */
    public boolean check_user_name(String User)
    {
    try {
        cn=DriverManager.getConnection("jdbc:mysql://localhost/student_registration_form?serverTimezone=UTC","root","");
     		s=cn.createStatement();
        	String q="SELECT Student_Name FROM student_record WHERE UPPER(Student_Name) LIKE ?";
        	PreparedStatement ps = cn.prepareStatement(q);
    		ps.setString(1, "%" + User  + "%");
    		ResultSet rs = ps.executeQuery();
    		if(rs.next()){ 
    		  do{
    	        String result = (rs.getString(1));
    	        return true;}
    		  while(rs.next());}
    	    else{return false;}
    	}
     	catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        return false;}
    /*
     * check Name roll no while adding
     */
    public boolean check_user(String roll_no)
    {
    try {
        	cn=DriverManager.getConnection("jdbc:mysql://localhost/student_registration_form?serverTimezone=UTC","root","");
     		s=cn.createStatement();
        	String q="SELECT Roll_NO FROM student_record WHERE  UPPER(Roll_No) LIKE ? ";
        	PreparedStatement ps = cn.prepareStatement(q);
    		ps.setString(1, "%" + roll_no  + "%");
    		
    		ResultSet rs = ps.executeQuery();
    		if(rs.next()){ 
    		  do{
    	        String result = (rs.getString(1));
    	        return true;}
    		  while(rs.next());}
    	    else{return false;}
    	}
     	catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        return false;}
    
    /*
     * Check Roll No in DataBase
     */
    public boolean  check_roll(String roll_no) {
     try {
    	cn=DriverManager.getConnection("jdbc:mysql://localhost/student_registration_form?serverTimezone=UTC","root","");
 		s=cn.createStatement();
    	String q="SELECT Roll_NO FROM student_registration_form.student_record WHERE UPPER(Roll_NO) LIKE ?";
    	PreparedStatement ps = cn.prepareStatement(q);
		ps.setString(1, "%" + roll_no  + "%");
		ResultSet rs = ps.executeQuery();
		if(rs.next()){ 
		  do{
	        String result = (rs.getString(1));return true;}
		  while(rs.next());}
	    else{return false;}
	}
 	catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    return false;}
    
    /*
     * Record Score in DataBase
     */
    public void Store_record(String Roll_no  ,String test_name , String Score,String date)
    {
     String query = "Insert Into student_score_record VALUES('"+Roll_no+"','"+test_name+"','"+Score+"','"+date+"')";
     try {
    	 s= cn.createStatement();
    	 s.execute(query);}
    catch (SQLException e) {JOptionPane.showMessageDialog(null,"Error!! \n Reason : "+ e);}}
    
    /*
     * Check Wether User has Given any test in today's date
     */
    public boolean check_user_test(String roll_no) {
    LocalDate x= java.time.LocalDate.now();
    try {
    	cn=DriverManager.getConnection("jdbc:mysql://localhost/student_registration_form?serverTimezone=UTC","root","");
 		s=cn.createStatement();
    	String q="SELECT Roll_No,Date FROM student_score_record WHERE UPPER(Roll_No) LIKE ? and  UPPER(Date) LIKE ?";
    	PreparedStatement ps = cn.prepareStatement(q);
		ps.setString(2, "%" + x.toString()  + "%");
		ps.setString(1, "%" + roll_no  + "%");
		ResultSet rs = ps.executeQuery();
		if(rs.next()){ 
		  do{
	        String result = (rs.getString(1)+","+rs.getString(2));return true;}
		  while(rs.next());}
	    else{return false;}
	}
 	catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    return false;}
    
    
    
    }    
	