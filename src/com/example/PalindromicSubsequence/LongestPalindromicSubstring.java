package com.example.PalindromicSubsequence;

import java.util.Arrays;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.findLPSLength("abdbaca"));
        System.out.println(lps.findLPSLength("cddpd"));
        System.out.println(lps.findLPSLength("pqr"));
    }

    private int findLPSLength(String s) {
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
            int x = lps(s, n, left+1, right-1, memo);
            if(right-left-1 == x) {
                x+=2;
                memo[left][right] = x;
                return memo[left][right];
            }
        }
        int one = lps(s, n, left+1, right, memo);
        int two = lps(s, n, left, right-1, memo);

        memo[left][right] = Math.max(one, two);

        return memo[left][right];
    }


}
