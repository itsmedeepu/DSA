import java.util.*;

public class matrixForm {
   public static void main(String args[])
   {
      System.out.println("enter no of rows and cols");
      Scanner obj = new Scanner(System.in);
      int rows = obj.nextInt();
      int cols = obj.nextInt();

      int[][] numbers = new int[rows][cols];

      // input
      for(int i = 0 ; i<rows ; i++)
      {
         for(int j = 0 ;j< cols ; j++)
         {
            numbers[i][j] = obj.nextInt();
         }
      }

      // output
      for(int i = 0 ; i<rows ; i++)
      {
         for(int j = 0 ;j< cols ; j++)
         {
            System.out.print(numbers[i][j] + " ");
         }
         System.out.println();
      }
    obj.close();

   }

}