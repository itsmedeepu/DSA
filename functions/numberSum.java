import java.util.Scanner;

public class numberSum {

    public static int countSum(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("enter any number");
        int num;
        Scanner obj = new Scanner(System.in);
        num = obj.nextInt();

        System.out.println("sum of the digits is " + countSum(num));

    }

}