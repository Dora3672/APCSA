public class practice {

   public static void main (String [] args) {
   
      String a = "1000_Mike_Wu";
      String b = "1000_Jessica_Wu";
      
      System.out.println(findFirstName(a));
      System.out.println(findFirstName(b));
      
   
      
      String x = "HI";
      String y = "HI";
      String z = "HI";
      String f = "Hi";
      
      System.out.println(checkEquals(x, y, z));
      System.out.println(checkEquals(x, y, f));
   
   /*     ----jGRASP exec: java practice
   Mike
   Jessica
   true
   false
   
   ----jGRASP: operation complete.
   */
   
   }
   
   public static String findFirstName (String info) {
      int end = info.length();
      String first = info.substring (5, end - 3);
      return first;       
   }
   
   public static boolean checkEquals (String a, String b, String c) {
      
      if (a.equals(b) && b.equals(c)) {
         return true;
      }
      else {
         return false;
      }   
   }
   
   
}