package com.company;

public class Utils {
    public static void swap(int[] array, int i, int j) {
        int swapHelper = array[i];
        array[i] = array[j];
        array[j] = swapHelper;
    }

    public static void printIntegerArray(int[] array){
        for (int number:
                array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
