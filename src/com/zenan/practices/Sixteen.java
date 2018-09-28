package com.zenan.practices;

import java.util.Arrays;

public class Sixteen {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int result = threeSumClosest(nums, -100);
        System.out.println(result);
    }

    private static int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        int left, right;
        for (int i = 0; i < nums.length - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            left = i + 1;
            right = nums.length - 1;
            result = (twoSum(nums, left, right, target - nums[i]) + nums[i]) > result ? result : (twoSum(nums, left, right, target - nums[i]) + nums[i]);
        }
        return result;
    }

    private static int twoSum(int[] nums, int left, int right, int target) {
        int closest = Integer.MAX_VALUE;
        while (left < right) {
            if (target - nums[left] - nums[right] < 0) {
                if (Math.abs(target - nums[left] - nums[right]) > Math.abs(closest)) {
                    right--;
                } else {
                    left++;
                }
            } else {
               if (Math.abs(target - nums[left] - nums[right]) > Math.abs(closest)) {
                   left++;
               } else {
                   right--;
               }
            }
            closest = Math.abs(target - nums[left] - nums[right]) < Math.abs(closest) ? nums[left] + nums[right] : closest;

            while (left < right && nums[left] == nums[left - 1]) {
                left++;
            }
            while (left < right && right < nums.length - 1 && nums[right] == nums[right + 1]) {
                right--;
            }
        }
        return closest;
    }
}
