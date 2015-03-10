/*Name: Matthew S. Coley
 * Filename: DebugTwo2.java
 * Date: 10 February 2015
 * Purpose: ch3 debug #2
 */

package edu.nashcc.c3dbg;

// This application displays some math facts
public class DebugThree2
{
   public static void main(String args[])
   {
     int a = 2, b = 5, c = 10;
     add(a, b);
     add(b, c);
     subtract(c, a);            
   }
   public static void add(int a, int b)
   {
      System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
   }
   public static void subtract(int a, int c)
   {
      System.out.println("The difference between " + a + " and " + c + " is " + (a - c));
   }
}
