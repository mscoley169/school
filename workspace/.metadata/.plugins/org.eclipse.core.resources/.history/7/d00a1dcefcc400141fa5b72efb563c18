package edu.nashcc.metric;

import java.util.Scanner;


public class MetricConversion {

	float centimeters;
	float liters;
	float inches;
	float gallons;

	public static void main(String[] args) {

		//variables
		float inches;
		float gallons;
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("How many inches would you like to convert (to CM): ");
		inches = input.nextFloat();
		System.out.println("How many gallons would you like to convert (to liters): ");
		gallons = input.nextFloat();
		input.close();
		
		//call methods and display results
	
		MetricMath conversion = new MetricMath(inches, gallons);
		System.out.println("Inches to CM: " + conversion.calcInToCM(inches));
		System.out.println("Gallons to Liters: " + conversion.calcGalToLiter(gallons));
		
		
	}


	
}
