package edu.nashcc.catering;

import javax.swing.JOptionPane;

public class EventDemo {

	public static void main(String[] args) {
		
		
		
		Event event2 = new Event(); 
		event2.inputEventID();
		event2.inputGuests();
		event2.isLargeEvent();
		JOptionPane.showMessageDialog(null, event2.displayData());


	}
}
