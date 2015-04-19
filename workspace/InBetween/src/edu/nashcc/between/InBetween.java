package edu.nashcc.between;

import javax.swing.JOptionPane;

public class InBetween {

	private int a, b, c;
	
	public static void main(String[] args) {
		InBetween x = new InBetween();
		x.setA();
		x.setB();
		
		
	}

	private static String setUserInput(){
		return JOptionPane.showInputDialog(null, "Enter a number:");
	}
	private void setA(){
		this.a = Integer.parseInt(setUserInput());
	}
	private void setB(){
		this.b = Integer.parseInt(setUserInput());
	}
	private int getA(){
		return this.a;
	}
	private int getB(){
		return this.b;
	}
	private void whileCalc(){
		int x = Math.abs(this.a - this.b);
		for(x > 0; ){
			
		}
	}
}
