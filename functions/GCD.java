import java.util.Scanner;
public class GCD {
public static void calculateGCD(int n1, int n2) {
    while (n1 != n2) {
            if (n1 > n2) {
                  n1 = n1 - n2;
                
                } else {
                n2 = n2 - n1;
              }
              }
        System.out.println("GCD is " + n2);
        return;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter number 1");
        int n1 = obj.nextInt();
        System.out.println("enter number 2");
        int n2 = obj.nextInt();
        calculateGCD(n1, n2);
    }

}



