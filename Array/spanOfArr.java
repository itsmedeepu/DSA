import java.util.Scanner;
public class spanOfArr {

    public static void main(String[] args) {
       
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < arr.length ; i++ )
        {
            arr[i] = obj.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] > max){
            max = arr[i];
            }

            if(arr[i] < min){
            min = arr[i];
            }
        }
       
        

        int span = max - min;
        System.out.print(span);

     obj.close();

    }
    
}
