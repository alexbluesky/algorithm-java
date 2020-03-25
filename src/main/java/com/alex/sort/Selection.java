package com.alex.sort;

public class Selection extends BaseSort {
    @Override
    public void sort(Comparable[] a) {
        int start = 0, len = a.length;
        while(start < len){
            int min = start;
            for(int i=start+1; i<len; i++){
                if(less(a[i], a[min])){
                   min = i;
//                    exch(a, i, min);
//                    min = i;
                }
            }
            exch(a, min, start);
            start++;
        }
    }
}
