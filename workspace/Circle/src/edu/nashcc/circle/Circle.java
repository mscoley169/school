package edu.nashcc.circle;

public class Circle {

	double radius, diameter, area;
	
	//constructors
	public Circle(){
		this.radius = 1.0D;
		this.diameter = this.radius * 2;
		this.area = Math.PI * this.radius * this.radius;
	}
	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.diameter = this.radius * 2;
		this.area = Math.PI * this.radius * this.radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getArea() {
		return area;
	}
	
	//formatted data
	public void getFormattedData(Circle circle) {
		System.out.println(String.format("Radius:\t%d \nDiameter:\t%d \nArea:\t%d", this.radius, this.diameter, this.area));
	}
}
