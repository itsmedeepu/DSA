import java.util.*;

public class evenOrNot {

    public static void checkEven(int No){

        if(No%2 == 0)
        {
            System.out.println(No + " is a even number");
        }
        else
        {
            System.out.println(No + " is not a even number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int No = sc.nextInt();

        checkEven(No);
        sc.close();

    }
    
}
