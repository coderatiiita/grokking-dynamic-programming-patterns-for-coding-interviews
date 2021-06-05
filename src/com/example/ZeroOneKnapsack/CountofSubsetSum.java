package com.example.ZeroOneKnapsack;

public class CountofSubsetSum {

    static int count=0;

    public int countSubsets(int[] num, int sum) {
        count=0;
        _countSubsets(num, num.length-1, sum, 0);
        return count;
    }

    private void _countSubsets(int[] num, int i, int sum, int currSum) {
        if(currSum > sum)   return;
        if(currSum == sum)  {
            count++;
            return;
        }
        if(i<0) return;

        _countSubsets(num, i-1, sum, currSum+num[i]);
        _countSubsets(num, i-1, sum, currSum);
    }

    public static void main(String[] args) {
        CountofSubsetSum ss = new CountofSubsetSum();
        int[] num = {1, 1, 2, 3};
        System.out.println(ss.countSubsets(num, 4));
        num = new int[]{1, 2, 7, 1, 5};
        System.out.println(ss.countSubsets(num, 9));
    }
}
