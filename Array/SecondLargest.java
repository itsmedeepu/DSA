import java.util.*;

public class SecondLargest {

    public static void main(String[] args) {
        System.out.println("enter size");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int arr[] = new int[n];

        System.out.println("enter element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }

        int ans = print2largest(arr, n);
        System.out.println(ans);

    }

    public static int print2largest(int arr[], int n) {

        // array sort method  ........
        // Arrays.sort(arr);
        // // return arr[n-1];
        // return arr[n-2];

        // int max = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }
        // int max1 = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] > max1 && arr[i] != max) {
        //         max1 = arr[i];
        //     }
        // }
        // return max1;
  
  
  
//  int max1 = arr[0];
//  int max2 = arr[0];

//  for (int i = 0; i < arr.length; i++) {

//     if (arr[i] > max1) {

       
//         max1 = arr[i];
//         max2 = max1;

//         System.out.println(arr[i]);

        
        
//     }
    
//  }

//  return max2;



int frist = Integer.MIN_VALUE;
int second = Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] > frist) {
        second = frist;
        frist = arr[i];
        
    }

    if (arr[i] < frist && arr[i] > second) {

        second = arr[i];
        
    }
}



return second;




    }

}
