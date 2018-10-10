package com.zenan.practices;

import java.util.ArrayList;
import java.util.List;

public class fiftyfour {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }
        // right down left up
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        int direction = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < matrix.length * matrix[0].length; ++i) {
            list.add(matrix[x][y]);
            matrix[x][y] = 0;
            x = x + dx[direction];
            y = y + dy[direction];

            if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || matrix[x][y] == 0) {
                x = x - dx[direction];
                y = y - dy[direction];
                direction = (direction + 1) % 4;
                x = x + dx[direction];
                y = y + dy[direction];
            }
        }
        return list;
    }
}
