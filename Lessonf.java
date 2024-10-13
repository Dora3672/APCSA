public class Lessonf {

   public static int fib (int n) {
      int a = 0;
      int b = 1;
   
      if (n == 1) {
         return a;
      }
      if (n == 2) {
         return b;
      }
      else{
         return fib(n - 2) + fib(n - 1);
      }
   }
   
   public static int sum (int n) {
      if (n == 1) {
         return 1;
      }
      else {
         return n + sum(n - 1);
      }
   }
   
   public static void printstring (String a) {
      if (a.length() > 0) {
         printstring(a.substring(1));
         System.out.print(a.substring(0, 1));
      }
   }
   
   public static int blocks (int n) {
      if (n == 0) {
         return 0;
      }
      else {
         return blocks(n - 1) + n;
      }
   }
   
   
   public static void main (String [] args) {
      System.out.println(fib(10));
      System.out.println(sum(5));
      printstring("How are you?");
      System.out.println();
      System.out.println(blocks(3));
   }

}