import java.util.Scanner;

public class typeOfNumbers {

    public static void typeNo() {

        System.out.println("how many numbers you want to enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count_p = 0;
        int count_n = 0;
        int count_z = 0;

        int arr[] = new int[n];

        // input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                count_p++;

            }

            else if (arr[i] < 0) {
                count_n++;
            }

            else {

                count_z++;

            }

        }

        System.out.println("postive numbers:  " + count_p);
        System.out.println("negative numbers: " + count_n);
        System.out.println("zero numbers:     " + count_z);

          sc.close();
    }

    public static void main(String[] args) {

        typeNo();

        
      

    }

}
