import java.util.Scanner;

public class diffOfTwoArr {

    public static void main(String[] args) {

        int n1, n2;
        Scanner obj = new Scanner(System.in);

        System.out.println(" enter array 1 size");
        n1 = obj.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = obj.nextInt();
        }

        System.out.println(" enter array 2 size");
        n2 = obj.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = obj.nextInt();
        }

        int[] diff = new int[n2];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;

        while (k >= 0) {
            int d = 0;
            int arr1Val = i >= 0 ? arr1[i] : 0 ;
            if (arr2[j] + c >= arr1Val) {
                d = arr2[j] + c - arr1Val;
                c = 0;
            } else {

                d = arr2[j] + c + 10 - arr1Val;
                c = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;

        }

        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }

            while (idx < diff.length) {
                System.out.println(diff[idx]);
                idx++;
            }
        
        obj.close();
    }

}
