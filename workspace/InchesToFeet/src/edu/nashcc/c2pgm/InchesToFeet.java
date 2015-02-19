/* Name: Matthew S. Coley
 * Filename: InchesToFeet.java
 * Date: 3 February 2015 
 * Purpose: ch2 programs
*/

package edu.nashcc.c2pgm;


public class InchesToFeet {

	public static void main(String[] args) {
		int inches = 15;
		int totalInFeet = inches / 12;
		int remainder = inches % 12;
		System.out.println(inches + " inches is equal to " + totalInFeet + " feet " + remainder + " inches.");
	}

}
