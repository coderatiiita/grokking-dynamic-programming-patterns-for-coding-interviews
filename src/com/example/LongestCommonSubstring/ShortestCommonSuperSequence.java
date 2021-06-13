package com.example.LongestCommonSubstring;

public class ShortestCommonSuperSequence {

    public int findSCSLength(String s1, String s2) {
        // TODO: Write your code here
        int l = lcs(s1, s1.length()-1, s2, s2.length()-1);
        return s1.length() - l + s2.length() -l +l;
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
        ShortestCommonSuperSequence scs = new ShortestCommonSuperSequence();
        System.out.println(scs.findSCSLength("abcf", "bdcf"));
        System.out.println(scs.findSCSLength("dynamic", "programming"));
    }

}
