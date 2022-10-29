import java.util.Scanner;

public class factorialOfN {

    public static int factOfN(int N){

        if(N == 0)
        return 1;
 
        return N* factOfN(N-1);
         
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of N");
        int N = obj.nextInt();

       System.out.println( factOfN( N));
    }
}