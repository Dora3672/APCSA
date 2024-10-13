import java.util.Scanner;
public class Lesson {
   public static void main (String[] args) {
       /*
       int sum = 0;
       for (int i = 3; i <= 27; i += 3) {
          sum += i;
       }
      System.out.println(sum);
   
      for (int i = 10; i >= 1; i --) {
         System.out.println("I have " + i + " watermelon!");
      }
      
      int x = 3;
      int sum1 = 0;
      while (x <= 27) {
         sum1 += x;
         x += 3;
      }
      System.out.println(sum1);
      
      int y = 10;
      while (y >= 1) {
      System.out.println("I have " + y + " watermelon!");
      y--;
      }
      */
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a multiple of 3: ");
      int a = console.nextInt(); 
      
      while (a % 3 != 0) {
         System.out.println("Error! Please enter a multiple of 3 again.");
         a = console.nextInt();
      }
      System.out.println("You entered a multiple of 3!");
   }
}