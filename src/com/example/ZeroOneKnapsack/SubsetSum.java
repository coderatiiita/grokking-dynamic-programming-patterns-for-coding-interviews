package com.example.ZeroOneKnapsack;

public class SubsetSum {

    public boolean canPartition(int[] num, int sum) {
        return isPossible(num, num.length - 1, sum);
    }

    private boolean isPossible(int[] num, int i, int sum) {
        if(sum == 0)  return true;
        if(i<0 || sum < 0) return false;

        return isPossible(num, i-1, sum-num[i]) || isPossible(num, i-1, sum);
    }

    public static void main(String[] args) {
        SubsetSum ss = new SubsetSum();
        int[] num = { 1, 2, 3, 7 };
        System.out.println(ss.canPartition(num, 6));
        num = new int[] { 1, 2, 7, 1, 5 };
        System.out.println(ss.canPartition(num, 10));
        num = new int[] { 1, 3, 4, 8 };
        System.out.println(ss.canPartition(num, 6));
    }

}
