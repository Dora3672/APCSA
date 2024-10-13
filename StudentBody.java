/******************************************************************************
Name: Dora Ding
Name of Lab: StudentBody   
Due Date:6/25/2022
Date Submitted: 7/17/2022
What I learned:
  a. I learned how to create and use 1D array.
*******************************************************************************/
import java.util.Scanner;

public class StudentBody
{
   
   private Student2 [] student;
   
   // initialize student by prompting the user to enter the number of students
   public StudentBody () {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int studentnum = console.nextInt(); 
      student = new Student2[studentnum];      
   }
   
   //post-con: prompts the user to enter student datas into the array
   public void init () {  
      Student2 a;
      for (int i = 0; i < student.length; i ++) { 
         int num = i + 1;    
         Scanner console1 = new Scanner(System.in);
         System.out.print("Enter the name of student #" + num + ": "); 
         String name = console1.next();
         System.out.print("Enter the student ID of " + name + ": ");
         int id = console1.nextInt(); 
         System.out.print("Enter the GPA of " + name + ": ");
         double GPA = console1.nextDouble();
         a = new Student2(name, id, GPA);
         student[i] = a;
         System.out.println();
      }  
   }
   
   public String toString () {
      String result = "";
      for (int i = 0; i < student.length; i ++) {
         result += student[i].toString();
      }
      return result;
   }
   
   //post-con: return the student object with the same student id, if the student id doesn't exist, return null 
   public Student2 search (int id) {
   
      boolean check = false;
      Student2 result1 = null;
      for (int i = 0; i < student.length; i += 1 {
         if (student[i].getID() == id) {
            result1 = student[i];
            check = true;
         }
      }
      
      if (check == true) {
         return result1;
      }
      else {
         return null;
      }
   
   }
}


/*
     ----jGRASP exec: java StudentArrayTester
 Enter the number of students: 5
 Enter the name of student #1: Ana
 Enter the student ID of Ana: 10001
 Enter the GPA of Ana: 3.8
 
 Enter the name of student #2: Bob
 Enter the student ID of Bob: 10002
 Enter the GPA of Bob: 4.1
 
 Enter the name of student #3: Charlie
 Enter the student ID of Charlie: 10003
 Enter the GPA of Charlie: 3.5
 
 Enter the name of student #4: David
 Enter the student ID of David: 10004
 Enter the GPA of David: 3.7
 
 Enter the name of student #5: Eliza
 Enter the student ID of Eliza: 10005
 Enter the GPA of Eliza: 4.3
 
 Enter the id of the student you are looking for: 
 10003
 
 Name: Charlie
 Student ID: 10003
 GPA: 3.5
 
 Student Body Information:
 Name: Ana
 Student ID: 10001
 GPA: 3.8
 
 Name: Bob
 Student ID: 10002
 GPA: 4.1
 
 Name: Charlie
 Student ID: 10003
 GPA: 3.5
 
 Name: David
 Student ID: 10004
 GPA: 3.7
 
 Name: Eliza
 Student ID: 10005
 GPA: 4.3
 
 
  ----jGRASP: operation complete.
 
*/