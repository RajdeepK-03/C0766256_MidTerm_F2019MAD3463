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
}






















