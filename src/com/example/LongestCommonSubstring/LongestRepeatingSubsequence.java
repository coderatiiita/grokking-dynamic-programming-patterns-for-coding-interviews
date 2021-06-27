package com.example.LongestCommonSubstring;

public class LongestRepeatingSubsequence {

    int findLRSLength(String s) {
        return _findLRSLength(s, 0, 0);
    }

    int _findLRSLength(String s, int i, int j) {

        if(i == s.length() || j == s.length()) {
            return 0;
        }

        if(i != j && s.charAt(i) == s.charAt(j)) {
            return _findLRSLength(s, i+1, j+1) + 1;
        }

        return Math.max(_findLRSLength(s, i+1, j), _findLRSLength(s, i, j+1));
    }

    public static void main(String[] args) {
        LongestRepeatingSubsequence lrs = new LongestRepeatingSubsequence();
        System.out.println(lrs.findLRSLength("tomorrow"));
        System.out.println(lrs.findLRSLength("aabdbcec"));
        System.out.println(lrs.findLRSLength("fmff"));
    }

}
