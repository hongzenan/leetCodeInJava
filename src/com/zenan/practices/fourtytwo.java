package com.zenan.practices;

import java.util.ArrayDeque;
import java.util.Deque;

public class fourtytwo {
    public static void main(String[] args) {
        int[] nums = {5, 2, 1, 2, 1, 5};
        System.out.println(trapW(nums));
    }

    private static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int result = 0;
        if (left >= right) {
            return result;
        }
        int leftHeight = height[left], rightHeight = height[right];

        while (left < right) {
            if (leftHeight < rightHeight) {
                left++;
                if (leftHeight > height[left]) {
                    result += leftHeight - height[left];
                } else {
                    leftHeight = height[left];
                }
            } else {
                right--;
                if (rightHeight > height[right]) {
                    result += rightHeight - height[right];
                } else {
                    rightHeight = height[right];
                }
            }
        }
        return result;
    }

    private static int trapWater(int[] heights) {
        int water = 0;
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < heights.length; i++) {
            while (!queue.isEmpty() && heights[i] > heights[queue.peekLast()]) {
                int j = queue.pollLast();
                if (!queue.isEmpty()) {
                    int w = i - queue.peekLast() - 1;
                    water += w * (Math.min(heights[i], heights[queue.peekLast()]) - heights[j]);
                }
            }
            queue.offer(i);
        }
        return water;
    }

    public static int trapRainWater(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }

        int[] maxHeights = new int[heights.length + 1];
        maxHeights[0] = 0;
        for (int i = 0; i < heights.length; i++) {
            maxHeights[i + 1] = Math.max(maxHeights[i], heights[i]);
        }

        int max = 0, area = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            area += Math.min(max, maxHeights[i]) > heights[i]
                    ? Math.min(max, maxHeights[i]) - heights[i]
                    : 0;
            max = Math.max(max, heights[i]);
        }

        return area;
    }

    private static int trapW(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int[] maxHeights = new int[height.length + 1];
        int[] maxRights = new int[height.length];
        int result = 0;
        maxHeights[0] = 0;
        maxRights[height.length - 1] = 0;
        for (int i = 0; i < height.length; ++i) {
            maxHeights[i + 1] = Math.max(maxHeights[i], height[i]);
        }
        for (int i = height.length - 1; i > 0; --i) {
            maxRights[i - 1] = Math.max(maxRights[i], height[i]);
        }
        for (int i = height.length - 1; i >= 0; --i) {
            result += Math.min(maxHeights[i], maxRights[i]) > height[i] ?
                    Math.min(maxHeights[i], maxRights[i]) - height[i] : 0;
        }
        return result;
    }
}
