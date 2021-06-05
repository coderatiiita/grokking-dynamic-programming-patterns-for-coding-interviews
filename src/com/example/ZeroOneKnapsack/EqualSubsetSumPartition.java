package com.example.ZeroOneKnapsack;

public class EqualSubsetSumPartition {

    private boolean canPartition(int[] num) {
        int n=num.length;
        int sum=0;
        for(int x : num) {
            sum+=x;
        }
        if(sum%2!=0)    return false;
        return isPossible(num, n-1, sum, 0);
    }

    private boolean isPossible(int[] num, int i, int sum, int currSum) {
        if(currSum*2 == sum)    return true;
        if(i<0 || currSum*2 > sum) return false;

        return isPossible(num, i-1, sum, currSum+num[i]) || isPossible(num, i-1, sum, currSum);
    }

    public static void main(String[] args) {
        EqualSubsetSumPartition ps = new EqualSubsetSumPartition();
        int[] num = {1, 2, 3, 4};
        System.out.println(ps.canPartition(num));
        num = new int[]{1, 1, 3, 4, 7};
        System.out.println(ps.canPartition(num));
        num = new int[]{2, 3, 4, 6};
        System.out.println(ps.canPartition(num));
    }

}
