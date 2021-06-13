package com.example.LongestCommonSubstring;

public class LongestAlternatingSubsequence {

  public static void main(String[] args) {
    LongestAlternatingSubsequence las = new LongestAlternatingSubsequence();
    int[] nums = {1,2,3,4};
    System.out.println(las.findLASLength(nums));
    nums = new int[]{3,2,1,4};
    System.out.println(las.findLASLength(nums));
    nums = new int[]{1,3,2,4};
    System.out.println(las.findLASLength(nums));
  }

  private int findLASLength(int[] nums) {
    return Math.max(_findLASLength(nums, -1, 0, true), _findLASLength(nums, -1, 0, false));
  }

  private int _findLASLength(int[] nums, int prev, int i, boolean isAsc) {

    if(i==nums.length)  return 0;

    int c1=0;
    if(isAsc) {
      if(prev == -1 || nums[prev] < nums[i]) {
        c1 = 1 + _findLASLength(nums, i, i+1, !isAsc);
      }
    } else {
      if(prev == -1 || nums[prev] > nums[i]) {
        c1 = 1 + _findLASLength(nums, i, i+1, !isAsc);
      }
    }

    int c2 = _findLASLength(nums, prev, i+1, isAsc);

    return Math.max(c1, c2);
  }

}
