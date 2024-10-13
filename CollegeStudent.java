public class CollegeStudent extends Student {

   private String major;
   
   public CollegeStudent (int a, double g, String m) {
      super (a, g);
      major = m;
   }

   public String getMajor () {
      return major;
   }
   
   public String toString () {
      return super.toString() + "\nMajor: " + major;
   }
   
   public static void main (String [] args) {
      Student a = new Student(10, 4.0);
      Student b = new CollegeStudent(20, 3.8, "Art");
      Student c = new CollegeStudent(10, 4.0, "Math");
      String m2 = ((CollegeStudent) c).getMajor();
   }
   
}