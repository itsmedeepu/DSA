  import java.util.*;
public class runTimeArray 
{


    public static void main(String[] args) {
    
        System.out.println("enter the array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
         int numbers[] = new int[size];

         System.out.println("enter  " + size + " array elements");
         //input
         for(int i =0 ; i < size ; i++)
         {
             numbers[i] = sc.nextInt();
         }
         System.out.println("array elements are:");
        //  output
         for(int i =0 ; i < size ; i++)
         {
            System.out.println(numbers[i]);  
         }
       sc.close();
    }
    
}
