import java.util.Scanner;

public class sumOfTwoArr {

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

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d += arr1[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }

            c = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;

        }

        if (c != 0) {
            System.out.print(c);
        }
        for (int val : sum) {
            System.out.print(val);
        }
      obj.close();
    }

}
