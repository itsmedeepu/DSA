import java.util.ArrayList;

public class subSequenceOfSumK {

    public static void subSequenceOfSum(int index, int arr[], ArrayList<Integer> ds, int s, int sum) {

        if (index == arr.length) {
            if (s == sum) {
                System.out.println(ds);

            }
            return;
        }

        ds.add(arr[index]);

        s += arr[index];

        subSequenceOfSum(index + 1, arr, ds, s, sum);

        ds.remove(ds.size() - 1);
        s -= arr[index];

        subSequenceOfSum(index + 1, arr, ds, s, sum);

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 1 };
        // int n = 3;
        int sum = 2;

        ArrayList<Integer> ds = new ArrayList<>();

        subSequenceOfSum(0, arr, ds, 0, sum);
    }

}
