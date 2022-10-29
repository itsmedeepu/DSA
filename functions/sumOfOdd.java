import java.util.Scanner;

public class sumOfOdd {
    public static void calculateSumOfOddNo(int N) {

        int sum = 0;

        for (int i = 1; i <= N; i = i + 2) {
            sum += i;
            
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        calculateSumOfOddNo(N);
        sc.close();

    }

}
