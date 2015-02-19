package edu.nashcc.dogboarding;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DogBoarding {

	public static void main(String[] args) {
		// declare variables
		String name;
		int weight, daysBoarded;
		float totalCost;
		final float pricePerPound = 0.5F;

		// Scanner for input
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Please enter the dog's name: ");
		name = inputDevice.nextLine();
		System.out.println("Please enter the dog's weight in pounds: ");
		weight = inputDevice.nextInt();
		System.out
				.println("Please enter the number of days the dog will be boarded: ");
		daysBoarded = inputDevice.nextInt();
		inputDevice.close();

		// math + DecimalFormat
		totalCost = (weight * pricePerPound) * daysBoarded;
		DecimalFormat decForm = new DecimalFormat("0.00");

		// displaying total cost in a message
		System.out.println("To board " + name + " for " + daysBoarded
				+ " days, it will cost $" + decForm.format(totalCost));

		/*
		 * debugging output System.out.println("totalCost: " +
		 * decForm.format(totalCost));
		 * 
		 * CTRL + SHIFT + F was used to auto-format
		 */
	}

}
