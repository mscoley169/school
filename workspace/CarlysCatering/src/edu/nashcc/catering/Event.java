package edu.nashcc.catering;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Event {


	double pricePerGuest = 35;
	int guests;
	double totalCost;
	String eventID;
	boolean isLargeEvent;
	
	public Event(){
		this.guests = getInputGuests();
		this.eventID = getEventID();
	}
	public Event(int guests){
		this.guests = guests;
	}
	public Event(int guests, String eventID){
		this.guests = guests;
		this.eventID = eventID;
	}
	
	public String getEventID(){
		this.eventID = JOptionPane.showInputDialog(null, "Enter the event ID: ");
		return this.eventID;
	}
	
	public double getPricePerGuest() {
		return pricePerGuest;
	}
	public void setPricePerGuest(double pricePerGuest) {
		this.pricePerGuest = pricePerGuest;
	}
	public int getGuests() {
		return guests;
	}
	public void setGuests(int guests) {
		this.guests = getInputGuests();
	}
	public double getTotalCost() {
		totalCost = this.guests * this.pricePerGuest;
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public void setLargeEvent(boolean isLargeEvent) {
		this.isLargeEvent = isLargeEvent;
	}
	
	public boolean isLargeEvent(){
		if (guests >= 50) {
			isLargeEvent = true;
			return isLargeEvent;
		} else {
			isLargeEvent = false;
			return isLargeEvent;
		}
	}
	
	public static int getInputGuests(){
		int guests = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter the number of guests: "));
		return guests;
	}
	
	public String displayData(){
		StringBuilder sb = new StringBuilder();
		sb.append("Carly's makes the food that makes it a party!\n");
		sb.append("Event ID: \t" + eventID);
		sb.append("\nTotal guests: \t" + guests);
		sb.append("\nPrice per guest: \t" + decForm(pricePerGuest));
		sb.append("\nTotal Cost: \t" + decForm(getTotalCost()));
		sb.append("\nLarge Event: \t" + isLargeEvent);
		return sb.toString();
		}
	
	public static String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		return formatter.format(decimal);
	}
}
