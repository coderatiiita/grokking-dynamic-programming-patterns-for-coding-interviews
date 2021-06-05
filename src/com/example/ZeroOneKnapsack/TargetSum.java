package com.example.ZeroOneKnapsack;

class TargetSum {

    static int count=0;

    public int findTargetSubsets(int[] num, int s) {
        // TODO: Write your code here
        count=0;
        ways(num, num.length-1, s, 0);
        return count;
    }

    private void ways(int[] num, int i, int s, int currSum) {
        if(i<0) {
            if(currSum == s) {
                count++;
            }
            return;
        }

        ways(num, i-1, s, currSum+num[i]);
        ways(num, i-1, s, currSum-num[i]);
    }

    public static void main(String[] args) {
        TargetSum ts = new TargetSum();
        int[] num = {1, 1, 2, 3};
        System.out.println(ts.findTargetSubsets(num, 1));
        num = new int[]{1, 2, 7, 1};
        System.out.println(ts.findTargetSubsets(num, 9));
    }

}
