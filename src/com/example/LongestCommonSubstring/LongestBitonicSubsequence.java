package com.example.LongestCommonSubstring;

public class LongestBitonicSubsequence {

    public int findLBSLength(int[] nums) {
        int maxLength = 0;
        for(int i=0; i<nums.length; i++) {
            int c1 = findLDSLength(nums, i, -1);
            int c2 = findLDSLengthRev(nums, i, -1);
            maxLength = Math.max(maxLength, c1+c2-1);
        }
        return maxLength;
    }

    private int findLDSLengthRev(int[] nums, int i, int prev) {
        if(i<0) return 0;

        int c1 = 0;
        if(prev == -1 || nums[i] < nums[prev]) {
            c1 = 1 + findLDSLengthRev(nums, i-1, i);
        }
        int c2 = findLDSLengthRev(nums, i-1, prev);
        return Math.max(c1, c2);
    }

    private int findLDSLength(int[] nums, int i, int prev) {
        if(i == nums.length)    return 0;

        int c1 = 0;
        if(prev == -1 || nums[i] < nums[prev]) {
            c1 = 1 + findLDSLength(nums, i+1, i);
        }
        int c2 = findLDSLength(nums, i+1, prev);
        return Math.max(c1, c2);
    }

    public static void main(String[] args) {
        LongestBitonicSubsequence lbs = new LongestBitonicSubsequence();
        int[] nums = {4,2,3,6,10,1,12};
        System.out.println(lbs.findLBSLength(nums));
        nums = new int[]{4,2,5,9,7,6,10,3,1};
        System.out.println(lbs.findLBSLength(nums));
    }

}
