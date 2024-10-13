/******************************************************************************
Name: Dora Ding
Name of Lab: Box
Due Date: 6/5/2022
Date Submitted: 6/9/2022
What I learned:
   a. I learned how to create and use class.
*******************************************************************************/

public class Box {
   
   private int width, length, height;

   public Box() {
      this.width = 1; this.length = 1; this.length = 1;
   }

   public Box (int width, int length, int height) {
      this.width = width;
      this.length = length;
      this.height = height;
   }

   public String toString () {
      return "\nWidth: " + width +
             "\nLength: " + length +
             "\nHeight: " + height;
   }

   public static void main (String [] args) {
      Box defaultBox = new Box();
      Box box = new Box(1, 2, 3);
      System.out.println(defaultBox);
      System.out.println(box);
      
      System.out.println("\nSurface Area: " + defaultBox.getSurfaceArea());
      System.out.println("Volume: " + defaultBox.getVolume());
      
      System.out.println("\nSurface Area: " + box.getSurfaceArea());
      System.out.println("Volume: " + box.getVolume());
   }
   
   public int getSurfaceArea() {
      if (width == 0){
         return length * height;
      }   
      else if (length == 0) {
         return width * height;
      }
      else if (height == 0){
         return length * width;
      }
      else{
         return 2 * (width * height + height * length + length * width);
      }
   }
   
   public int getVolume () {
      return width * height * length;
   }

}

/*
     ----jGRASP exec: java Box
 
 Width: 1
 Length: 1
 Height: 0
 
 Width: 1
 Length: 2
 Height: 3
 
 Surface Area: 1
 Volume: 0
 
 Surface Area: 22
 Volume: 6
 
  ----jGRASP: operation complete.
 */