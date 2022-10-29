import java.util.Scanner;

public class printTable {

    public static void Table(int n){

        for(int i = 1 ; i <= 20 ; i++){
          System.out.println(n+" * " + i + " = " + n*i);
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Table(n);
        sc.close();
    }
    
}
