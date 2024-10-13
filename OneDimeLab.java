/******************************************************************************
Name: Dora Ding
Name of Lab: OneDimLab
Due Date:6/25/2022
Date Submitted: 7/17/2022
What I learned:
  a. I learned how to create and use 1D array.
*******************************************************************************/

public class OneDimLab {

   public static void main (String [] args) {
      
      int [] array = {15, -5, 25, 75, 9, -2, -80, -100, 99, 21, 23, 40, 45, 67, 100, 44, 28, 1, 3};
   
      System.out.println(findMax(array));
      System.out.println(findMin(array));
      
      System.out.println(findMaxIndex(array));
      System.out.println(findMinIndex(array));
      System.out.println(find (array, 3));
   
      printArray(posArray(array));
      printArray(negArray(array));         
   
      printArray(evenMembers(array));
      printArray(oddMembers(array));
      
      System.out.println("Sum : " + sum(array));
      System.out.println("Avg : " + average(array));
   
   } 
   

   public static int findMax (int [] a) {
      int max = a[0];
      for (int i = 1; i < a.length; i ++) {
         if (a[i] > max) {
            max = a[i];
         }
      }
      return max;
   }
   
   public static int findMaxIndex (int [] a) {
      int max = a[0];
      int maxindex = 0;
      for (int i = 1; i < a.length; i ++) {
         if (a[i] > max) {
            max = a[i];
            maxindex = i;
         }
      }
      return maxindex;
   }
   
   public static int findMin (int [] a) {
      int min = a[0];
      for (int i = 1; i < a.length; i ++) {
         if (a[i] < min) {
            min = a[i];
         }
      }
      return min;
   }
   
   public static int findMinIndex (int [] a) {
      int min = a[0];
      int minindex = 0;
      for (int i = 1; i < a.length; i ++) {
         if (a[i] < min) {
            minindex = i;
         }
      }
      return minindex;
   }
   
   public static boolean find (int [] a, int target) {
      int i = 0;
      boolean f = false;
      while (i < a.length) {
         if (target == a[i]) {
            f = true;
            break;
         }
         else {
            i ++;
         }
      }
      return f;
   }

   public static int [] posArray (int [] a) {
      int number = 0;
      for (int i = 0; i < a.length; i ++) {
         if (a[i] > 0) {
            number += 1;
         }
      }
      int [] positive = new int [number];
      int c = 0;
      for (int i = 0; i < a.length; i ++) {
         if (a[i] > 0) {
            positive[c] = a[i];
            c += 1;
         }
      }
      return positive;
   }

   public static int [] negArray (int [] a) {
      int number = 0;
      for (int i = 0; i < a.length; i ++) {
         if (a[i] < 0) {
            number ++;
         }
      }
      int [] negative = new int [number];
      int c = 0;
      for (int i = 0; i < a.length; i ++) {
         if (a[i] < 0) {
            negative[c] = a[i];
            c += 1;
         }
      }
      return negative;
   }

   public static int [] evenMembers (int [] a) {
      int number = 0;
      for (int i = 0; i < a.length; i ++) {
         if (a[i] % 2 == 0) {
            number ++;
         }
      }
      int [] even = new int [number];
      int c = 0;
      for (int i = 0; i < a.length; i ++) {
         if (a[i] % 2 == 0) {
            even[c] = a[i];
            c += 1;
         }
      }
      return even;
   }
   
   public static int [] oddMembers (int [] a) {
      int number = 0;
      for (int i = 0; i < a.length; i ++) {
         if (a[i] % 2 == 1) {
            number ++;
         }
      }
      int [] odd = new int [number];
      int c = 0;
      for (int i = 0; i < a.length; i ++) {
         if (a[i] % 2 == 1) {
            odd[c] = a[i];
            c += 1;
         }
      }
      return odd;
   }
   
   
   public static int sum (int [] a) {
      int sum = 0;
      for (int i = 0; i < a.length; i ++) {
         sum += a[i];
      }
      return sum;
   }

   public static double average (int [] a) {
      int sum = 0;
      for (int i = 0; i < a.length; i ++) {
         sum += a[i];
      }
      int ave = sum / a.length;
      return ave;
   }
   
   public static void printArray (int [] c) {
      for (int i = 0; i < c.length; i ++) {
         System.out.print(c[i] + " ");
      }
      System.out.println();
   }
}

/*
     ----jGRASP exec: java OneDimLab
 100
 -100
 14
 18
 true
 15 25 75 9 99 21 23 40 45 67 100 44 28 1 3 
 -5 -2 -80 -100 
 -2 -80 -100 40 100 44 28 
 15 25 75 9 99 21 23 45 67 1 3 
 Sum : 408
 Avg : 21.0
 
  ----jGRASP: operation complete.
 
 */