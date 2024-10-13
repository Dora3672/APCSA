public class Lessonn{

   public static void main (String [] args) {
      int [] []A = {{-2, 5, 6}, {5, 2, 7}};
      System.out.println(A.length);
      System.out.println(A[0].length);
      
      
      for (int row = 0; row < A.length; row ++) {
         for (int col = 0; col < A[0].length; col ++) {
            System.out.println(A[row][col]);
         }
      }
      
      for (int col = 0; col < A[0].length; col ++) {
         for (int row = 0; row < A.length; row ++) {
            System.out.println(A[row][col]);
         }
      }
      
      int sum = 0;
      for (int row = 0; row < A.length; row ++) {
         for (int col = 0; col < A[0].length; col ++) {
            sum += A[row][col];
         }
      }
      System.out.println(sum);
      
      
      for (int col = 0; col < A[0].length; col ++) {
         A[1][col] += 10;
      }
      
      for (int col = 0; col < A[0].length; col ++) {
         System.out.println(A[1][col]);
      }
      
      
      for (int row = 0; row < A.length; row ++) {
         for (int col = 0; col < A[0].length; col ++) {
            System.out.print(A[row][col] + " ");
         }
         System.out.print("\n");
      }
      
      int [][]matrix = {{5, 9, 8}, {2, 7, 6}, {2, 3, 6}};
      int col1 = 0;
      for (int row = 0; row < matrix.length; row ++) {
         matrix[row][col1] += 1;
         col1 += 1;
      }
      
      int col2 = 2;
      for (int row = 0; row < matrix.length; row ++) {
         matrix[row][col2] += 1;
         col2 -= 1;
      }
      
      for (int row = 0; row < matrix.length; row ++) {
         for (int col = 0; col < matrix[0].length; col ++) {
            System.out.print(matrix[row][col] + " ");
         }
         System.out.print("\n");
      }
      
   }
      
   }
      
}
   
