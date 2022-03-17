package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
    }
    public void sort(int[] arrayA){
       int[] arrayB = Arrays.copyOfRange(arrayA, 0, arrayA.length);
       //System.out.println("A: " + arrayA.length + "B: " + arrayB.length);
       topDownSplitMerge(arrayB, 0, arrayA.length, arrayA);
    }

    protected void topDownSplitMerge(int[] arrayB, int begin, int end, int[] arrayA){
        if (end - begin <= 1){
            return;
        }
        int middle = (begin + end) / 2;
        topDownSplitMerge(arrayA, begin, middle, arrayB);
        topDownSplitMerge(arrayA, middle, end, arrayB);
        topDownMerge(arrayB, begin, middle, end, arrayA);
    }

    protected void topDownMerge(int[] arrayA, int begin, int middle, int end, int[] arrayB){
        int i = begin;
        int j = middle;

        for (int k = begin; k < end; k++){
            if (i < middle && (j >= end || arrayA[i] <= arrayA[j])){
                arrayB[k] = arrayA[i];
                i++;
            } else {
                arrayB[k] = arrayA[j];
                j++;
            }
        }
    }
}
