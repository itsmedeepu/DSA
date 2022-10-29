import java.util.Scanner;

public class insertAtFrist {

    public static void main(String[] args) {

        int array[] = new int[50];

        Scanner obj = new Scanner(System.in);

        System.out.println("enter the array size");
        int size = obj.nextInt();

        System.out.println("enter array elements");
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }

        System.out.println("enter the element you want to insert at frist ");
        int element = obj.nextInt();

        for (int i = size - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = element;
        size++;

        System.out.println("array elements after insertion");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

}