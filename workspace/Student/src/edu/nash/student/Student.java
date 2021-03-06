/*Name: Matthew S. Coley
 * Assignment: ch7 programs
 * 6 May 2015 
 */
package edu.nash.student;

import javax.swing.JOptionPane;

public class Student {

	public static void main(String[] args) {

		// prompting user for name, student ID, and major
		String name = promptUser("name");
		String sID = promptUser("student ID");
		String major = promptUser("major");
		int sIDLength = sID.length();
		while(sIDLength != 7){
			errorMsg();
			sID = promptUser("student ID");
			sIDLength = sID.length();
		}
		StringBuilder sb = new StringBuilder();
		sb.append("STUDENT:   ");
		sb.append(name);
		sb.append("\nID #:             ");
		sb.append(sID);
		sb.append("\nMajor:          ");
		sb.append(major);
		
		JOptionPane.showMessageDialog(null, sb);
		
	} // end of main()
	
	public static void errorMsg() {
		JOptionPane.showMessageDialog(null,
				"Student ID numbers must be seven (7) digits.");
	}

	public static String promptUser(String prompt) {
		String input = JOptionPane.showInputDialog(null, "Please enter the "
				+ prompt + ": ");
		return input;
	}
}
