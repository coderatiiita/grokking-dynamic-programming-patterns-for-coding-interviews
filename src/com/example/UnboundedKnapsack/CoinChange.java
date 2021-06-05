package com.example.UnboundedKnapsack;

class CoinChange {

    public int countChange(int[] denominations, int total) {
        // TODO: Write your code here
        return _countChange(denominations, total, denominations.length-1);
    }

    private int _countChange(int[] denominations, int total, int i) {
        if(total==0)    return 1;
        if(total<0 || i<0) return 0;
        int p1=0;
        if(denominations[i] <= total) {
            p1 = _countChange(denominations, total-denominations[i], i);
        }
        int p2 = _countChange(denominations, total, i-1);
        return p1+p2;
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
        int[] denominations = {1, 2, 3};
        System.out.println(cc.countChange(denominations, 5));
    }

}
