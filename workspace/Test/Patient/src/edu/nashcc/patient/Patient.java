/*Name: Matthew S. Coley
 * Assignments: chapter 4 programs
 * Date: 10 March 2015
 */

package edu.nashcc.patient;

public class Patient {

	// global variables
	String pID, bloodType;
	int age;

	// constructors
	public Patient() {
		this.pID = "0";
		this.bloodType = "O+";
		this.age = 0;
	}

	public Patient(String pID, String bloodType, int age) {
		this.pID = pID;
		this.bloodType = bloodType;
		this.age = age;
	}

	// getters
	public String getPID() {
		return this.pID;
	}

	public String getBloodType() {
		return this.bloodType;
	}

	public int getAge() {
		return this.age;
	}

	// string format
	public void getFormattedData(Patient patient) {
		System.out.println(String.format(
				"Patient ID:\t%s \nBlood Type:\t%s \nPatient Age:\t%d", this.pID,
				this.bloodType, this.age));
	}
}
