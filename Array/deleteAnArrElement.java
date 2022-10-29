import java.util.Scanner;

public class deleteAnArrElement {

    public static void main(String[] args) {

        int[] array = new int[100];
        int size, i, pos;

        System.out.println("enter size of the array(MAX 100)");
        try (Scanner obj = new Scanner(System.in)) {
            size = obj.nextInt();

            System.out.println("enter array elements");
            for (i = 0; i < size; i++) {

                array[i] = obj.nextInt();

            }

            System.out.println("enter position to delete element ");
            pos = obj.nextInt();

            if (pos < 0 || pos > size) {
                System.out.println("invalid position");

            }

            else {

                for (i = pos - 1; i <= size; i++) {
                    array[i] = array[i + 1];

                }
                size--;

                System.out.println("array after deleting an elements");
                for (i = 0; i < size; i++) {
                    System.out.print(array[i] + " ");
                }

            }

        }

    }

}
