package com.company;

import java.lang.reflect.Type;
import java.util.List;

public class Zad9 {
    public static void main(String[] args){
        int[] array = {5,4,3,2,1};
        BubbleSort bubbleSort = new BubbleSort();
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
        for (int number:
             array) {
            System.out.println(number);
        }
        System.out.println(array);

    }
}

