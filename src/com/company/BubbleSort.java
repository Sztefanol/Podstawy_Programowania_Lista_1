package com.company;

public class BubbleSort {
    int helperValue;
    public void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]){
                    helperValue = array[j];
                    array[j] = array[j+1];
                    array[j+1] = helperValue;
                }
            }
        }
    }
}
