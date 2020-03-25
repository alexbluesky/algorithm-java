package com.alex.sort;

public class Insertion extends BaseSort {
    @Override
    public void sort(Comparable[] a) {
        int start = 1, len = a.length;
        while (start < len) {
            for (int i = start; i > 0; i--) {
                if(less(a[i], a[i-1])){
                    exch(a, i, i-1);
                }else{
                    break;
                }
            }
            start++;
        }
    }
}
