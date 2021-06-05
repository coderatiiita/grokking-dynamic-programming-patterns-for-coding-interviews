package com.example.PalindromicSubsequence;

import java.util.Arrays;

public class LongestPalindromicSubsequence {

    public int findLPSLength(String s) {
        int[][] memo = new int[s.length()+1][s.length()+1];
        Arrays.stream(memo).forEach(row -> {
            Arrays.fill(row, -1);
        });

        return lps(s, s.length(), 0, s.length()-1, memo);
    }

    int lps(String s, int n, int left, int right, int[][] memo) {
        if(right<left)  return 0;
        if(right==left) {
            memo[left][right] = 1;
            return 1;
        }
        if(memo[left][right] != -1) {
            return memo[left][right];
        }
        if(s.charAt(left) == s.charAt(right)) {
            memo[left][right] = lps(s, n, left+1, right-1, memo)+2;
            return memo[left][right];
        }
        int one = lps(s, n, left+1, right, memo);
        int two = lps(s, n, left, right-1, memo);

        memo[left][right] = Math.max(one, two);

        return memo[left][right];
    }

    public static void main(String[] args) {
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        System.out.println(lps.findLPSLength("abdbca"));
        System.out.println(lps.findLPSLength("cddpd"));
        System.out.println(lps.findLPSLength("pqr"));
    }
}
