package com.zenan.practices;

public class five {
    public static void main(String[] args) {
        String s = "aab";
        System.out.println(longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {
        if (s.length() == 1 || (s.length() == 2 && s.charAt(0) == s.charAt(1))) {
            return s;
        }
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) {
            return s.substring(0, 1);
        }
        int max = 0;
        String result = "", result2 = "";
        String tmp, tmp2;
        for (int i = 0; i < s.length() - 1; ++i) {
            tmp = longestPalindromeHelp(s, i);
            result = tmp.length() > max ? tmp : result;
            max = tmp.length() > max ? tmp.length() : max;

            tmp2 = longestPalindromeHelp2(s, i);
            result2 = tmp2.length() > max ? tmp2 : result2;
            max = tmp2.length() > max ? tmp2.length() : max;
        }
        return result.length() > result2.length() ? result : result2;
    }

    private static String longestPalindromeHelp(String s, int index) {
        int i = index, j = index;
        if (s.charAt(index) == s.charAt(index + 1)) {
            j++;
        }
        for (; i >= 0 && j < s.length();) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
                continue;
            } else {
                break;
            }
        }
        return s.substring((i + 1), (j));
    }

    private static String longestPalindromeHelp2(String s, int index) {
        int i, j;
        for (i = index, j = index; i >= 0 && j < s.length();) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
                continue;
            } else {
                break;
            }
        }
        return s.substring((i + 1), (j));
    }
}
