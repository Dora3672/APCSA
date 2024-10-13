/******************************************************************************
Name: Dora Ding
Name of Lab: EuclideanAlgorithm
Due Date: 5/22/2022
Date Submitted: 6/9/2022
What I learned:
a. I learned how to find GCD.
b. I learned how to use Euclidean Algorithm.
*******************************************************************************/

import java.util.Scanner;

public class EuclideanAlgorithm {

   public static void main (String [] args) {
   
      Scanner console = new Scanner (System.in);
      System.out.println("Enter number 1: ");
      int a = console.nextInt();
      positive(a);
      
      System.out.println("Enter number 2: ");
      int b = console.nextInt();
      positive(b);
      
      int d = findGCD(a, b);
      System.out.println("The greatest common divisor is " + d);
      
   }
   
   public static void positive (int x) {
      while(x <= 0) {
         System.out.println("Please enter a positive number.");
         Scanner console = new Scanner(System.in);
         x = console.nextInt();
      }
   
   }
   
   public static int findGCD (int a, int b) {
      int gcd = 1;
      
      for (int i = 1; (i <= a) && (i <= b); i ++) {           
         
         if (((a % i) == 0) && ((b % i) == 0)) {
            gcd = i;
         } 
      }
      return gcd;
   }
}

/*  
  ----jGRASP exec: java EuclideanAlgorithm
 Enter number 1: 
 47
 Enter number 2: 
 47
 The greatest common divisor is 47
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java EuclideanAlgorithm
 Enter number 1: 
 51
 Enter number 2: 
 181
 The greatest common divisor is 1
 
  ----jGRASP: operation complete.
 */