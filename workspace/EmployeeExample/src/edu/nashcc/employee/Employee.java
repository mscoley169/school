/*Name: Matthew S. Coley
 * Filename: Employee.java / EmployeeExample.java
 * Date: 18 Feb 20015
 * Purpose: create an employee class
 */

package edu.nashcc.employee;

import java.text.DecimalFormat;

public class Employee {

	// variables
	public String name;
	public String employeeID;
	public String startDate;
	public double salary;
	public String position;

	// constructor
	public Employee(String name, String employeeID) {
		this.name = name;
		this.employeeID = employeeID;
		this.startDate = "";
		this.salary = 0.0D;
		this.position = "";

	}

	// getName
	public String getName() {
		return this.name;
	}

	// getID
	public String getID() {
		return this.employeeID;
	}

	// getStartDate
	public String getStartDate() {
		return this.startDate;
	}

	// getSalary
	public double getSalary() {
		return this.salary;
	}
	
	//formatting salary to $#,###.00 to display as a proper dollar amount
	public String getFormattedSalary() {
		return decForm(this.salary);
	}

	// getPosition
	public String getPosition() {
		return this.position;
	}

	// setStartDate
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	// setSalary
	public void setSalary(float salary) {
		this.salary = salary;
	}

	// setPosition
	public void setPosition(String position) {
		this.position = position;
	}

	// raiseSalary, accepts a float % then calculates and adds to base salary
	public double raiseSalary(double raise) {
		double newSalary = ((salary * raise)/100 + (salary));
		this.salary = newSalary;
		return this.salary;
	}

	//creating a decimal format method
	public String decForm(double decimal)
	{
		DecimalFormat formatter = new DecimalFormat("$#,###.00");
		return formatter.format(decimal);
	}

}
