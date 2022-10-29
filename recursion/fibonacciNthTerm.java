import java.util.Scanner;

public class fibonacciNthTerm {

    public static int printFibonacci(int N) {
        if (N <= 1)
            return N;

        int frist = printFibonacci(N - 1);
        int second = printFibonacci(N - 2);
        return frist + second;

    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter n value");
        int N = obj.nextInt();

        System.out.println(printFibonacci(N));
    }

}
