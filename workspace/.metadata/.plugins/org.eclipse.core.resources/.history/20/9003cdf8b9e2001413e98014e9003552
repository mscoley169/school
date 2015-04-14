/* Name: Matthew S. Coley
 * Assignment: Ch 5 programs
 * Date 23 March 2015
 * 
 */

package edu.nashcc.camera;

import java.text.DecimalFormat;

public class DigitalCamera {

	String brand;
	double megapixels, price;
	
	public DigitalCamera(){
		this("", 0);
	}
	public DigitalCamera(String brand, double megapixels){
		this.brand = brand;
		if(megapixels > 10){
			this.megapixels = 10;
		}
		else {
			this.megapixels = megapixels;
		}
		setPrice(megapixels);

	}
	
	
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getMegapixels() {
		return this.megapixels;
	}
	public void setMegapixels(double megapixels) {
		this.megapixels = megapixels;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double megapixels) {
		if(megapixels > 6){
			this.price = 129;
		}
		else {
			this.price = 99;
		}
		
	}
	

	public String displayData(){
		StringBuilder sb = new StringBuilder();
		sb.append("Brand:     \t" + getBrand() + "\n");
		sb.append("Resolution:\t" + getMegapixels() + "\n");
		sb.append("Price:     \t" + decForm(getPrice()) + "\n");
		return sb.toString();
	}
	
	public String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#.00");
		return formatter.format(decimal);
	}
	
}
