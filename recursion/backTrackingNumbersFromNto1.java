import java.util.Scanner;

public class backTrackingNumbersFromNto1 {

    public static void printNumbers(int i, int N) {
        if (N < i) {
            return;

        }

        printNumbers(i + 1, N);
        System.out.print(i + " ");

    }

    public static void main(String[] args) {
        System.out.println("enter the value of N");
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();

        printNumbers(1, N);
    }

}
