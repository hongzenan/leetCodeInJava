package com.zenan.practices;

import java.util.Arrays;

public class fourtyone {
    public static void main(String[] args) {

    }

    private static int findMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0 && (i > 0 && nums[i] != nums[i - 1])) {
                nums[index++] = nums[i];
            }
        }
        for (int i = 0; i < index; ++i) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return index + 1;
    }
}
