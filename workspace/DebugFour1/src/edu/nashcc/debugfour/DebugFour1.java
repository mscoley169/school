/* Matthew S Coley
 * ch 4 debug
 * 11 March 2015
 */

package edu.nashcc.debugfour;

// This program assigns values to two variables
// and performs mathematical operations with them
public class DebugFour1
{
   public static void main(String args[])
   {
      int x = 5;
      int y = 8;
      System.out.println("adding " + (x + y));

      int z = 19;
      System.out.println("subtracting "  + (z - y));

      System.out.println("dividing " + ((double)z / (double)x));
      System.out.println("multiplying " + (x * z));
   }
}