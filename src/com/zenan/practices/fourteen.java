package com.zenan.practices;

public class fourteen {
    public static void main(String[] args) {
        String[] string = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix2(string));
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            minLength = minLength > str.length() ? str.length() : minLength;
        }
        for (int i = 0; i < minLength; ++i) {
            for (int j = 0; j < strs.length - 1; ++j) {
                if (!strs[j].substring(i, i + 1).equals(strs[j + 1].substring(i, i + 1))) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLength);
    }

    private static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.length() == 0) {
                return "";
            }
        }
        return prefix;
    }
}
