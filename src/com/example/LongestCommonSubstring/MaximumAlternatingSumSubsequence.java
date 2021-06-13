package com.example.LongestCommonSubstring;

import java.util.Arrays;

public class MaximumAlternatingSumSubsequence {

  public static long maxAlternatingSum(int[] arr) {
    int n = arr.length;
    if (n == 1)
      return arr[0];

    int dec[] = new int[n];
    int inc[] = new int[n];

    dec[0] = inc[0] = arr[0];

    int flag = 0 ;

    for (int i=1; i<n; i++) {
      for (int j=0; j<i; j++) {
        if (arr[j] > arr[i]) {
          dec[i] = Math.max(dec[i], inc[j]+arr[i]);
          flag = 1;
        } else if (arr[j] < arr[i] && flag == 1) {
          inc[i] = Math.max(inc[i], dec[j] + arr[i]);
        }
      }
    }

    int maxVal = Integer.MIN_VALUE;
    int minVal = Integer.MAX_VALUE;
    for (int i = 0 ; i < n; i+=1) {
      if (inc[i]!=0 && minVal > inc[i])
        minVal = inc[i];
      if (dec[i]!=0 && minVal > dec[i])
        minVal = dec[i];
      if (maxVal < inc[i])
        maxVal = inc[i];
      if (maxVal < dec[i])
        maxVal = dec[i];
    }
    return maxVal - minVal == 0 ? Arrays.stream(arr).max().getAsInt() : maxVal - minVal;
  }

  public static void main(String[] args) {
    System.out.println(maxAlternatingSum(new int[]{4, 2, 5, 3}));
    System.out.println(maxAlternatingSum(new int[]{5,6,7,8}));
    System.out.println(maxAlternatingSum(new int[]{6,2,1,2,4,5}));
  }
}