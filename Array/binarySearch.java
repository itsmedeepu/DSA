import java.util.*;

public class binarySearch {

    public static void main(String[] args) {

        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("enter  " + size + " array elements(in sorted order)");
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter element to search");
        int key = sc.nextInt();

        // output
        int l = 0, r = size;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (key == numbers[mid]) {
                System.out.println(key +" found at index " + mid);
                break;
            } else if (numbers[mid] < key) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        sc.close();
    }
}


