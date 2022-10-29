import java.util.Scanner;

public class deleteLast {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("array size ?");
        int size = obj.nextInt();

        int[] arr = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int newsize = arr.length - 1;
        System.out.println("\nnew array after deleteing last element");
        for (int i = 0; i < newsize; i++) {
            System.out.print(arr[i] + " ");
        }


    obj.close();
    }

}
