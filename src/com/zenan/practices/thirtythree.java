package com.zenan.practices;

public class thirtythree {
    public static void main(String[] args) {

    }

    private static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0, end = nums.length;
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[start] < nums[mid]) {
                if (target > nums[start] && target < nums[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                if (target > nums[mid] && target < nums[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        } // while

        if (target == nums[start]) {
            return start;
        }
        if (target == nums[end]) {
            return end;
        }
        return -1;
    }
}
