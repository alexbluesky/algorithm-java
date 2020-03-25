package com.alex.sort;

public class Shell extends BaseSort {

    @Override
    public void sort(Comparable[] a) {
        int len = a.length, h = 1;
        while (h < len / 3) h = 3 * h + 1;
        while (h >= 1) {
            for(int i=h; i< len; i++){
                for(int j=i; j >= h && less(a[j], a[j-h]); j -= h){
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }
    }
}
