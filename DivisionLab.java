/******************************************************************************
Name: Dora Ding
Name of Lab: DivisionLab
Due Date: 5/01/2022
Date Submitted: 4/29/2022
What I learned:
   a. I learned how to create a compare method.
   b. I learned how to use if statement.
*******************************************************************************/

import java.util.Scanner;

public class DivisionLab {

   public static void main (String [] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter your first number: ");
      int a = console.nextInt();
      
      Scanner console1 = new Scanner(System.in);
      System.out.print("Enter your second number: ");
      int b = console1.nextInt(); 
      
      int bigger = compare(a, b);
      int smaller = compare2(a, b);
      
      System.out.println("Your quotient is: " + bigger / smaller);
      System.out.println("Your remainder is: " + bigger % smaller);
   }
            
   public static int compare (int a, int b) {
      if (a > b) {
         return a;
      }
      else{
         return b;
      }
   }
      
   public static int compare2 (int a, int b) {
      if (a > b) {
         return b;
      }
      else {
         return a;
      }
   }

}

/*
 ----jGRASP exec: java DivisionLab
 Enter your first number: 6
 Enter your second number: 4
 Your quotient is: 1
 Your remainder is: 2
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java DivisionLab
 Enter your first number: 5
 Enter your second number: 26
 Your quotient is: 5
 Your remainder is: 1
 
  ----jGRASP: operation complete.
 */