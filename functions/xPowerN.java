import java.util.Scanner;
public class xPowerN {
 public static void calculatePower(int x, int p) { //function declartion

        int result = 1;
        for (int i = 1; i <= p; i++) {

            result = result * x;

        }
        System.out.println(x + " power " + p + " is " + result);
        return;
     }
       public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter number X");
        int x = obj.nextInt();
        System.out.println("enter power p");
        int p = obj.nextInt();
         calculatePower(x, p); //function call
         obj.close();

    }
}
