/******************************************************************************
Name: Dora Ding
Name of Lab: Dispenser
Due Date: 4/17/2022
Date Submitted: 4/10/2022
What I learned:
  a. I learned how to program to know how much change is needed.
  b. I learned how to use the math operators.
  c. I learned how to use \n.
*******************************************************************************/

import java.util.Scanner;

public class Dispenser {
   public static void main (String [] args) {
      
      Scanner console = new Scanner (System.in);
      System.out.println("Enter price of item (from 25 cents to a dollar, in 5-cent increment): ");
      int price = console.nextInt();
      
      System.out.println("You bought an item for " + price + " cents and gave me a dollar, \nso your change is: ");
      
      int change = 100 - price;
      
      int quarter = change / 25;
      System.out.println(quarter + " quarter(s),");
      
      int dime = (change - quarter * 25) / 10;
      System.out.println(dime + " dime(s), and");
      
      int nickel = (change - quarter * 25 - dime * 10) / 5;
      System.out.println(nickel + " nickel(s).");
      
   }
}

/*
----jGRASP exec: java Dispenser
Enter price of item (from 25 cents to a dollar, in 5-cent increment): 
60
You bought an item for 60 cents and gave me a dollar, 
so your change is: 
1 quarter(s),
1 dime(s), and
1 nickel(s).

 ----jGRASP: operation complete.
*/