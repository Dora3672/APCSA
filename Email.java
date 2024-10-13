/******************************************************************************
Name: Dora Ding
Name of Lab: Email
Due Date: 6/5/2022
Date Submitted: 6/9/2022
What I learned:
   a. I learned how to create and use class.
*******************************************************************************/

public class Emai {
   
   private String myUserName, myHostName, myExtension;

   public Email (String user) {
      myUserName = user;
   }

   public String toString () {
      return "\nEmail address: " + myUserName;
   }

   public String getUserName () {
      int e = myUserName.indexOf("@");
      return myUserName.substring(0, e);
   }
   
   public String getHostName () {
      int st = myUserName.indexOf("@");
      int en = myUserName.lastIndexOf(".");
      return myUserName.substring(st + 1, en);
   }
   
   public String getExtension () {
      int sta = myUserName.lastIndexOf(".");
      int end = myUserName.length();
      return myUserName.substring(sta + 1, end);
   }

   public static void main (String [] args) {
      Email a = new Email("hello@gmail.com");
      Email b = new Email("12345679@hotmail.com");
      System.out.println(a);
      System.out.println(b);
      
      System.out.println("\nUser name: " + a.getUserName());
      System.out.println("User name: " + b.getUserName());
      
      System.out.println("\nHost name: " + a.getHostName());
      System.out.println("Host name: " + b.getHostName());
      
      System.out.println("\nExtension: " + a.getExtension());
      System.out.println("Extension: " + a.getExtension());
   }

}

/*
  ----jGRASP exec: java Email
 
 Email address: hello@gmail.com
 
 Email address: 12345679@hotmail.com
 
 User name: hello
 User name: 12345679
 
 Host name: gmail
 Host name: hotmail
 
 Extension: com
 Extension: com
 
  ----jGRASP: operation complete.
 
 */