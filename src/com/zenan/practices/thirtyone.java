package com.zenan.practices;

import java.util.Arrays;

public class thirtyone {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1};
        nextPermutation(nums);
        for (int i : nums) {
            System.out.print(i + ", ");
        }
    }

    private static void nextPermutation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int tmp;
        for (int i = nums.length - 1; i > 0; --i) {
            if (nums[i - 1] < nums[i]) {
                for (int index = nums.length - 1; index >= i; --index) {
                    if (nums[i - 1] < nums[index]) {
                        tmp = nums[i - 1];
                        nums[i - 1] = nums[index];
                        nums[index] = tmp;
                        reverse(nums, i, nums.length - 1);
                        return;
                    }
                }
            }
        }
        reverse(nums, 0, nums.length - 1);
    }

    private static void reverse(int[] nums, int begin, int end) {
        int tmp;
        for (int i = begin, j = end; i < j; ++i, --j) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
