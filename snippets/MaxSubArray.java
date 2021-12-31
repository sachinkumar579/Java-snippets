// https://leetcode.com/problems/maximum-subarray/

public class MaxSubArray {
    public static void main(String[] args) {
    int[] num = {-1,6,-3,-4,5};
        System.out.println(maxSubArray(num));
    }


    public static int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        final int length = nums.length;
        int sum = 0;

        for (int index = 0; index < length; index++) {
            sum = 0;
            for (int j = index; j < length; j++) {
                sum+= nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

}
