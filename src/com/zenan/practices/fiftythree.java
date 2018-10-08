package com.zenan.practices;

public class fiftythree {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int tmp = 0;
        int max = nums[0];
        for (int num : nums) {
            tmp += num;
            if (tmp > max) {
                max = tmp;
            }
            if (tmp < 0) {
                tmp = 0;
            }
        }

        return max;
    }
}
