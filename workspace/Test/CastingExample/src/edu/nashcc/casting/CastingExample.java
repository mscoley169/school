package edu.nashcc.casting;

public class CastingExample {

	public static void main(String[] args) {
		String s =  "25";
		int i = 37;
		float f = 5.9F;
		double  d = 37.41;
		
		//double answer = i + d; //implicit casting
		//int answer = (int)f + i; //explicit casting
		//int answer = (int)s + i; 
		//int answer = Integer.parseInt(s) + i; //converting types using class methods
		//float answer = f + (float)d; //explicit
		//float answer = f + Float.parseFloat(s);
		int answer = (int)Math.round(f) + i;
		
		System.out.print(answer);
	}

}
