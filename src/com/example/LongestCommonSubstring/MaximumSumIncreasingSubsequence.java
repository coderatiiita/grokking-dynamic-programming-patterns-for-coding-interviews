package com.example.LongestCommonSubstring;

import java.util.Arrays;

public class MaximumSumIncreasingSubsequence {

    public int findMSIS(int[] nums) {
        int[] dp = Arrays.copyOf(nums, nums.length);

        int best=0;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<i; j++) {
                if(nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+nums[i]);
                }
            }
            best = Math.max(best, dp[i]);
        }

        return best;
    }

    public static void main(String[] args) {
        MaximumSumIncreasingSubsequence msis = new MaximumSumIncreasingSubsequence();
        int[] nums = {4,1,2,6,10,1,12};
        System.out.println(msis.findMSIS(nums));
        nums = new int[]{-4,10,3,7,15};
        System.out.println(msis.findMSIS(nums));
        nums = new int[]{1,3,8,4,14,6,14,1,9,4,13,3,11,17,29};
        System.out.println(msis.findMSIS(nums));
    }

}
