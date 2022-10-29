import java.util.Scanner;

public class deletefrist {
    public static void main(String[] args) {

        System.out.println("array size ?");
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        int[] arr = new int[size];

        // input
        System.out.println("array elements ?");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        // output
        System.out.println("original array elements");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
      
        int[] newArr = new int[size];
        for (int i = 1; i < newArr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        System.out.println("\nnew array elements after deleteing frist element");
        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.print(newArr[i] + " ");

        }
        obj.close();
    }

}
