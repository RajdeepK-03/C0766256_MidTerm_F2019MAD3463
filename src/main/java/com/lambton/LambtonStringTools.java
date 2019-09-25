package com.lambton;

public class LambtonStringTools {

    //// question 1:

    public String reverse(String string) {
        StringBuilder rev = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            rev.append(string.charAt(i));
        }
        return rev.toString();
    }

    // question 2: binary string

    public int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryMultiplier = 1;
        for (char c : reverse(binary).toCharArray()) {
            if (c == '1') {
                decimal += binaryMultiplier;
            } else if (c == '0') {
            } else {
                return -1;
            }
            binaryMultiplier *= 2;
        }
        return decimal;
    }
}

























