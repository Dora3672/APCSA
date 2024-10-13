/******************************************************************************
Name: Dora Ding
Name of Lab: Rectangles
Due Date: 4/17/2022
Date Submitted: 4/10/2022
What I learned:
  a. I learned how to use the different math operators.
  b. I learned how to use Scanner.
  c. I learned how to program to find the perimeter and area of rectangles.
*******************************************************************************/

import java.util.Scanner;
public class Rectangles {
   public static void main (String [] args) {
      
      Scanner console = new Scanner (System.in);
      System.out.println("Type in the rectangle's width: ");
      int width = console.nextInt();
      
      Scanner console1 = new Scanner (System.in);
      System.out.println("Type in the rectangle's height: ");
      int height = console1.nextInt();
     
      int perimeter = 2 * (height + width);
      System.out.println("The rectangle's perimeter is " + perimeter + " unit.");
      
      int area = height * width;
      System.out.println("The rectangle's area is " + area + " unit^2.");
   }
}

/*
----jGRASP exec: java Rectangles
Type in the rectangle's width: 
2
Type in the rectangle's height: 
3
The rectangle's perimeter is 10 unit.
The rectangle's area is 6 unit^2.

 ----jGRASP: operation complete.
 */