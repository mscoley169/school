
public class Fraction {
	// Declare the instance variables
    private int numerator;
    private int denominator;
    
    // Constructor method
    public Fraction (int n, int d) 
    {
       this.numerator = n;
       this.denominator = d;
    }
    
    // Get the fraction's numerator
    public int getNumerator()
    {
       return this.numerator;
    }
    
    // set the fraction's denominator
    public int getDenominator()
    {
       return this.denominator;
    }
    
    // set the fraction's numerator
    public void setDenominator(int d)
    {
       this.denominator = d;
    }
 
    // Set the fraction's numerator
    public void setNumerator(int n) 
    {
       this.numerator = n;
    }
    
    // Takes a Fraction's reciprocal
    public void reciprocal( ) 
    {
    // Declare a local variables
       int temp;   // old numerator
    
    // Swap the two values
       temp = getNumerator();
       this.numerator = this.getDenominator();
       this.denominator = temp;
    }
}
