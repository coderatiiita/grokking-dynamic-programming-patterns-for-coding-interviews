package com.example.LongestCommonSubstring;

public class LongestCommonSubstring {

    public int findLCSLength(String s1, String s2) {
        // TODO: Write your code here
        return lcs(s1, s1.length()-1, s2, s2.length()-1, 0);
    }

    private int lcs(String s1, int i, String s2, int j, int count) {

        if(i<0 || j<0)  return count;

        if(s1.charAt(i) == s2.charAt(j)) {
            count = lcs(s1, i-1, s2, j-1, count+1);
        }

        int a = lcs(s1, i-1, s2, j, 0);
        int b = lcs(s1, i, s2, j-1, 0);

        return Math.max(count, Math.max(b, a));
    }

    public static void main(String[] args) {
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        System.out.println(lcs.findLCSLength("abdca", "cbda"));
        System.out.println(lcs.findLCSLength("passport", "ppsspt"));
    }

}
