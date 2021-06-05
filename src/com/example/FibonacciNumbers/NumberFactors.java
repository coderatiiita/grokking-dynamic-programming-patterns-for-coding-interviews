package com.example.FibonacciNumbers;

public class NumberFactors {

    public int CountWays(int n) {
        // TODO: Write your code here
        return ways(n);
    }

    private int ways(int n) {
        if(n<0)    return 0;
        if(n==1 || n==0 || n==2)    return 1;
        if(n==3)    return 2;
        return ways(n-3) + ways(n-1) + ways(n-4);
    }

    public static void main(String[] args) {
        NumberFactors en = new NumberFactors();
        System.out.println(en.CountWays(4));
        System.out.println(en.CountWays(5));
        System.out.println(en.CountWays(6));
    }

}
