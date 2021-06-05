package com.example.ZeroOneKnapsack;

class Knapsack {

    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        // TODO: Write your code here
        return maxProfit(profits, weights, capacity, weights.length-1);
    }

    private int maxProfit(int[] profits, int[] weights, int capacity, int i) {
        if(i<0 || capacity==0) return 0;
        if(weights[i] > capacity)
            return maxProfit(profits, weights, capacity, i-1);
        return Math.max(maxProfit(profits, weights, capacity, i-1), maxProfit(profits, weights, capacity-weights[i], i-1) + profits[i]);
    }

    public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int maxProfit = ks.solveKnapsack(profits, weights, 7);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        maxProfit = ks.solveKnapsack(profits, weights, 6);
        System.out.println("Total knapsack profit ---> " + maxProfit);
    }
}

