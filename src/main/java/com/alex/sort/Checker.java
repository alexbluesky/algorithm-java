package com.alex.sort;

import java.util.Random;

public class Checker {
    static final Random r = new Random();

    static Double[] getNumbers(int length) {
//        Random r = new Random();
        Double[] ints = new Double[length];
        for (int i = 0; i < length; i++) {
            ints[i] = r.nextDouble();
        }
        return ints;
    }

    static void assertResultOne(BaseSort sort, int length) {
        Double[] a = getNumbers(length);
        sort.sort(a);
        assert sort.isSorted(a);
//        return sort.isSorted(a);
    }

    static void assertResultMore(BaseSort sort, int length, int loop) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            assertResultOne(sort, length);
//            if (!assertResultOne(sort, length)) {
//                return false;
//            }
        }
        long runTime = System.currentTimeMillis() - start;
        System.out.println(sort.getClass().getName() + " run " + runTime + "ms");
        assert true;
//        return true;
    }

    public static void main(String[] args) {
        Selection selection = new Selection();
        Insertion insertion = new Insertion();
        Bubble bubble = new Bubble();
        Shell shell = new Shell();

//        assertResultOne(insertion, 1000);
        assertResultMore(selection, 1000, 1000);
        assertResultMore(bubble, 1000, 1000);
        assertResultMore(insertion, 1000, 1000);
        assertResultMore(shell, 1000, 1000);
    }
}
