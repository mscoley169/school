/*Name: Matthew S. Coley
 * Filename: DebugTwo2.java
 * Date: 10 February 2015
 * Purpose: ch3 debug #3
 */
package edu.nashcc.c3dbg;

// This application gets a user's name and displays a greeting

import java.util.Scanner;

public class DebugThree3 {
	public static void main(String args[]) {
		String name = "";
		getName();
		displayGreeting(name);
	}

	public static String getName() {
	
			String name;
			Scanner input = new Scanner(System.in);
			try {
			System.out.print("Enter name ");
			name = input.nextLine();
			input.close();
			return name; }
			finally {
			input.close();
			}
					

	}

	public static void displayGreeting(String n) {
		System.out.println("Hello, " + n + "!");
	}
}
