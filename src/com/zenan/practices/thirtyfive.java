package com.zenan.practices;

public class thirtyfive {
    public static void main(String[] args) {

    }

    private static int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < target) {
                continue;
            }
            return i;
        }
        return nums.length;
    }
}
