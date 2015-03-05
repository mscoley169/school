package edu.nashcc.paint;

import java.util.Scanner;

public class Painting {
	String title, artist, medium;
	double price, commission;

	public Painting(String title, String artist, String medium){
		this.title = title;
		this.artist = artist;
		this.medium = medium;
	
	}
	
	public Painting(String title, String artist, String medium, double price){
		this.title = title;
		this.artist = artist;
		this.medium = medium;
		this.price = price;
	
	}
	public void setTitle(String title){
		this.title = title;
		}
	public void setArtist(String artist){
		this.artist = artist;
	}
	public void setMedium(String medium){
		this.medium = medium;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public String getTitle(){
		return this.title;
	}
	public String getArtist(){
		return this.artist;
	}
	public String getMedium(){
		return this.medium;
	}
	public double getPrice(){
		return this.price;
	}
	public double getCommission(){
		commission = this.price * 0.20;
		return this.commission;
	}
	
	//Scanner input for setting values
	public void setUserInput(Painting paint){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the title: ");
		this.title = input.nextLine();
		System.out.println("Enter the artist: ");
		this.artist = input.nextLine();
		System.out.println("Enter the medium: ");
		this.medium = input.nextLine();
		System.out.println("Enter the price: ");
		this.price = Double.parseDouble(input.nextLine());
		input.close();
		}
	
}
