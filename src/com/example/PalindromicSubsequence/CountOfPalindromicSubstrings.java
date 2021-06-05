package com.example.PalindromicSubsequence;

import java.util.Arrays;

public class CountOfPalindromicSubstrings {

    int count=0;

    public int findCPS(String s) {
        int[][] memo = new int[s.length()+1][s.length()+1];
        Arrays.stream(memo).forEach(row -> {
            Arrays.fill(row, -1);
        });
        count=0;
        lps(s, 0, s.length()-1, memo);
        return count;
    }

    int lps(String s, int left, int right, int[][] memo) {
        if(right<left)  return 0;
        if(memo[left][right] != -1) {
            return memo[left][right];
        }
        if(right==left) {
            memo[left][right] = 1;
            count++;
            return 1;
        }
        if(s.charAt(left) == s.charAt(right)) {
            int x = lps(s, left+1, right-1, memo);
            if(right-left-1 == x) {
                count++;
                x+=2;
                memo[left][right] = x;
                //return memo[left][right];
            }
        }
        int one = lps(s, left+1, right, memo);
        int two = lps(s, left, right-1, memo);

        memo[left][right] = Math.max(one, two);

        return memo[left][right];
    }

    public static void main(String[] args) {
        CountOfPalindromicSubstrings cps = new CountOfPalindromicSubstrings();
        System.out.println(cps.findCPS("abdbca"));
        System.out.println(cps.findCPS("cdpdd"));
        System.out.println(cps.findCPS("pqr"));
    }

}