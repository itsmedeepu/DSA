 import java.util.*;

public class bubbleSort1 {
    public static void main(String[] args) {

        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        // array element input
        System.out.println("enter array element");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        // unsorted array output
        System.out.println("unsorted array is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nsorted array is");
        // bubble sort
        for(int i = 0; i < array.length-1; i++) {
            //  n-1 paras and innerloop compared everytime with n-1 times
            for(int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

          sc.close(); 

    }

}