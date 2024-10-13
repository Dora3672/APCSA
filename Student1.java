public class Student1 {

   public static void main (String [] args) {
      Student a = new Student(19, 4.0);
      System.out.println(a);
      
      Student b = new Student(18, 3.9);
      System.out.println(b);
      
      Student c = new Student(20, 3.8);
      System.out.println(c);
      
      Student d = new Student(20, 4.0);
      System.out.println(d);
      
      Student [] studentList = new Student[4];
      studentList[0] = a;
      studentList[1] = b;
      studentList[2] = c;
      studentList[3] = d;
      
      for (int i = 0; i < studentList.length; i += 1) {
         System.out.println(studentList[i]);
      }
      
      Student [] studentList1 = {a, b, c, d};
      for (Student list: studentList1) {
         System.out.println(list);
      }
      
   }

}