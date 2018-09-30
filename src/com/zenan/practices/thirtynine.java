package com.zenan.practices;

import java.util.ArrayList;
import java.util.List;

public class thirtynine {
    public static void main(String[] args) {

    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }

        int tmp;
        for (int i = 0; i < candidates.length; ++i) {
            tmp = target;
            while (tmp > 0) {
//                if ()
            }
        }
        return result;
    }
}
