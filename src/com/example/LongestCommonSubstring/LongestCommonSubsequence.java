package com.example.LongestCommonSubstring;

public class LongestCommonSubsequence {

    public int findLCSLength(String s1, String s2) {
        // TODO: Write your code here
        return lcs(s1, s1.length()-1, s2, s2.length()-1);
    }

    private int lcs(String s1, int i, String s2, int j) {

        if(i<0 || j<0)  return 0;

        if(s1.charAt(i) == s2.charAt(j)) {
            return lcs(s1, i-1, s2, j-1) + 1;
        }

        int a = lcs(s1, i-1, s2, j);
        int b = lcs(s1, i, s2, j-1);

        return Math.max(a, b);
    }

    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println(lcs.findLCSLength("abdca", "cbda"));
        System.out.println(lcs.findLCSLength("passport", "ppsspt"));
    }

}
