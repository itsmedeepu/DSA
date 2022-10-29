import java.util.ArrayList;

public class printingSubSequence {

    public static void SubSequenceFunction(int arr[], int index, ArrayList<Integer> ds) {

        if (index == arr.length) {
            if (ds.size() > 0) {
                System.out.println(ds);

            }

            if (ds.size() == 0) {
                System.out.println("[ ]");

            }
            return;
        }

        ds.add(arr[index]); // add to arraylist

        SubSequenceFunction(arr, index + 1, ds); // pick

        ds.remove(ds.size() - 1); // remove from arraylist

        SubSequenceFunction(arr, index + 1, ds); // not pick

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        ArrayList<Integer> ds = new ArrayList<>();

        SubSequenceFunction(arr, 0, ds);
    }
}