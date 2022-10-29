import java.util.Scanner;

public class smallestOfThree {

    public static void calculateSmallestNo(int n1, int n2, int n3) {

        if (n1 < n2 && n1 < n3)

        {
            System.out.println(n1 + " is smallest number");

        } else if ( n2 < n1 && n2 < n3) {
            System.out.println(n2 + " is smallest number");

        }

        else if (n1==n2 && n2==n3) {
            System.out.println( "all are equal");

        }



        else {

            System.out.println(n3 + " is smallest number");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any three numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        calculateSmallestNo(n1, n2, n3);
        sc.close();
    }

}
