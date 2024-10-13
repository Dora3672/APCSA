/******************************************************************************
Name: Dora Ding
Name of Lab: DisplayVertical
Due Date: 4/17/2022
Date Submitted: 4/10/2022
What I learned:
  a. I learned how to program to vertically display a number.
  b. I learned how to show a digit of a number.
*******************************************************************************/

import java.util.Scanner;

public class DisplayVertical {
   public static void main (String [] args) {
      
      Scanner console = new Scanner (System.in);
      System.out.println("Type in a 4 digit number: ");
      int UserInt = console.nextInt();
      
      int thousand = UserInt % 10000 / 1000;
      System.out.println(thousand);
      
      int hundred = UserInt % 1000 / 100;
      System.out.println(hundred);
      
      int ten = UserInt % 100 / 10;
      System.out.println(ten);
     
      int unit = UserInt % 10 / 1;
      System.out.println(unit);
   }
}

/*
 ----jGRASP exec: java DisplayVertical
Type in a 4 digit number: 
3789
3
7
8
9

 ----jGRASP: operation complete.
*/