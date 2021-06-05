package com.example.UnboundedKnapsack;

class Knapsack {

    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        // TODO: Write your code here
        return maxProfit(profits, weights, weights.length - 1, capacity);
    }

    private int maxProfit(int[] profits, int[] weights, int i, int capacity) {
        if(i<0 || capacity <= 0)
            return 0;

        int p1=0;
        if(weights[i] <= capacity)
            p1=maxProfit(profits, weights, i, capacity-weights[i]) + profits[i];
        int p2 = maxProfit(profits, weights, i-1, capacity);
        return Math.max(p1, p2);
    }

    public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        int[] profits = { 15, 50, 60, 90 };
        int[] weights = { 1, 3, 4, 5 };
        int maxProfit = ks.solveKnapsack(profits, weights, 8);
        System.out.println(maxProfit);
    }

}

