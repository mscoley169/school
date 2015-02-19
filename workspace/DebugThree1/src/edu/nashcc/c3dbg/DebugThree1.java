/*Name: Matthew S. Coley
 * Filename: DebugTwo2.java
 * Date: 10 February 2015
 * Purpose: ch3 debug #1
 */

package edu.nashcc.c3dbg;

import java.math.RoundingMode;
import java.text.DecimalFormat;

// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String args[])
   {
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("The bill amounts are $" + myCheck + " and $" + yourCheck);
      calcTip(myCheck);
      calcTip(yourCheck);
    }
   	   
    public static void calcTip(double bill)
    {
      final double RATE = 0.15;
      double tip = bill * RATE;
      
      //decimalformat
      DecimalFormat decForm = new DecimalFormat("##.##");
      decForm.setRoundingMode(RoundingMode.DOWN);
      
      System.out.println("The tip should be at least $" + decForm.format(tip));
    }
}
