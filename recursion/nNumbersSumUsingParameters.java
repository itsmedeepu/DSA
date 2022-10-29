import java.util.Scanner;

public class nNumbersSumUsingParameters {

    public static void sumofN(int N , int sum)
    {
        if(N < 1){
            System.out.println(sum);
            return;
        }

        sumofN(N-1 , sum+N);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the value of N");
        int N = obj.nextInt();

        sumofN(N , 0);
        

    }
    
}
