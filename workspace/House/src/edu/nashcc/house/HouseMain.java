/*  Name: Matthew S. Coley
 *  Assignment: chapter 5/6 test program
 * Date: 30 April 2015
*/

package edu.nashcc.house;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class HouseMain {

	public static void main(String[] args) {

		// massive for loop to run three times
		for(int counter = 3; counter > 0; counter--){
		
		String userHouse = inputUserHouse();
		// while loop to determine valid input
		int userOption = Integer.parseInt(userHouse);
		while(userOption > 3 || userOption < 1){
			JOptionPane.showMessageDialog(null, "Invalid Choice. Please try again.");
			userHouse = inputUserHouse();
			userOption = Integer.parseInt(userHouse);
		}
		
		// switch to set house type
		String houseType = "";
		switch(userHouse){
		case "1":
			houseType = "Single Family";
			break;
		case "2":
			houseType = "Townhouse";
			break;
		case "3":
			houseType = "Condominium";
			}
		
		// setting userPrice
		double userPrice = inputPrice();
		// while to determine valid input
		while(userPrice < 0){
			JOptionPane.showMessageDialog(null, "Invalid Choice. Please enter a positive dollar amount. ");
			userPrice = inputPrice();
		}
		// switch to set minCost
		double minCost = 0;
		switch(Integer.parseInt(userHouse)){
		case 1:
			minCost = 150000;
			break;
		case 2:
			minCost = 110000;
			break;
		case 3:
			minCost = 95000;
		}
		
		JOptionPane.showMessageDialog(null, formatResults(houseType, userPrice) + "\n\n" 
				+ costCheck(userPrice, minCost));
		
		// testing 
		// System.out.println(test.getUserHouse());
		// System.out.println(decForm(test.getPrice()));
		// System.out.println(userHouse);
		// System.out.println(minCost);
		
		} //end for loop
	} //end of main()

	public static String inputUserHouse(){
		StringBuilder sb = new StringBuilder();
		sb.append("What Type of House Would you Like to Purchase?\n");
		sb.append("1 - Single Family\n");
		sb.append("2- Townhouse\n");
		sb.append("3 - Condominium\n");
		String houseType = JOptionPane.showInputDialog(null, sb.toString());
		return houseType;
	}
	public static double inputPrice(){
		double cost = Double.parseDouble(JOptionPane.showInputDialog(null, "How much can you afford? "));
		return cost;
	}
	public static String formatResults(String houseType, double userPrice){
		StringBuilder sb = new StringBuilder();
		sb.append("Desired House Type:                ");
		sb.append(houseType);
		sb.append("\nMaximum value afforded:       ");
		sb.append(decForm(userPrice));
		return sb.toString();
	}
	public static String costCheck(double userPrice, double minCost){
		String costCheck = "";
		if(userPrice < minCost){
			costCheck = ("The desired house type is *not* available in your price range.");
			}
		else{
			costCheck = "The desired house type is available in your price range";
		}
		return costCheck;
	}
	// decimal formatter
	public static String decForm(double decimal) {
		DecimalFormat formatter = new DecimalFormat("$#,##0.00");
		return formatter.format(decimal);
	}
	
}
