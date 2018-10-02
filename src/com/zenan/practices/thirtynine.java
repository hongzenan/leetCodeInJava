package com.zenan.practices;

import java.util.*;

public class thirtynine {
    public static void main(String[] args) {
        int[] nums = {10, 1, 2, 1, 6 ,7 ,5};
        List<List<Integer>> result = combinationSum(nums, 8);
        Integer[] integers = new Integer[]{2, 6};
        result.add(new ArrayList<>(Arrays.asList(integers)));
        removeDuplicate(result);
        System.out.println(result);
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }

        Arrays.sort(candidates);
        helper(candidates, 0, result, target, new ArrayList<>());
        return result;
    }

    private static void helper(int[] candidates, int indexStart, List<List<Integer>> result, int target, List<Integer> tmp) {
        if (target == 0) {
            result.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = indexStart; i < candidates.length; ++i) {
            if (target < candidates[i]) {
                return;
            }

            tmp.add(candidates[i]);
            helper(candidates, i + 1, result, target - candidates[i], tmp);
            tmp.remove(tmp.size() - 1);
        }
    }

    private static void removeDuplicate(List<List<Integer>> result) {
        Set<List<Integer>> sets = new HashSet<>();
        for (List<Integer> list : new ArrayList<>(result)) {
            if (sets.contains(list)) {
                result.remove(list);
            } else {
                sets.add(list);
            }
        }
    }
}
