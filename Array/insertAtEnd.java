import java.util.Scanner;

public class insertAtEnd {

    public static void main(String[] args) {

        int arr[] = new int[50];
        Scanner obj = new Scanner(System.in);
        System.out.println("enter array size");
        int size = obj.nextInt();

        System.out.println("enter array elements ");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();

        }

        System.out.println("enter the element you want to insert at last ");
        int element = obj.nextInt();

        arr[size] = element;
        size++;

        System.out.println("array elements after insertion");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
