public class Student {

   private int age;
   private double gpa;
   
   public Student (int a, double g) {
      age = a;
      gpa = g;
   }
   
   public int getAge () {
      return age;
   }
   
   public double getGpa () {
      return gpa;
   }


   public String toString () {
      return "Age: " + age + "\nGPA: " + gpa;
   }
   
}