import java.util.Scanner;

public class checkNoIsPrime {

    public static void checkPrime(int No  ) {

        int count = 0;
        for (int i = 1; i <= No; i++) {
            if (No % i == 0) {

                count++;

            }

           
        }
        if (count == 2) {
            System.out.println(No + " is prime Number");
        } else {
            System.out.println(No + " is not prime Number");
        }
        return;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int No = sc.nextInt();

        checkPrime(No);

        sc.close();
    }

}
