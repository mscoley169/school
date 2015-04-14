package edu.nashcc.ohms;

import javax.swing.JOptionPane;

public class OhmsLaw {

/* TODO: 
 * 		- set maths up E = IR, I = E/R, R = E/I
 * 		- loop (do while?)
 * 		- move main() to separate class
 * 		- decision loop for repetitive use
 * 
 */
	
	private double voltage, amperage, resistance;
	private String userInput;
	
	public OhmsLaw(){
		
	}

	public void setUserInput(){
		StringBuilder sb = new StringBuilder();
		sb.append("Choose the value you wish to calculate: \n");
		sb.append("1 - Voltage\n");
		sb.append("2 - Current\n");
		sb.append("3 - Resistance\n");
		this.userInput = JOptionPane.showInputDialog(null, sb.toString());
	}
	
	public String getUserInput(){
		return this.userInput;
	}

	
	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public double getAmperage() {
		return amperage;
	}

	public void setAmperage(double amperage) {
		this.amperage = amperage;
	}

	public double getResistance() {
		return resistance;
	}

	public void setResistance(double resistance) {
		this.resistance = resistance;
	}

	public static void main(String[] args) {
		
		// testy mctesterson
		OhmsLaw test = new OhmsLaw();
		test.setUserInput();
		System.out.println(test.getUserInput());
	}
}
