// leetcode 1480

public class runningSum {

    public static int[] runningarr(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            nums[i] = nums[i] + nums[i - 1];
            // System.out.println(nums[i]);
        }
        return nums;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4 };

        runningarr(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}
