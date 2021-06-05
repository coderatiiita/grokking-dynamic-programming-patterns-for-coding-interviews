package com.example.FibonacciNumbers;

public class MinimumJumpsWithFee {

    public int findMinFee(int[] fee) {
        // TODO: Write your code here
        return _findMinFee(fee, 0, fee.length);
    }

    private int _findMinFee(int[] fee, int i, int n) {
        if(i>=n)     return 0;
        int x = _findMinFee(fee, i+1, n);
        int y = _findMinFee(fee, i+2, n);
        int z = _findMinFee(fee, i+3, n);
        return Math.min(x, Math.min(y, z)) + fee[i];
    }

    public static void main(String[] args) {
        MinimumJumpsWithFee sc = new MinimumJumpsWithFee();
        int[] fee = {1,2,5,2,1,2};
        System.out.println(sc.findMinFee(fee));
        fee = new int[]{2,3,4,5};
        System.out.println(sc.findMinFee(fee));
    }

}

