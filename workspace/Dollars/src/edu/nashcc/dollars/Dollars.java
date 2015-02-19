package edu.nashcc.dollars;

import javax.swing.JOptionPane;

public class Dollars {

	public static void main(String[] args) {
		int dollars;
		dollars = Integer.parseInt(JOptionPane.showInputDialog(null,
				"How much money do you wish to change out:", "",
				JOptionPane.QUESTION_MESSAGE));

		// declaring change and remainder variables, math for
		// division+remainders
		int change20, remainder20, change10, remainder10, change5, remainder5, change1;
		change20 = dollars / 20;
		remainder20 = dollars % 20;
		change10 = remainder20 / 10;
		remainder10 = remainder20 % 10;
		change5 = remainder10 / 5;
		remainder5 = remainder10 % 5;
		change1 = remainder5 / 1;

		// printing values to console for testing/debugging purposes
		/*
		 * System.out.println("Change 20: " + change20);
		 * System.out.println("Remainder 20: " + remainder20);
		 * System.out.println("Change 10: " + change10);
		 * System.out.println("Remainder 10: " + remainder10);
		 * System.out.println("Change 5: " + change5);
		 * System.out.println("Remainder 5: " + remainder5);
		 * System.out.println("Dollars entered: " +dollars);
		 */

		// dialog to print change
		JOptionPane.showMessageDialog(null,
				"You require the following bills to change out " + dollars
						+ ":" + "\n Twenties:  " + change20
						+ "\n Tens:          " + change10
						+ "\n Fives:          " + change5
						+ "\n Ones:          " + change1, "",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
