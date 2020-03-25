package com.alex.sort;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.time.StopWatch;

public class SortCompare {
    static long time(String alg, Double[] a) {
        StopWatch watch = new StopWatch();
        watch.start();
        if (alg.equalsIgnoreCase("insertion")) new Insertion().sort(a);
        else if (alg.equalsIgnoreCase("selection")) new Selection().sort(a);
        else if (alg.equalsIgnoreCase("bubble")) new Bubble().sort(a);
        watch.stop();
        System.out.println(alg + " running: " + watch.getTime());
        return watch.getTime();
    }

    static long timeRandomInput(String alg, int n, int t) {
        long total = 0;
        Double[] a = new Double[n];
        for (int j = 0; j < t; j++) {
            for (int i = 0; i < n; i++) {
                a[i] = RandomUtils.nextDouble();
            }
            total += time(alg, a);
        }
        return total;
    }

    public static void main(String[] args) {
        String al1 = "insertion", al2 = "selection";
        int n = 1000, t = 1000;
        double t1 = timeRandomInput(al1, n, t);
        double t2 = timeRandomInput(al2, n, t);
        System.out.printf("For %d random Doubles \n  %s is", n, al1);
        System.out.printf(" %.1f times faster than %s\n", t2/t1, al2);
    }

}
