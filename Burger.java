/******************************************************************************
Name: Dora Ding
Name of Lab: Burger
Due Date: 5/07/2022
Date Submitted: 5/20/2022
What I learned:
   a. I learned how to use a while loop.
   b. I learned how to insert new decimal format for 0.00.
*******************************************************************************/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Burger {
   
   public static void main (String [] args) {
      Scanner console = new Scanner(System.in);
      
      int x = 1;
      DecimalFormat d = new DecimalFormat("0.00");
      double total = 0;
      
      while (x <= 4) {
         System.out.println("How many hours did you work in week " + x + " ?");
         int a = console.nextInt();
         while (a < 0) {
            System.out.println("Please enter a positive number of hours.");
            a = console.nextInt();
         }
         System.out.println("Your take home pay is " + d.format(a * 5.15 * 0.7) + ".");
         total += a * 5.15 * 0.7;
         x++;
      }      
   
      System.out.println("Your total pay for the month is " + d.format(total) + ".");
      System.out.println("Hope you enjoy working at Babbage Burgers.");
   }
}

/*

  ----jGRASP exec: java Burger
 How many hours did you work in week 1 ?
 35
 Your take home pay is 126.17.
 How many hours did you work in week 2 ?
 -4
 Please enter a positive number of hours.
 41
 Your take home pay is 147.81.
 How many hours did you work in week 3 ?
 37
 Your take home pay is 133.38.
 How many hours did you work in week 4 ?
 45
 Your take home pay is 162.23.
 Your total pay for the month is 569.59.
 Hope you enjoy working at Babbage Burgers.
 
  ----jGRASP: operation complete.
*/