 /******************************************************************************
Name: Dora Ding
Name of Lab: TestPVT
Due Date: 06/20/2022
Date Submitted: 06/20/2022
What I learned:
   a. I learned how to use inheritance.
*******************************************************************************/

public class TestPVT {
  
   public static void main (String [] args) {
      Person a = new Person();
      a.setPersonName("Jack");
      a.setAge(35);
      System.out.println(a.getPersonName());
      System.out.println(a.getAge());
      
      Person b = new Person("Jenny", 30);
      System.out.println(b.getPersonName());
      System.out.println(b.getAge());
      
      
      Vehicle c = new Vehicle();
      c.setName("US");
      c.setNumOfCylinder(50);
      c.setOwner("Jack");
      System.out.println(c.getName());
      System.out.println(c.getNumOfCylinder());
      System.out.println(c.getOwner());
      
      Vehicle d = new Vehicle("Hi", 40, "Jess");
      System.out.println(d.getName());
      System.out.println(d.getNumOfCylinder());
      System.out.println(d.getOwner());
      
      
      Truck e = new Truck();
      e.setName("Best");
      e.setNumOfCylinder(25);
      e.setOwner("James");
      e.setLoadCapacity(65);
      e.setTowingCapacity(90);
      System.out.println(e.getName());
      System.out.println(e.getNumOfCylinder());
      System.out.println(e.getOwner());
      System.out.println(e.getLoadCapacity());
      System.out.println(e.getTowingCapacity());
   
      Truck f = new Truck("US", 50, "Jack", 70, 100);
      System.out.println(f.getName());
      System.out.println(f.getNumOfCylinder());
      System.out.println(f.getOwner());
      System.out.println(f.getLoadCapacity());
      System.out.println(f.getTowingCapacity());
      
      
      System.out.println(a.equals(b));
      System.out.println(c.equals(d));
      System.out.println(c.equals(f));
      System.out.println(e.equals(f));
   }

}