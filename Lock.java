/******************************************************************************
Name: Dora Ding
Name of Lab: Lock
Due Date: 5/01/2022
Date Submitted: 4/29/2022
What I learned:
   a. I learned how to create boolean method.
   b. I learned how to use if statement.
*******************************************************************************/

import java.util.Scanner;

public class Lock {
   
   public static void main (String [] args) {
   
      int first = number();
      int second = number();
      int third = number();
   
      Scanner console = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      int a = console.nextInt();
      
      Scanner console1 = new Scanner(System.in);
      System.out.print("Enter the second number: ");
      int b = console1.nextInt();
   
      Scanner console2 = new Scanner(System.in);
      System.out.print("Enter the third number: ");
      int c = console2.nextInt();
   
   
      System.out.println("It is " + theLockIsOpen(a, first, b, second, c, third) + " that the lock is open.");
   
   }
  
  
   public static int number() {
      int max = 99;
      int min = 0;
   
      int num = (int)Math.floor(Math.random() * (max - min + 1) + min);
      
      return num; 
   }
   
   public static boolean theLockIsOpen(int one, int two, int three, int four, int five, int six) {
      
      if (Math.abs(one - two) <= 3 && Math.abs(three - four) <= 3 && Math.abs(five - six) <= 3) {
         System.out.println(two + ", " + four + ", " + six);
         return true;
      }   
      else {
         System.out.println(two + ", " + four + ", " + six);
         return false;
      }
         
         
   } 
}

/*
  ----jGRASP exec: java Lock
 Enter the first number: 50
 Enter the second number: 20
 Enter the third number: 89
 45, 57, 30
 It is false that the lock is open.
 
  ----jGRASP: operation complete.
*/