import javax.swing.JOptionPane;


public class MathOperatorsExample {

	public static void main(String[] args) {
		final double PRICE_ONE_SHIRT     = 0.95D;
		final double PRICE_PAIR_OF_PANTS = 2.95D;
		final double PRICE_ONE_DRESS     = 4.55D;
		final double SALES_TAX_RATE      = 5.75D; // 5.75%

		String customerName = "James Burreck";
		String homePhone = "(252) 443-7030";
		int numberOfShirts   = 5;
	    int numberOfPants    = 2;
		int numberOfDresses  = 3;
		int totalNumberOfItems;
		double subTotalShirts;
		double subTotalPants; 
		double subTotalDresses;
		double taxAmount;
		double totalOrder; 
		double netPrice;
		int orderMonth = 3; 
		int orderDay = 15; 
		int OrderYear = 2002;
		
		//*
		customerName = JOptionPane.showInputDialog(null, "Please enter the customer name", "Name Input", JOptionPane.INFORMATION_MESSAGE);
		homePhone = JOptionPane.showInputDialog(null, "Please enter the customer home phone number", "Phone Number Input", JOptionPane.INFORMATION_MESSAGE);
		numberOfShirts = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the total number of shirts", "Shirts Input", JOptionPane.INFORMATION_MESSAGE));
		numberOfPants = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the total number of pants", "Pants Input", JOptionPane.INFORMATION_MESSAGE));
		numberOfDresses = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the total number of dresses", "Dresses Input", JOptionPane.INFORMATION_MESSAGE));
		//*/

		totalNumberOfItems = numberOfShirts + numberOfPants + numberOfDresses;
		subTotalShirts     = PRICE_ONE_SHIRT * numberOfShirts;
		subTotalPants      = PRICE_PAIR_OF_PANTS * numberOfPants;
		subTotalDresses    = numberOfDresses * PRICE_ONE_DRESS;
		totalOrder         = subTotalShirts + subTotalPants + subTotalDresses;
		taxAmount          = totalOrder * SALES_TAX_RATE / 100;
		netPrice           = totalOrder - taxAmount;
		
		
		System.out.println("-/- Rocky Mount Cleaning Services -/-");
		System.out.println("====================================");
		System.out.println("Customer:   " + customerName);
		System.out.println("Home Phone: " + homePhone);
		System.out.print("Order Date: ");
		System.out.print(orderMonth);
		System.out.print('/');
		System.out.print(orderDay);
		System.out.print('/');
		System.out.println(OrderYear);
		System.out.println("------------------------------------");
		System.out.println("Item Type  Qty Unit/Price Sub-Total");
		System.out.println("------------------------------------");
		System.out.print("Shirts      " + numberOfShirts + "     ");
		System.out.println(PRICE_ONE_SHIRT + "     " + subTotalShirts);
		System.out.print("Pants       " + numberOfPants + "     ");
		System.out.println(PRICE_PAIR_OF_PANTS + "     " + subTotalPants);
		System.out.print("Dresses     " + numberOfDresses + "     ");
		System.out.println(PRICE_ONE_DRESS + "     " + subTotalDresses);
		System.out.println("------------------------------------");
		System.out.println("Number of Items: " + totalNumberOfItems);
		System.out.println("Total Order:     " + totalOrder);
		System.out.print("Tax Rate:        " + SALES_TAX_RATE);
		System.out.println('%');
		System.out.println("Tax Amount:      " + taxAmount);
		System.out.println("Net Price:       " + netPrice);
		System.out.println("====================================");

	}

}
