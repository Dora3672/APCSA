/******************************************************************************
Name: Dora Ding
Name of Lab: MultAdd
Due Date: 4/24/2022
Date Submitted: 4/17/2022
What I learned:
   a. I learned how to create methods.
   b. I learned how to use methods.
*******************************************************************************/


public class MultAdd  {
   public static void main (String [] args) {
      System.out.println(multadd(1.0, 2.0, 3.0));
      System.out.println(multadd(Math.sin(Math.PI / 4), Math.cos(Math.PI / 4), 0));
      System.out.println(multadd(Math.log(10), Math.log(20), 0));
      System.out.println(yikes(0));
      System.out.println(yikes(1));
   }
   
   public static double multadd (double a, double b, double c) {
      return a + b + c;
   }
   
   public static double yikes (double x) {
      return multadd(x * Math.exp(-x), Math.sqrt(1 - Math.exp(-x)), 0);
   }
}

/*
  ----jGRASP exec: java MultAdd
 6.0
 1.414213562373095
 5.298317366548037
 0.0
 1.1629395387920924
 
  ----jGRASP: operation complete.
  */