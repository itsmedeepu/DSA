import java.util.Scanner;

public class printingLinearlyNto1 {

    public static void printNumbers(int i , int N){
        if(i <1){
            return;
        }

        System.out.print(i + " ");

        printNumbers(i-1, N);
 
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of N");
        int N = obj.nextInt();

        printNumbers(N , N);

    }
    
}
