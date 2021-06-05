package com.example.UnboundedKnapsack;

public class MaxRibbonCut {

    public int countRibbonPieces(int[] ribbonLengths, int total) {
        // TODO: Write your code here
        return _maxCut(ribbonLengths, ribbonLengths.length-1, total);
    }

    private int _maxCut(int[] ribbonLengths, int i, int total) {
        if(total<0) return -1;
        if(total==0)    return 0;
        if(i<0) return -1;

        int p1=Integer.MIN_VALUE;
        if(ribbonLengths[i] <= total) {
            int d = _maxCut(ribbonLengths, i, total-ribbonLengths[i]);
            if(d!=-1) {
                p1 = d+1;
            }
        }
        int p2 = _maxCut(ribbonLengths, i-1, total);

        return Math.max(p1, p2);
    }

    public static void main(String[] args) {
        MaxRibbonCut cr = new MaxRibbonCut();
        int[] ribbonLengths = {2,3,5};
        System.out.println(cr.countRibbonPieces(ribbonLengths, 5));
        ribbonLengths = new int[]{2,3};
        System.out.println(cr.countRibbonPieces(ribbonLengths, 7));
        ribbonLengths = new int[]{3,5,7};
        System.out.println(cr.countRibbonPieces(ribbonLengths, 13));
        ribbonLengths = new int[]{3,5};
        System.out.println(cr.countRibbonPieces(ribbonLengths, 7));
    }

}
