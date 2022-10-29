import java.util.Scanner;

public class reverseAnArray {

    public static void swap(int arr[], int l, int r) {

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

    }

    public static void reverseArray(int arr[], int l, int r) {
        if (l >= r)
            return;

        swap(arr, l, r);

        reverseArray(arr, l + 1, r - 1);

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("enter array size");
        int size = obj.nextInt();

        int arr[] = new int[size];

        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        reverseArray(arr, 0, size - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
