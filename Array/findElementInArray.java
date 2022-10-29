import java.util.Scanner;

public class findElementInArray {

    public static void main(String[] args) {

        int n;
        System.out.println("enter array size");
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("enter key to search");
        int key;
        key = obj.nextInt();

        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                idx = i;

                break;
            }

        }
        System.out.println(idx);
    obj.close();
    }

}
