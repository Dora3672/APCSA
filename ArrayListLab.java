import java.util.ArrayList;
public class ArrayListLab {

   public static void main (String[] args) {
      ArrayList <String> a = new ArrayList <String> ();
      a.add("Hi");
      a.add("I");
      a.add("want");
      a.add("true");
      a.add("summer");
      a.add("holiday");
      System.out.println(a);
      
      int [] num = {0, 3, 4};
      ArrayList <String> b = removeAll(a, num);
      System.out.println(b);
      
      System.out.println(commonElement(a, b));
      
      ArrayList <Integer> c = new ArrayList <Integer> ();
      c.add(1);
      c.add(5);
      c.add(19);
      c.add(0);
      c.add(6);
      System.out.println(c);
      
      removeSmallest(c);
      System.out.println(c);
   }
   
// precondition: 0 <= indices[k] < items.size()
// j < k ==> indices[j] < indices[k]
// postcondition: all the values with indices equal to indices[k]
// (for some k) are removed from items
   public void removeAll(ArrayList <String> items, int [] indices) {
      for (int k = 0; k < indices.length; k ++) {
         items.remove(indices[k]);
      }
   }

// postcondition: return a new ArrayList in which the values of a
// are stored in reverse order. The original list a
// should not be changed.
   public ArrayList <String> reverseOrder (ArrayList <String> a) {
      ArrayList <String> newarray = new ArrayList <String> ();
      for (int i = a.size() - 1; i < a.size(); i --) {
         newarray.add(a.get(i));
      }
      return newarray;
   }

// postcondition: the smallest value in a should have been removed
   public static void removeSmallest(ArrayList <Integer> a) {
      int min = a.get(0);
      int minnum = 0;
      for (int i = 0; i < a.size(); i++) {
         if (min < a.get(i)) {
            min = a.get(i);
            minnum = i;
         }
      }
      a.remove(minnum);
   }

// postcondition: returns an ArrayList of all elements common between
// two ArrayList objects s1 and s2; s1 and s2 should not
// be changed by method
   public ArrayList <String> commonElement (ArrayList <String> list1, ArrayList
   <String> list2) {
      ArrayList <String> common = new ArrayList <String> ();
      for (int i = 0; i < list1.size(); i ++) {
         for (int i2 = 0; i2 < list2.size(); i2 ++) {
            if (list1.get(i) == list2.get(i2)) {
               common.add(list1.get(i));
            } 
         }
      }
      return common;
   }
}