import java.util.Scanner;

public class circumstanceOfCircle {

    public static void calculateCircumtance(int r) {

        // c= 2pir
        double c = 2 * 3.141 * r;
        System.out.println("circumtance of circle is " + c);

    }

    public static void main(String[] args) {
        System.out.println("enter raduis of circle");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        calculateCircumtance(r);
        sc.close();
    }
}
