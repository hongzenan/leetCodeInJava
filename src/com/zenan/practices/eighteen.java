package com.zenan.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class eighteen {
    public static void main(String[] args) {
        int[] nums = {-1,-5,-5,-3,2,5,0,4}; // -5 -5 -3 -1 0 2 4 5
        for (List<Integer> list : fourSum2(nums, 0)) {
            for (Integer integer : list) {
                System.out.print(integer + ", ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);
        int begin, end;
        for (int i = 0; i < nums.length - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            begin = i + 1;

            List<List<Integer>> lists;
            lists = threeSum(nums, begin, target - nums[i]);
            if (lists.size() != 0) {
                for (List<Integer> integers : lists) {
                    integers.add(nums[i]);
                    result.add(integers);
                }
            }
        }
        return result;
    }

    private static List<List<Integer>> threeSum(int[] nums, int begin, int last) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        int target, left, right;
        for (int i = begin; i < nums.length - 2; ++i) {
            if (i > begin && nums[i] == nums[i - 1]) {
                continue;
            }

            target = last - nums[i];
            left = i + 1;
            right = nums.length - 1;
            twoSum(nums, left, right, target, result, nums[i]);
        }
        return result;
    }

    private static void twoSum(int[] nums, int left, int right, int target, List<List<Integer>> result, int me) {
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                List<Integer> list = new ArrayList<>();
                list.add(me);
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

    private static List<List<Integer>> fourSum2(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }

        Arrays.sort(nums);
        int left, right, sum;
        for (int i = 0; i < nums.length - 3; ++i) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; ++j) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                left = j + 1;
                right = nums.length - 1;
                while (left < right) {
                    sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right])));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
