package edu.nashcc.catering;

import javax.swing.JOptionPane;

public class CarlysEventPrice {

	public static void main(String[] args) {
		Event event1 = new Event();
		//event1.getInputGuests();
		event1.isLargeEvent();
		JOptionPane.showMessageDialog(null, event1.displayData());


	}
}
