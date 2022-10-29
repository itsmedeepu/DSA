import java.util.Scanner;

public class barChart {

    public static void main(String[] args) {

        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter array size");
        n = obj.nextInt();

        int arr[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = obj.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");

                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        obj.close();
    }

}
