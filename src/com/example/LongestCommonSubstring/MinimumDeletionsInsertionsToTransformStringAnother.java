package com.example.LongestCommonSubstring;

public class MinimumDeletionsInsertionsToTransformStringAnother {

    public void findMDI(String s1, String s2) {
        // TODO: Write your code here
        int c1 = lcs(s1, s1.length()-1, s2, s2.length()-1);
        System.out.println("Minimum deletions needed: " + (s1.length() - c1));
        System.out.println("Minimum insertions needed: " + (s2.length() - c1));
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
        MinimumDeletionsInsertionsToTransformStringAnother mdi = new MinimumDeletionsInsertionsToTransformStringAnother();
        mdi.findMDI("abc", "fbc");
        mdi.findMDI("abdca", "cbda");
        mdi.findMDI("passport", "ppsspt");
    }
}
