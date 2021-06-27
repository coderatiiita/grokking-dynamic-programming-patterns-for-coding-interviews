package com.example.LongestCommonSubstring;

public class SubsequencePatternMatching {

    int findSPMCount(String string, String pattern) {
        return _findSPMCount(string, pattern, 0, 0);
    }

    int _findSPMCount(String s, String p, int i, int j) {

        if(p.length() == j) return 1;

        if(s.length() == i) return 0;

        int c1=0;
        if(s.charAt(i) == p.charAt(j)) {
            c1 = _findSPMCount(s, p, i+1, j+1);
        }

        int c2 = _findSPMCount(s, p, i+1, j);

        return c1 + c2;
    }

    public static void main(String[] args) {
        SubsequencePatternMatching spm = new SubsequencePatternMatching();
        System.out.println(spm.findSPMCount("baxmx", "ax"));
        System.out.println(spm.findSPMCount("tomorrow", "tor"));
    }

}
