package edu.nashcc.pay;

import javax.swing.JOptionPane;

public class Pay {

	String skillLevel, hoursWorked;
	String medical, dental, disability;
	double medCost, dentCost, disCost;

	public static void main(String[] args) {

	}

	public String getSkillLevel() {
		skillLevel = JOptionPane.showInputDialog(null,
				"Enter the worker skill level: ");
		return skillLevel;
	}

	public String getHoursWorked() {
		hoursWorked = JOptionPane.showInputDialog(null,
				"Enter the total hours worked: ");
		return hoursWorked;
	}

	public String getMedical() {
		medical = JOptionPane
				.showInputDialog(null,
						"Do you want to deduct medical insurance from your paycheck for $32.50? (Y/N)");
		return medical.toUpperCase();
	} 
	public String getDental(){
		dental = JOptionPane
				.showInputDialog(null,
						"Do you want to deduct dental insurance from your paycheck for $20.00? (Y/N)");
		return dental.toUpperCase();
	}
	public String getDisability(){
		disability = JOptionPane
				.showInputDialog(
						null,
						"Do you want to deduct long-term disability insurance "
						+ "from your paycheck for $10.00? (Y/N)");
		return disability.toUpperCase();
	}
	public void calcInsuranceDeductions(String medical, String dental, String disability){
		
	}
	
}
