import java.util.Scanner;

public class factorialOfNo {

    public static void printFactorial(int number) {

        if (number < 0) {
            System.out.println("invalid number");
            return;
        }
        int fact = 1;
        for (int i = number; i >= 1; i--) {
            fact = fact * i;

        }
        System.out.println(fact);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        printFactorial(number);
        sc.close();
    }

}
