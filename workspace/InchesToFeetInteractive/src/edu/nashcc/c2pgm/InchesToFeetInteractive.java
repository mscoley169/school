package edu.nashcc.c2pgm;

import javax.swing.*;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		
		//declare variables, get input for inches, math for feet + remaining inches
		int inches, totalInFeet, remainder;
		inches = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of inches:", JOptionPane.INFORMATION_MESSAGE));
		totalInFeet = inches / 12;
		remainder = inches % 12;
		
		//show answer, feet + remainder
		JOptionPane.showMessageDialog(null, "Answer: " + totalInFeet + " feet " + remainder + " inches.", "Answer", JOptionPane.INFORMATION_MESSAGE);
	}

}
