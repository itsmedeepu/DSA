import java.util.Scanner;

public class fact {

    public static void factNo(int n)
    {
        int a=0,b=1,c;
        for(int i = 1 ; i<= n ; i++)
        {
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;
        }
        return;
    }
    public static void main(String[] args) {
         Scanner obj = new Scanner(System.in);
        int n =  obj.nextInt();

        factNo(n);
        
    }
    
}
