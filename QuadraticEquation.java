/******************************************************************************
Name: Dora Ding
Name of Lab: QuadraticEquation
Due Date: 06/20/2022
Date Submitted: 06/20/2022
What I learned:
   a. I learned how to create classes.
*******************************************************************************/

import java.util.Scanner;

public class QuadraticEquation {
   
   private int a, b, c;
   private double discriminant;
   
   public QuadraticEquation(int x, int y, int z) {
      a = x;
      b = y;
      c = z;
   }
   
   public double findDiscriminant () {
      discriminant = (Math.pow(b, 2)) - (4 * a * c);
      return discriminant;
   }
   
   public boolean noSolution () {
      if (discriminant < 0) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public boolean equalRoots () {
      if (discriminant > 0) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public double getSolution () {
      double solution = -b / (2 * a);
      return solution;
   }
   
   public double getSolution1 () {
      double solution1 = (-b - Math.sqrt(discriminant)) / (2 * a);
      return solution1;
   }
   
   public double getSolution2 () {
      double solution2 = (-b + Math.sqrt(discriminant)) / (2 * a);
      return solution2;
   }
   
   public static void main (String [] args) {
      System.out.println("Enter a, b, and c:");
      Scanner console = new Scanner (System.in);
      int f = console.nextInt();
      int g = console.nextInt();
      int h = console.nextInt();
      
      QuadraticEquation i = new QuadraticEquation(f, g, h);
      
      double dis = i.findDiscriminant();
      
      if (dis == 0) {
         System.out.println("The only solution is " + i.getSolution());
      }
      else if (i.equalRoots() == true) {
         System.out.println("The two real solutions are " + i.getSolution1() + " & " + i.getSolution2());
      }
      else if (i.noSolution() == true) {
         System.out.println("No real solution");
      }
      
   
   }
   
}

/*
     ----jGRASP exec: java QuadraticEquation
 Enter a, b, and c:
 1 2 1
 The only solution is -1.0
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java QuadraticEquation
 Enter a, b, and c:
 5 25 4
 The two real solutions are -57.0 & 52.0
 
  ----jGRASP: operation complete.
  
  ----jGRASP exec: java QuadraticEquation
 Enter a, b, and c:
 5 25 4
 The two real solutions are -4.83452350598575 & -0.16547649401424955
 
  ----jGRASP: operation complete.
  */