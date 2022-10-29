import java.util.Scanner;

public class add2No {

    public static void printSumOfTwoNo(int a, int b) {
        int sum = a + b;
        System.out.println("sum of "+a+" and "+b+ " is " + sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printSumOfTwoNo(a, b);
       
        sc.close();
    }

}
