import java.util.*;

public class searchNo {

    public static void main(String[] args) {

        System.out.println("enter no of rows and cols");
        Scanner obj = new Scanner(System.in);
        int rows = obj.nextInt();
        int cols = obj.nextInt();

        int[][] numbers = new int[rows][cols];
        // elements input
        System.out.println("enter elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = obj.nextInt();
            }
        }

        // elements output
        System.out.println("matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        // enter key to search
        System.out.println("enter the element to be searched");
        int key = obj.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (key == numbers[i][j]) {
                    System.out.println(numbers[i][j] + " found at {" + i + " , " + j + "}");

                }
            }
        }

        obj.close();
    }
    }
