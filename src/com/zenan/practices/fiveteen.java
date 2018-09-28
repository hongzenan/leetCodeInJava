package com.zenan.practices;

import java.util.*;

public class fiveteen {
    public static void main(String[] args) {
        List<List<Integer>> list;
        int[] nums = {0, 0, 0};
        list = threeSum(nums);
        for (List<Integer> list1 : list) {
            for (Integer i : list1) {
                System.out.print(i + ",");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        int target, left, right;
        for (int i = 0; i < nums.length - 2; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            target = -nums[i];
            left = i + 1;
            right = nums.length - 1;
            twoSum(nums, left, right, target, result);
        }
        return result;
    }

    private static void twoSum(int[] nums, int left, int right, int target, List<List<Integer>> result) {
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                List<Integer> list = new ArrayList<>();
                list.add(-target);
                list.add(nums[left]);
                list.add(nums[right]);
                result.add(list);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
