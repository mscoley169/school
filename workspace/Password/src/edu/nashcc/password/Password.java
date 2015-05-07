/*Name: Matthew S. Coley
 * Assignment: ch7 programs
 * 6 May 2015 
 */
package edu.nashcc.password;

import javax.swing.JOptionPane;

public class Password {

	public static void main(String[] args) {

		// set password using promptUser() and set length using length()
		String password = promptUser();
		int length = password.length();
		// while loop to test for 6-10 chars
		while(length < 6 || length > 10){
			errorMsg();
			password = promptUser();
			length = password.length();
		}
		
		// for loop to determine if any chars are spaces/tabs
		for(int c = 0; c < length; c++){
			char ch = password.charAt(c);
			if(Character.isWhitespace(ch) == true){
				errorMsg();
				password = promptUser();
				}
			length = password.length();
		} // end for loop
		
		JOptionPane.showMessageDialog(null, "To confirm your password, please re-enter your password.");
		String password2 = promptUser();
		if(password.equals(password2) == false){
			JOptionPane.showMessageDialog(null, "Your passwords do not match.");
		}
		else{
			JOptionPane.showMessageDialog(null, "Your passwords match");
		}
} //end of main()

	public static String promptUser(){
		String input = JOptionPane.showInputDialog(null, "Enter Password: ");
		return input;
	}
	public static void errorMsg(){
		JOptionPane.showMessageDialog(null, "Invalid password. Please enter a password between 6-10 characters with no spaces");
	}
	
}
