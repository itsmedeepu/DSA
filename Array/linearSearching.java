import java.util.*;

public class linearSearching {

    public static void main(String[] args) {

        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("enter  " + size + " array elements");
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter element to search");
        int key = sc.nextInt();
        // output
        for (int i = 0; i < size; i++) {

            if (key == numbers[i]) {

                // System.out.println(key + " found at position " + (i + 1) + " of array
                // elements \n");
                // or
                System.out.println(key + " found at index  " + i + " of array elements ");
                // or
                // System.out.println(i);

            }

        }
        sc.close();
    }
}