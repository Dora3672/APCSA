/******************************************************************************
Name: Dora Ding
Name of Lab: Average
Due Date: 4/17/2022
Date Submitted: 4/10/2022
What I learned:
  a. I learned how to use Scanner with double.
  b. I learned how to program to find the average of numbers.
*******************************************************************************/

import java.util.Scanner;

public class Average {
   public static void main (String [] args) {
      
      Scanner console = new Scanner(System.in);
      System.out.println("Type in number 1: ");
      double noone = console.nextDouble();
      
      Scanner console1 = new Scanner(System.in);
      System.out.println("Type in number 2: ");
      double notwo = console1.nextDouble();
     
      Scanner console2 = new Scanner(System.in);
      System.out.println("Type in number 3: ");
      double nothree = console2.nextDouble();
      
      double average = (noone + notwo + nothree) / 3;
      System.out.println("Your average is " + average + ".");
      
   }
}

/*
----jGRASP exec: java Average
Type in number 1: 
5.5
Type in number 2: 
8
Type in number 3: 
3
Your average is 5.5.

 ----jGRASP: operation complete.
 */