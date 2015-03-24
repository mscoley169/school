/*Name: Matthew S. Coley
 * Assignments: chapter 5 debug
 * Date: 22 March 2015
 */

package edu.nashcc.debugfive;

// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import javax.swing.*;
public class DebugFive1
{
   public static void main(String args[]) throws Exception
   {
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      String usersChoiceString1, usersChoiceString2;
      int usersChoice1 = 0, usersChoice2 = 0;
      double bill = 0.0;
      usersChoiceString1 = JOptionPane.showInputDialog(null,
         "Order please\n1 - Burger\n2 - Hotdog" +
         "\n3 - Grilled cheese\n4 - Fish sandwich");
      usersChoice1 = Integer.parseInt(usersChoiceString1);
      usersChoiceString2 = JOptionPane.showInputDialog(null,
              "Fries with that?\n1 - Yes\n2 - No");
          usersChoice2 = Integer.parseInt(usersChoiceString2);
      if(usersChoice1 == 1 || usersChoice1 == 2)
		bill = bill + HIGH_PRICE;
	else
		bill = bill + MED_PRICE;
      if (usersChoice2 == 1){
          bill = bill + LOW_PRICE;
      JOptionPane.showMessageDialog(null,"Bill is " + bill); }
      else {
      JOptionPane.showMessageDialog(null, "Bill is " + bill); }
   }
}
