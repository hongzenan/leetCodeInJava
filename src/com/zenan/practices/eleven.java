package com.zenan.practices;

public class eleven {
    public static void main(String[] args) {
        int[] arrays = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(arrays));
    }

    private static int maxArea(int[] height) {
        int max = 0;
        int area;
        for (int i = 0; i < height.length - 1; ++i) {
            for (int j = i; j < height.length; ++j) {
                area = Math.min(height[i], height[j]) * (j - i);
                max = area > max ? area : max;
            }
        }
        return max;
    }
}
