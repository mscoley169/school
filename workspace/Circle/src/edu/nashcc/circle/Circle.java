package edu.nashcc.circle;

public class Circle {

	double radius, diameter, area;

	// constructors
	public Circle() {
		this.radius = 1.0D;
		this.diameter = this.radius * 2;
		this.area = Math.PI * this.radius * this.radius;
	}

	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		setDiameter(radius);
		setArea(radius);
	}

	public void setDiameter(double radius) {
		this.diameter = radius * 2;
	}

	public void setArea(double radius) {
		this.area = Math.PI * radius * radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getArea() {
		return area;
	}

	// formatted data
	public void getFormattedData(Circle circle) {
		System.out.println("Radius:\t\t" + this.radius + "\nDiameter:\t"
				+ this.diameter + "\nArea:\t\t" + this.area + "\n");
	}
}
