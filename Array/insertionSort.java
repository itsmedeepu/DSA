// insertion sorting 

import java.util.*;

public class insertionSort {

    public static void main(String[] args) {
        // input array size
        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input array elements
        System.out.println("enter array elements");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        // output unsorted array
        System.out.println("unsorted array is:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }

        // output sorted array
        System.out.println("\nsorted array is:");
        // insertion sorting
        for (int i = 1; i < size; i++) {
            int temp = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > temp) {
                numbers[j + 1] = numbers[j];
                j--;

            }
            numbers[j + 1] = temp;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.err.print(numbers[i] + " ");
        }

        sc.close();
    }

}
