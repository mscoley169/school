package edu.nashcc.employee;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee jsmith = new Employee ("John Smith", "0264581");
		jsmith.setPosition("Techician I");
		jsmith.setStartDate("2/15/2014");
		jsmith.setSalary(42000);
		jsmith.raiseSalary(7.5);
		
		System.out.println("Employee:\t\t" + jsmith.getName());
		System.out.println("Employee Id:\t\t" + jsmith.getID());
		System.out.println("Position:\t\t" + jsmith.getPosition());
		System.out.println("Start Date:\t\t" + jsmith.getStartDate());
		System.out.println("Employee Salary:\t" + jsmith.getFormattedSalary());		
	}
	//I had to change a few things around, most notably the improperly called methods.
	//also changed employee ID to string instead of int because the leading zero assumed it was an octal NOT an int
	
}
