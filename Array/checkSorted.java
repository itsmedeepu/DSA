import java.util.*;
public class checkSorted {

    public static void main(String[] args) {

        System.out.println("enter size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
         int numbers[] = new int[size];

        //  input
        for(int i = 0 ; i < size ; i++)
        {
            numbers[i] = sc.nextInt();
        }
        
        boolean isAscending  = true;

        for(int i = 0; i<numbers.length-1 ; i++)
        {
            if(numbers[i] > numbers[i+1])
            {
                isAscending  = false;
            }
        }

        if(isAscending)
        {
            System.out.println("array is in sorted order");
        }
        else
        {
            System.out.println("array is not in sorted order");
        }

        sc.close(); 
    }
    
}
