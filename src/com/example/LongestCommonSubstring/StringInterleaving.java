package com.example.LongestCommonSubstring;

public class StringInterleaving {

  public static void main(String[] args) {
    StringInterleaving si = new StringInterleaving();
    System.out.println(si.findSI("abd", "cef", "abcdef"));
    System.out.println(si.findSI("abd", "cef", "adcbef"));
    System.out.println(si.findSI("abc", "def", "abdccf"));
    System.out.println(si.findSI("abcdef", "mnop", "mnaobcdepf"));
  }

  private boolean findSI(String m, String n, String p) {
    return _findSI(m, n, p, 0, 0, 0);
  }

  private boolean _findSI(String m, String n, String p, int i, int j, int k) {

    if(i==m.length() && j==n.length() && k==p.length()) {
      return true;
    }

    if(k==p.length()) return false;

    boolean b1=false, b2=false;
    if(i < m.length() && m.charAt(i) == p.charAt(k)) {
      b1 = _findSI(m, n, p, i+1, j, k+1);
    }
    if(j<n.length() && n.charAt(j) == p.charAt(k)) {
      b2 = _findSI(m, n, p, i, j+1, k+1);
    }

    return b1 || b2;
  }

}
