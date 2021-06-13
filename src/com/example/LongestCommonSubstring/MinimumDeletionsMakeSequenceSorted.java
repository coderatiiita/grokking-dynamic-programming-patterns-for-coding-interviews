package com.example.LongestCommonSubstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDeletionsMakeSequenceSorted {

    public int findMinimumDeletions(int[] nums){
        // TODO: Write your code here
        return nums.length - findLISLength(nums);
    }

    public int findLISLength(int[] arr) {
        // TODO: Write your code here;
        List<Integer> nums = new ArrayList<>();
        Arrays.stream(arr).forEach(nums::add);
        int[] dp = new int[nums.size()];
        Arrays.fill(dp, 1);
        int best = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (nums.get(i) > nums.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            best = Math.max(best, dp[i]);
        }
        return best;
    }

    public static void main(String[] args) {
        MinimumDeletionsMakeSequenceSorted mdss = new MinimumDeletionsMakeSequenceSorted();
        int[] nums = {4,2,3,6,10,1,12};
        System.out.println(mdss.findMinimumDeletions(nums));
        nums = new int[]{-4,10,3,7,15};
        System.out.println(mdss.findMinimumDeletions(nums));
        nums = new int[]{3,2,1,0};
        System.out.println(mdss.findMinimumDeletions(nums));
    }

}
