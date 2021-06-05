package com.example.FibonacciNumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinimumJumpsToReachEnd {

    public int countMinJumps(int[] jumps) {
        // TODO: Write your code here
        return _countMinJumps(jumps, 0, jumps.length);
    }

    private int _countMinJumps(int[] jumps, int i, int n) {
        if(i>=n)    return Integer.MAX_VALUE;
        if(i==n-1) {
            return 0;
        }
        if(jumps[i] == 0) {
            return Integer.MAX_VALUE;
        }
        int ans = Integer.MAX_VALUE;
        int j=jumps[i];
        for(int k=i+1; k<n && k<=i+j; k++) {
            int x = _countMinJumps(jumps, k, n);
            if (x != Integer.MAX_VALUE)
                ans = Math.min(ans, x + 1);
        }
        return ans;

    }

    public static void main(String[] args) {
        MinimumJumpsToReachEnd aj = new MinimumJumpsToReachEnd();
        int[] jumps = {2, 1, 1, 1, 4};
        System.out.println(aj.countMinJumps(jumps));
        jumps = new int[]{1, 1, 3, 6, 9, 3, 0, 1, 3};
        System.out.println(aj.countMinJumps(jumps));
    }
}
