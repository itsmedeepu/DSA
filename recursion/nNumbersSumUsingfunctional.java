import java.util.Scanner;

public class nNumbersSumUsingfunctional {

    public static int sumOfN(int N) {
        if (N == 0)
            return 0;

        return N + sumOfN(N - 1);

    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of N");
        int N = obj.nextInt();

        System.out.println(sumOfN(N));
    }

}
