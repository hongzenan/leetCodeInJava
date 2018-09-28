package com.zenan.practices;

public class nine {
    public static void main(String[] args) {
        int i = 123;
        System.out.println(isPalindrome(i));
    }

    private static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        if (str.contains("-")) {
            return false;
        }
        StringBuilder sb = new StringBuilder().append(str);
        sb.reverse();
        double result = Double.parseDouble(sb.toString());
        if (result <= 2147483647 && (int)(result - x) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
