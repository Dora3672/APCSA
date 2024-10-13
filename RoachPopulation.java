/******************************************************************************
Name: Dora Ding
Name of Lab: RoachPopulation
Due Date: 6/5/2022
Date Submitted: 6/9/2022
What I learned:
   a. I learned how to create and use class.
*******************************************************************************/

public class RoachPopulation {
   
   private int numRoaches;
   
   public RoachPopulation (int b) {
      numRoaches = b;
   }

   public String toString () {
      return "There are currently " + numRoaches + " roaches.";
   }
   
   public int waitForDoubling () {
      int dou = 2 * numRoaches;
      return numRoaches = dou;
   }
   
   public int spray () {
      int spr = numRoaches - (numRoaches / 10);
      return numRoaches = spr;
   }
   
   public int getRoaches () {
      return numRoaches;
   }
   
   public static void main (String [] args) {
      RoachPopulation a = new RoachPopulation(10);
      System.out.println(a);
      
      for(int i = 1; i <= 3; i ++) {
         a.waitForDoubling();
         a.spray();
         System.out.println("After " + i * 24 + " horus:" + a);
      }
   }

}

/*
  ----jGRASP exec: java RoachPopulation
 There are currently 10 roaches.
 After 24 horus:There are currently 18 roaches.
 After 48 horus:There are currently 33 roaches.
 After 72 horus:There are currently 60 roaches.
 
  ----jGRASP: operation complete.
 
 */