import java.util.*;
public class maxOfrow {

    public static void main(String[] args) {
        System.out.println("enter rows and cols");
        Scanner obj = new Scanner(System.in);
        int rows = obj.nextInt();
        int cols = obj.nextInt();

        int[][] numbers = new int[rows][cols];
        System.out.println("enter elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = obj.nextInt();
            }
        }

        System.out.println("matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               System.out.print(numbers[i][j] + " ");
            }
            System.out.println( );
        }

        
        for (int i = 0; i < rows; i++) {
            int max = numbers[i][0];
            for (int j = 0; j < cols; j++) {
            max = (numbers[i][j] > max) ? numbers[i][j] : max;
        }
        System.out.println("max of row " + (i+1) + " : " + max);
    }

obj.close();
    }
    
}
