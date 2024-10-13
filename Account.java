/******************************************************************************
Name: Dora Ding
Name of Lab: Account
Due Date: 6/5/2022
Date Submitted: 6/9/2022
What I learned:
   a. I learned how to create and use class.
*******************************************************************************/

public class Account {
   
   private int balance;

   public Account () {
      balance = 0;
   }

   public Account (int b) {
      balance = b;
   }

   public String toString () {
      return "Balance: " + balance;
   }
   
   public int deposit (int d) {
      balance = balance + d;
      return balance;
   }
   
   public int withdraw (int w) {
      if (balance > w) {
         balance = balance - w;
         return balance;
      }  
      else{
         return balance;
      } 
   }
   
   public int getBalance () {
      return balance;
   }
   
   public static void main (String[] args) {
      Account a = new Account();
      Account b = new Account(100);
      System.out.println(a);
      System.out.println(b);
   
      System.out.println("\nBalance: " + a.deposit(10));
      System.out.println("\nBalance: " + b.withdraw(10));
      System.out.println("Balance: " + b.withdraw(200));
   }

}

/*
     ----jGRASP exec: java Account
 Balance: 0
 Balance: 100
 
 Balance: 10
 
 Balance: 90
 Balance: 90
 
  ----jGRASP: operation complete.
 
 */