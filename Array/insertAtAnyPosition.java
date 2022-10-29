import java.util.*;

public class insertAtAnyPosition {

    public static void main(String[] args) {

        int[] Numbers = new int[50];

        Scanner obj = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = obj.nextInt();

        System.out.println("enter elements");
        for (int i = 0; i < size; i++) {

            Numbers[i] = obj.nextInt();

        }

        System.out.println("enter the element to be inserted:");
        int element = obj.nextInt();

        System.out.println("enter the position to insert:");
        int position = obj.nextInt();

        if (position <= 0 || position > size + 1) {

            System.out.println("invalid position");

        }

        else {
            for (int i = size - 1; i >= position - 1; i--) {
                Numbers[i + 1] = Numbers[i];

            }

            Numbers[position - 1] = element;
            size++;

            System.out.println("new array elements");

            for (int i = 0; i < size; i++) {

                System.out.print(Numbers[i] + " ");

            }
        }

        obj.close();
    }

}
