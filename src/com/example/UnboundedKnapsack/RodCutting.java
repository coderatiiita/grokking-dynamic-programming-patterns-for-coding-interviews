package com.example.UnboundedKnapsack;

class RodCutting {

    public int solveRodCutting(int[] lengths, int[] prices, int n) {
        // TODO: Write your code here
        return maxProfit(lengths, prices, n, n - 1);
    }

    private int maxProfit(int[] lengths, int[] prices, int n, int i) {
        if(n<=0 || i<0) return 0;
        int p1=0;
        if(lengths[i] <= n) {
            p1 = maxProfit(lengths, prices, n-lengths[i], i) + prices[i];
        }
        int p2 = maxProfit(lengths, prices, n, i-1);

        return Math.max(p1, p2);
    }

    public static void main(String[] args) {
        RodCutting rc = new RodCutting();
        int[] lengths = {1, 2, 3, 4, 5};
        int[] prices = {2, 6, 7, 10, 13};
        int maxProfit = rc.solveRodCutting(lengths, prices, 5);
        System.out.println(maxProfit);
    }
}

