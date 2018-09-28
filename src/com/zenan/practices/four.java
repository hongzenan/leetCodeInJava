package com.zenan.practices;

public class four {
    public static void main(String[] args) {
        int[] a = new int[]{};
        int[] b = new int[]{2, 3};
        System.out.println(findMedionSortedArrays(a, b));
    }

    public static double findMedionSortedArrays(int[] nums1, int[] nums2) {
        int[] sum = new int[nums1.length + nums2.length];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < sum.length; ++i) {
            if (index1 == nums1.length) {
                sum[i] = nums2[index2];
                index2++;
            } else if (index2 == nums2.length) {
                sum[i] = nums1[index1];
                index1++;
            } else if (index1 < nums1.length && nums1[index1] < nums2[index2]) {
                sum[i] = nums1[index1];
                index1++;
            } else {
                sum[i] = nums2[index2];
                index2++;
            }
        }

        double result = (sum[(int) ((sum.length - 1) / 2)] + sum[(int) (sum.length / 2)] ) / 2.0;
        return result;
    }
}
