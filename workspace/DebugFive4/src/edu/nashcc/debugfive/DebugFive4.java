/*Name: Matthew S. Coley
 * Assignments: chapter 5 debug
 * Date: 22 March 2015
 */

package edu.nashcc.debugfive;
// DebugFive4.java
// Outputs highest of four numbers
import javax.swing.*;
public class DebugFive4
{
   public static void main (String args[]) 
   {
      int one = 0, two = 0, three = 0, four = 0;
      String str1, str2, str3, str4, output;
      str1 = JOptionPane.showInputDialog(null,"Enter an integer");
      one = Integer.parseInt(str1);
      str2 = JOptionPane.showInputDialog(null,"Enter an integer");
      two = Integer.parseInt(str2);
      str3 = JOptionPane.showInputDialog(null,"Enter an integer");
      two = Integer.parseInt(str3);
      str4 = JOptionPane.showInputDialog(null,"Enter an integer");
      four = Integer.parseInt(str4);
      if(one > two & one >= three && one < four) //need to sort out logic
         output = "Highest is " + one;
      else
         if(two > one || two > three && two > four)
            output = "Highest is " + two;
         else
           if(three > one && three > two || three == four)
              output = "Highest is " + three;
           else
              output = "Highest is " + four;
      JOptionPane.showMessageDialog(null, output);
   }
}


