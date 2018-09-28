package com.zenan.practices;

public class eight {
    public static void main(String[] args) {
        int a = myAtoi("+0 123");
        System.out.println(a);
    }

    public static int myAtoi(String str) {
        if ("".equals(str)) {
            return 0;
        }
        String nums = "1234567890";
        String result = "";
        for (char c : str.toCharArray()) {
            if (c == ' ' && result.length() == 0) {
                continue;
            } else if (c == ' ' && result.length() != 0) {
                break;
            }
            if ((c == '+' || c == '-') && "".equals(result)) {
                result += c;
                continue;
            }
            if (!nums.contains(String.valueOf(c))) {
                break;
            } else {
                result += c;
            }
        }
        String tmp = "";
        if (result.contains("+") || result.contains("-")) {
            for (char a : result.toCharArray()) {
                if (a == '0' && tmp.length() == 1) {
                    continue;
                } else {
                    tmp += a;
                }
            }
        } else {
            for (char a : result.toCharArray()) {
                if (a == '0' && "".equals(tmp)) {
                    continue;
                } else {
                    tmp += a;
                }
            }
        }
        result = tmp;
        if ("+".equals(result) || "-".equals(result) || "".equals(result)) {
            return 0;
        }
        if (result.length() <= 11) {
            Long l = Long.parseLong(result);
            if (l > 2147483647) {
                return 2147483647;
            } else if (l < -2147483648) {
                return -2147483648;
            } else {
                return Integer.parseInt(result);
            }
        } else {
            return result.contains("-") ? -2147483648 : 2147483647;
        }
    }
}
