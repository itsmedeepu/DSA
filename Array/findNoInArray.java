import java.util.*;

public class findNoInArray {

    public static void main(String[] args) {

        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("enter element to be searched");
        int search = sc.nextInt();
        
        // output
        for (int i = 0; i < size; i++) {
            if (search == numbers[i]) {

                System.out.println("element is at index : " + i + " and postion " + (i+1));
            }
        }
      sc.close();
    }

}
