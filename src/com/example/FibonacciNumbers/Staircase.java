package com.example.FibonacciNumbers;

public class Staircase {
    public int CountWays(int n) {
        // TODO: Write your code here
        return ways(n);
    }

    private int ways(int n) {
        if(n<=0)    return 1;
        if(n==1)    return 1;
        if(n==2)    return 2;
        if(n==3)    return 4;
        return ways(n-1) + ways(n-2) + ways(n-3);
    }

    public static void main(String[] args) {
        Staircase sc = new Staircase();
        System.out.println(sc.CountWays(3));
        System.out.println(sc.CountWays(4));
        System.out.println(sc.CountWays(5));
    }
}
