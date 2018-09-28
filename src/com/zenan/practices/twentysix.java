package com.zenan.practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class twentysix {
    public static void main(String[] args) {

    }

    private static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int index = 0;
        int tmp = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            if (tmp != nums[i]) {
                nums[++index] = nums[i];
                tmp = nums[i];
            }
        }
        return ++index;
    }
}
