package com.alex.sort;

public class Bubble extends BaseSort {

    @Override
    public void sort(Comparable[] a) {
        int start = 0, len = a.length;
        while (start < len) {
            for (int i = 0; i < len - start - 1; i++) {
                if (less(a[i + 1], a[i])) {
                    exch(a, i + 1, i);
                }
            }
            start++;
        }
    }
}
