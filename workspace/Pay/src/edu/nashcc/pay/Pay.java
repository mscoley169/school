package edu.nashcc.pay;

import javax.swing.JOptionPane;

public class Pay {

	String skillLevel, hoursWorked;
	String medical, dental, disability;
	double medCost, dentCost, disCost;

	public static void main(String[] args) {

	}

	public int inputSkillLevel() {
		skillLevel = JOptionPane.showInputDialog(null,
				"Enter the worker skill level: ");
		return Integer.parseInt(skillLevel);
	}

	public double inputHoursWorked() {
		hoursWorked = JOptionPane.showInputDialog(null,
				"Enter the total hours worked: ");
		return Double.parseDouble(hoursWorked);
	}

	public double inputMedical() {
		medical = JOptionPane
				.showInputDialog(null,
						"Do you want to deduct medical insurance from your paycheck for $32.50? (Y/N)");
		
		switch(medical.substring(0)){
		case "Y":
			medCost = 32.5;
			break;
		case "N":
			medCost = 0;
			break;
		}
		return medCost;
	} 
	public double inputDental(){
		dental = JOptionPane
				.showInputDialog(null,
						"Do you want to deduct dental insurance from your paycheck for $20.00? (Y/N)");
		
		switch(dental.substring(0)){
		case "Y":
			dentCost = 20.0;
			break;
		case "N":
			dentCost = 0;
			break;
		}
		return dentCost;
	}
	public double inputDisability(){
		disability = JOptionPane
				.showInputDialog(
						null,
						"Do you want to deduct long-term disability insurance "
						+ "from your paycheck for $10.00? (Y/N)");
		switch(dental.substring(0)){
		case "Y":
			disCost = 10.0;
			break;
		case "N":
			disCost = 0;
			break;
		}
		return disCost;
	}
}
