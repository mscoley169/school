/*Name: Matthew S. Coley
 *Assignment: Ch 6
 *Date: 29 April 2015
 */

package edu.nashcc.college;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CollegeCost {

	public static void main(String[] args) {

		// get estimated college costs
		int cost = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter the expected cost of college: "));

		// get childAge input
		int childAge;
		childAge = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter the child's age: "));
		// while loop, if childAge is 18+, reprompt
		while (childAge >= 18) {
			childAge = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Please enter an age under 18: "));
		}

		// calculate the number between age and 18
		int remaining = 18 - childAge;

		double perYear = cost / remaining;

		JOptionPane.showMessageDialog(null, "You need to save "
				+ decForm(perYear) + " per year for " + remaining + " years.");

	}

	public static String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		return formatter.format(decimal);
	}
}
