package com.example.FibonacciNumbers;

public class HouseThief {

    public int findMaxSteal(int[] wealth) {
        // TODO: Write your code here
        return _findMaxSteal(wealth, wealth.length, 0);
    }

    private int _findMaxSteal(int[] wealth, int n, int i) {
        if(i>=n)    return 0;
        int s1 = _findMaxSteal(wealth, n, i+1);
        int s2 = _findMaxSteal(wealth, n, i+2) + wealth[i];
        return Math.max(s1, s2);
    }

    public static void main(String[] args) {
        HouseThief ht = new HouseThief();
        int[] wealth = {2, 5, 1, 3, 6, 2, 4};
        System.out.println(ht.findMaxSteal(wealth));
        wealth = new int[]{2, 10, 14, 8, 1};
        System.out.println(ht.findMaxSteal(wealth));
    }

}
