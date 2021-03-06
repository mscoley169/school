package edu.nashcc.c2pgm;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		// declare variables, get user input with dialog, math ((F - 32) / (5/9))
		float tempF, tempC;
		tempF = Float.parseFloat(JOptionPane.showInputDialog(null, "Enter the temperature in Fahrenheit: ", "Fahrenheit to Celsius Converter", JOptionPane.QUESTION_MESSAGE));
		tempC = ((tempF - 32.00F) * (5.00F/9.00F));
		
		//using DecimalFormat to truncate floats to hundredth (0.00) place
		DecimalFormat decForm = new DecimalFormat("#.##");
		decForm.setRoundingMode(RoundingMode.DOWN);
		
		// display result to user
		JOptionPane.showMessageDialog(null, decForm.format(tempF) + " Fahrenheit = " + decForm.format(tempC) + " Celsius", "Fahrenheit to Celsius Converter", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
