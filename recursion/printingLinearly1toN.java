import java.util.Scanner;

public class printingLinearly1toN {
  
    public static void printNumbers(int i , int N){
        if (i > N) {
           return; 
        }

        System.out.print(i + " ");
        // i++;
        printNumbers(i+1, N);

       
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("how many elements you want to print");
        int N = obj.nextInt();

        printNumbers(1 , N);
    }
    
}
