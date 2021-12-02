//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String tekstFib = "1";

        System.out.println("Obliczanie ciągu fibonacciego");
        System.out.println("Podaj liczbę elementów ciągu do wyświetlenia:");
        int n = s.nextInt();

        if (n == 0){
            System.out.println("Ciąg: 0");
            s.close();
            System.exit(-1);
        }
        if (n == 1){
            System.out.println("Ciąg: 1");
            s.close();
            System.exit(-1);
        }
        int f = 1;
        int fprim = 0;
        for (int i = 2; i <= n; i++){
            int m = f + fprim;
            fprim = f;
            f = m;
            tekstFib = tekstFib + ", " + f;
        }
        System.out.println("Ciąg: " + tekstFib);
        s.close();
    }
}
