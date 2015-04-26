package edu.nashcc.between;

import javax.swing.JOptionPane;

public class InBetween {

	private int a, b, c;
	
	public static void main(String[] args) {
		
		// instantiating InBetween object and 
		// using the set methods that calls 
		// an input dialog
		InBetween x = new InBetween();
		x.setA();
		x.setB();
		
		// creating StringBuilder object to add results to a list for display
		StringBuilder sb = new StringBuilder();
				
		// determining which is higher and setting to intHi or intLo
		int intHi, intLo, diff;
		if (x.getA() > x.getB()){
			intHi = x.getA();
			intLo = x.getB();
		}
		else if(x.getB() > x.getA()){
			intHi = x.getB();
			intLo = x.getA();
		}
		else{
			intHi = 1;
			intLo = 0;
		}
		
		// determining difference for message
		diff = intHi - intLo;
		
		if(diff <= 1){
			sb.append("There are no integers between A and B");
			}
		else while(intLo < intHi){
			sb.append(intLo);
			sb.append("\n");
			intLo++;
			}
		
		JOptionPane.showMessageDialog(null, sb.toString());
		
	
		
		
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
}
