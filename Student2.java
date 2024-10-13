public class Student2{
   private int studentID;
   private String name;
   private double gpa;
   
   public Student2 (String n, int s, double g) {
      studentID = s;
      name = n;
      gpa = g;
   }
   
   public String toString () {
      return "\nName: " + name
            + "\nStudent ID: " + studentID
            + "\nGPA: " + gpa + "\n";
   }
   
   public int getID () {
      return studentID;
   }
   
   public String getName () {
      return name;
   }
   
   public double getGPA () {
      return gpa;
   }


}