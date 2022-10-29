import java.util.*;
public class powerOfNo {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        System.out.println("enter number");
      int n = sc.nextInt();
      System.out.println("enter power");
      int p = sc.nextInt();

      int result=1;
      for(int i = 1 ; i <= p ; i++)
      {
          result = n*result;
      }
      System.out.println(result);
      sc.close();

    }
    
}
