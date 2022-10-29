import java.util.Scanner;

public class voting {
    public static void checkVoteEligbilty(int age){
        if(age>=18){
            System.out.println("you are eligible for voting ");
        }
        else
        {
            System.out.println("you are not eligible for voting ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        checkVoteEligbilty(age);

      
        sc.close();
    }
    
}
