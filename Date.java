/******************************************************************************
Name: Dora Ding
Name of Lab: Date
Due Date: 4/9/2022
Date Submitted: 3/27/2022
What I learned:
   a. I learned how to print multiple variables at once.
   b. I learned how to use String.
   c. I learned how to use int.
*******************************************************************************/

public class Date {
   public static void main (String [] args) {
      String day = "Sunday";
      String month = "March";
      int date = 27;
      int year = 2022;
    
       //American format
      System.out.println(day + ", " + month + " " + date + ", " + year);
      
        //European format
      System.out.println(day + ", " + date + " " + month + ", " + year);
   }
}

/*
 ----jGRASP exec: java Date
 Sunday, March 27, 2022
 Sunday, 27 March, 2022
 
  ----jGRASP: operation complete.
*/