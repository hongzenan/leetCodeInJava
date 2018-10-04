package com.zenan.practices;

public class fourtyfive {
    public static void main(String[] args) {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0};
        System.out.println(jump(nums));
    }

    private static int jump(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return 0;
        }

        int index = 0;
        int sum = 0;
        while (index < nums.length) {
            if (nums[index] >= (nums.length - 1 - index)) {
                return ++sum;
            } else {
                int maxIndex = index + 1;
                for (int i = index + 1; i <= index + nums[index]; ++i) {
                    if (nums[i] + i >= nums[maxIndex] + maxIndex) {
                        maxIndex = i;
                    }
                }
                index = maxIndex;
                sum += 1;
            }
        }

        return sum;
    }
}
