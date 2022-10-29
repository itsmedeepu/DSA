import java.util.Scanner;

public class greatestOfTwo {

    public static void  calculateBigNo(int n1 , int n2){
        if(n1>n2){
        System.out.println(n1 + " is greatest number");
        }
       else
       {
        System.out.println(n2 + " is greatest number");
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        calculateBigNo(n1, n2);
        sc.close();
    

    }
    
}
