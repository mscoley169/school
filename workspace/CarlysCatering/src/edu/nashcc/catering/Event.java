package edu.nashcc.catering;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Event {


	final double PPG_LOW = 32;
	final double PPG_HIGH = 35;
	double pricePerGuest;
	int guests;
	double totalCost;
	String eventID;
	boolean isLargeEvent;
	
	public Event(){
		this.guests = 0;
		this.eventID = "A000";
	}
	public Event(String eventID, int guests){
		setEventID(eventID);
		setGuests(guests);
	}

	public String inputEventID(){
		this.eventID = JOptionPane.showInputDialog(null, "Enter the event ID: ");
		return this.eventID;
	}
	public void setEventID(String eventID){
		this.eventID = eventID;
	}
	
	public final double getPricePerGuest() {
		if(this.isLargeEvent()) {
			return this.pricePerGuest = PPG_LOW;
		} else {
			return this.pricePerGuest = PPG_HIGH;
		}
	}

	public int getGuests() {
		return this.guests;
	}
	public void setGuests(int guests) {
		this.guests = guests;
		setTotalCost(guests);
	}
	public double getTotalCost() {
		return this.totalCost;
	}
	public void setTotalCost(int guests) {
		if(this.isLargeEvent()) {
			this.totalCost = PPG_LOW * guests;
		} else {
			this.totalCost = PPG_HIGH * guests;
		}
	}
	
	public boolean isLargeEvent(){
	return guests >= 50;
	}
	
	public int inputGuests(){
		int guests = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter the number of guests: "));
		setGuests(guests);
		return guests;
	}
	
	public String displayData(){
		StringBuilder sb = new StringBuilder();
		sb.append("\nEvent ID:                 " + eventID);
		sb.append("\nTotal guests:         " + this.guests);
		sb.append("\nPrice per guest:   " + decForm(getPricePerGuest()));
		sb.append("\nTotal Cost:             " + decForm(getTotalCost()));
		sb.append("\nLarge Event:          " + isLargeEvent());
		return sb.toString();
		}
	public String displayGuestsAndID(){
		StringBuilder sb = new StringBuilder();
		sb.append("Event ID:                 " + eventID);
		sb.append("\n");
		sb.append("Total guests:         " + this.guests);
		return sb.toString();
	}
	
	public static String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		return formatter.format(decimal);
	}
}
