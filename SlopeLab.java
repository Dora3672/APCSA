/******************************************************************************
Name: Dora Ding
Name of Lab: SlopeLab
Due Date: 5/01/2022
Date Submitted: 4/29/2022
What I learned:
   a. I learned how to use if, else if, else statement.
   b. I learned how to use create a method with void.
*******************************************************************************/

import java.util.Scanner;

public class SlopeLab {
   public static void main (String [] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter the coordinates of point 1 (x,y): ");
      int one = console.nextInt();
      int two = console.nextInt();
      
      Scanner console1 = new Scanner(System.in);
      System.out.print("Enter the coordinates of point 2 (x,y): ");
      int three = console1.nextInt();
      int four = console1.nextInt();
   
      calculate(one,two,three,four);
   }

   public static void calculate (int x1, int y1, int x2, int y2) {
      
      if (x1 == x2 && y1 == y2) {
         System.out.println("Same points are given twice. Can't determine the slope");
      }
      else if (y1 == y2) {
         System.out.println("Alert! The line is horizontal.");
      }
      else if (x1 == x2) {
         System.out.println("Alert! The line is vertical.");
      }
      else {
         double slope = (y2 - y1) / (x2 - x1);
         System.out.println("The slope of the line is " + slope + ".");
      }
   }
}


/*
  ----jGRASP exec: java SlopeLab
 Enter the coordinates of point 1 (x,y): 5 6
 Enter the coordinates of point 2 (x,y): 5 5
 Alert! The line is vertical.
 
  ----jGRASP: operation complete.

  
  ----jGRASP exec: java SlopeLab
 Enter the coordinates of point 1 (x,y): 6 8
 Enter the coordinates of point 2 (x,y): 8 8
 Alert! The line is horizontal.
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java SlopeLab
 Enter the coordinates of point 1 (x,y): 3 7
 Enter the coordinates of point 2 (x,y): 8 2
 The slope of the line is -1.0.
 
  ----jGRASP: operation complete.

  ----jGRASP exec: java SlopeLab
 Enter the coordinates of point 1 (x,y): 6 6
 Enter the coordinates of point 2 (x,y): 6 6
 Same points are given twice. Can't determine the slope
 
  ----jGRASP: operation complete.
  */