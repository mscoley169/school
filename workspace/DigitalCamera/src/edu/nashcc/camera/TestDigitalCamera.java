/* Name: Matthew S. Coley
 * Assignment: Ch 5 programs
 * Date 23 March 2015
 * 
 */

package edu.nashcc.camera;

import javax.swing.JOptionPane;

public class TestDigitalCamera {

	public static void main(String[] args) {
		

		String brand = JOptionPane.showInputDialog("Enter the brand: ");
		double megapixels = Double.parseDouble(JOptionPane.showInputDialog("Enter the megapixels: "));
		DigitalCamera cam1 = new DigitalCamera(brand, megapixels);
		System.out.println(cam1.displayData());
		
		brand = JOptionPane.showInputDialog("Enter the brand: ");
		megapixels = Double.parseDouble(JOptionPane.showInputDialog("Enter the megapixels: "));
		DigitalCamera cam2 = new DigitalCamera(brand, megapixels);
		System.out.println(cam2.displayData());
		
		brand = JOptionPane.showInputDialog("Enter the brand: ");
		megapixels = Double.parseDouble(JOptionPane.showInputDialog("Enter the megapixels: "));
		DigitalCamera cam3 = new DigitalCamera(brand, megapixels);
		System.out.println(cam3.displayData());
	
		brand = JOptionPane.showInputDialog("Enter the brand: ");
		megapixels = Double.parseDouble(JOptionPane.showInputDialog("Enter the megapixels: "));
		DigitalCamera cam4 = new DigitalCamera(brand, megapixels);
		System.out.println(cam4.displayData());
	}

}
