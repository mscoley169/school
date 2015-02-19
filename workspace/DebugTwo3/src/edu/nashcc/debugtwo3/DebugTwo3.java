/*Name: Matthew S. Coley
 *Filename: DebugTwo3.java
 *Date: 27 January 2015
 *Purpose: ch2 debug #3
 */

package edu.nashcc.debugtwo3;

public class DebugTwo3
// Demonstrates remainder and output
{
   public static void main(String args[])
   {
      int a = 99, b = 8, result;
      long c = 7777777777777L;
      result = a % b;
      System.out.println("Divide " + a + " by " + b);
      System.out.println("remainder is " + result);
      System.out.print("c is a very large number: ");
      System.out.println(c);
    }
}