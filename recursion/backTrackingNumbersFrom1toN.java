import java.util.Scanner;

public class backTrackingNumbersFrom1toN {

    public static void printNumbers(int i , int N){
        if(i < 1){
            return;
        }

        printNumbers(i-1 , N);
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        System.out.println("enter the value of N");
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();

        printNumbers(N , N);
    }
    
}
