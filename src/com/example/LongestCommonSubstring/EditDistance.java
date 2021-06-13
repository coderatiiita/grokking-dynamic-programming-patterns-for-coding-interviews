package com.example.LongestCommonSubstring;

public class EditDistance {

  public static void main(String[] args) {
    EditDistance editDisatnce = new EditDistance();
    System.out.println(editDisatnce.findMinOperations("bat", "but"));
    System.out.println(editDisatnce.findMinOperations("abdca", "cbda"));
    System.out.println(editDisatnce.findMinOperations("passpot", "ppsspqrt"));
  }

  private int findMinOperations(String s1, String s2) {
    return solve(s1, s2, s1.length()-1, s2.length()-1);
  }

  private int solve(String s1, String s2, int i, int j) {
    if(i<0 && j<0)  return 0;
    if(i<0) return j;
    if(j<0) return i;

    if(s1.charAt(i) == s2.charAt(j)) {
      return solve(s1, s2, i-1, j-1);
    }

    return Math.min(solve(s1, s2, i-1, j),
                    Math.min(solve(s1, s2, i, j-1), solve(s1, s2, i-1, j-1))) + 1;
  }

}
