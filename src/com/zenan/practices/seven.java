package com.zenan.practices;

// 2147483648
public class seven {
    public static void main(String[] args) {
        int i = -2147483648;
        System.out.println(reverse(i));
    }

    private static int reverse(int x) {
        String str = String.valueOf(x);
        boolean flagFu = false;
        if (str.contains("-")) {
            str = str.substring(1, str.length());
            flagFu = true;
        }
        StringBuilder num = new StringBuilder().append(str);
        num.reverse();
        double d = Double.parseDouble(num.toString());
        if (flagFu == false && d > 2147483647) {
            return 0;
        } else if (flagFu == true && d - 1 > 2147483647) {
            return 0;
        } else {
            return flagFu == true ? (int) (-1 * d) : (int) d;
        }
    }
}
