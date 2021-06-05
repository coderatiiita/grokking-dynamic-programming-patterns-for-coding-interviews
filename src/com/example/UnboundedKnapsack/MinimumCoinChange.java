package com.example.UnboundedKnapsack;

import java.util.Arrays;

public class MinimumCoinChange {

    public int countChange(int[] denominations, int total) {
        // TODO: Write your code here

        int[] memo = new int[total+1];
        Arrays.fill(memo, -1);

        return minCoinsRequired(denominations, total, memo);
    }

    private int minCoinsRequired(int[] denominations, int total, int[] memo) {
        if(total == 0)  return 0;
        if(total<0) return -1;
        if(memo[total] != -1)   return memo[total];

        int minCoins=Integer.MAX_VALUE;
        for (int denomination : denominations) {
            if (denomination <= total) {
                int d = minCoinsRequired(denominations, total - denomination, memo);
                if(d!=-1) {
                    minCoins = Math.min(minCoins, d+1);
                }
            }
        }
        memo[total] = minCoins == Integer.MAX_VALUE ? -1 : minCoins;
        return memo[total];
    }

    public static void main(String[] args) {
        MinimumCoinChange cc = new MinimumCoinChange();
        int[] denominations = {1, 2, 3};
        System.out.println(cc.countChange(denominations, 5));
        System.out.println(cc.countChange(denominations, 11));
        System.out.println(cc.countChange(denominations, 7));
        denominations = new int[]{3, 5};
        System.out.println(cc.countChange(denominations, 7));
    }

}