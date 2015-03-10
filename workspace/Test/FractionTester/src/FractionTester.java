
public class FractionTester {

	public static void main(String[] args) {
		// Declare object reference variables
        Fraction number1;
        Fraction number2;
     
     // Instantiate the first fraction to 4/3
        number1 = new Fraction(4, 3);
        
     // Instantiate the number2 fraction to 2/4
        number2 = new Fraction(2, 4);
     
     // Display the first fraction
        System.out.print(number1.getNumerator());
        System.out.print("/");
        System.out.println(number1.getDenominator());
      
     // Take the reciprocal of the first fraction
        number1.reciprocal();
     
     // Display the reciprocal
        System.out.print(number1.getNumerator());
        System.out.print("/");
        System.out.println(number1.getDenominator());
        
     // Set the number2 fraction to 5/6
        number2.setNumerator(5);
        number2.setDenominator(6);

	}

}
