//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Sortowanie pięciu liczb");

        int [] liczby = new int [5];
        for (int i = 0; i <= liczby.length - 1; i++) {
            System.out.println("Podaj liczbę nr " + (i + 1) + ":");
            liczby[i] = s.nextInt();
        }

        Arrays.sort(liczby);

        for(int liczba: liczby) {
            System.out.println(liczba);
        }
        s.close();
    }
}
