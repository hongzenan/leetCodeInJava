package com.zenan.practices;

public class fourtyeight {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for (int[] nums : matrix) {
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static  void rotate(int[][] matrix) {
        int tmp;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = i + 1; j < matrix[0].length; ++j) {
                tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        for (int[] nums : matrix) {
            reverse(nums);
        }
    }

    private static void reverse(int[] nums) {
        int tmp;
        int length = nums.length;
        for (int i = 0; i < length / 2; ++i) {
            tmp = nums[i];
            nums[i] = nums[length - 1 - i];
            nums[length - 1 - i] = tmp;
        }
    }
}
