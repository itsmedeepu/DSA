
import java.util.*;

public class sumOfcols {

    public static void main(String[] args) {
        System.out.println("enter number of rows and cols");
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

        System.out.println("matrix is");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sum of rows");
        for (int i = 0; i < cols; i++) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += numbers[j][i];
            }
            System.out.println("the sum of cols " + (i + 1) + " : " + sum);
        }
        obj.close();
    }

}
