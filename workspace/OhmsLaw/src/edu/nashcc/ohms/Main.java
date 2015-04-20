package edu.nashcc.ohms;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// testy mctesterson
		OhmsLaw test = new OhmsLaw();
		test.displayUserOptions();
		
		System.out.println(test.getUserInput());
		
		int input = Integer.parseInt(test.getUserInput());
		System.out.println(test.calc(input));
		
		do {
			test.displayUserOptions(); //which sets userInput
			JOptionPane.showMessageDialog(null, test.calc(input)); //method not created yet
			} while (input != 0);
		
	}

}
