package com.example.ZeroOneKnapsack;

import java.util.Arrays;

public class MinimumSubsetSumDifference {

    public int canPartition(int[] num) {
        // TODO: Write your code here
        int sum=0;
        sum = Arrays.stream(num).sum();
        return minDiff(num, num.length-1, 0, sum);
    }

    private int minDiff(int[] num, int i, int currSum, int sum) {
        if(i<0) {
            return Math.abs(currSum-sum);
        }
        return Math.min(minDiff(num, i-1, currSum+num[i], sum-num[i]), minDiff(num, i-1, currSum, sum));
    }

    public static void main(String[] args) {
        MinimumSubsetSumDifference ps = new MinimumSubsetSumDifference();
        int[] num = {1, 2, 3, 9};
        System.out.println(ps.canPartition(num));
        num = new int[]{1, 2, 7, 1, 5};
        System.out.println(ps.canPartition(num));
        num = new int[]{1, 3, 100, 4};
        System.out.println(ps.canPartition(num));
    }

}
