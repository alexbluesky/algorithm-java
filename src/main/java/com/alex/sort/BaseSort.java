package com.alex.sort;

import java.util.Arrays;

public abstract class BaseSort {
    public abstract void sort(Comparable[] a);

    protected static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    protected static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    protected static void show(Comparable[] a) {
        for (Comparable c : a) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
