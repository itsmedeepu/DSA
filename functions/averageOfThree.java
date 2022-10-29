import java.util.Scanner;

public class averageOfThree {

    public static void printAverage(int n1 , int n2 , int n3){
         float average = (n1+n2+n3)/3;
         System.out.println(average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        printAverage(n1, n2, n3);
        sc.close();
    
    
    }
    
}
