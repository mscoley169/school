/*Name: Matthew S. Coley
 *Assignment: Ch 6
 *Date: 29 April 2015
 */

package edu.nashcc.retire;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class RetirementGoal {

	public static void main(String[] args) {

		// get input for years left and money saved per year	
		int yearsLeft = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter the number of years you have until retirement: "));
		double moneySaved = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter the amount of money you can save each year: "));
		
		// while loop to reprompt yearsLeft if a 
		// value below 1 (0 or negative) is entered
		while(yearsLeft < 1){
			yearsLeft = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Please enter a number greater than 0 for retirement: "));
		}
		// while loop to reprompt moneySaved if a 
		// value below 1 (0 or negative) is entered
		while(moneySaved < 0){
			moneySaved = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Please enter a number greater than $0.00: "));
		}
		
		// calculate total amount saved
		double totalSaved = yearsLeft * moneySaved;
		
		// StringBuilder and displaying results
		StringBuilder sb = new StringBuilder();
		sb.append("You will have saved ");
		sb.append(decForm(totalSaved));
		sb.append(" after ");
		sb.append(yearsLeft);
		sb.append(" years.");
		
		JOptionPane.showMessageDialog(null, sb.toString());
		
		
		/* Chapter 6, #10b addition
		 * Modify application to display amount if the user 
		 * earns 5% interest every year
		*/
		
		final double INTEREST = 1.05;
		
		// calculating yearly interest
		// assign newTotal to moneySaved (per year)
		// and making yearsLeft a counter
		double newTotal = 0;
		int counter = yearsLeft;
		newTotal = moneySaved;
		
		// do while loop to repeatedly calculate yearly interest
		do{
			newTotal = newTotal * INTEREST;
			counter--;
		}while(counter > 0);
		
		// StringBuilder and displaying results
		StringBuilder sb2 = new StringBuilder();
		sb2.append("With 5% interest earned yearly, you will have saved ");
		sb2.append(decForm(newTotal));
		sb2.append(" after ");
		sb2.append(yearsLeft);
		sb2.append(" years.");
		
		JOptionPane.showMessageDialog(null, sb2.toString());
		
	}
	
	// decimal formatter
	public static String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		return formatter.format(decimal);
	}

}
