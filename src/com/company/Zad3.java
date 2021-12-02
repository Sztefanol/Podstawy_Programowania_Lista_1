//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Wyłonienie największej z 3 liczb");
        System.out.println("Podaj liczbę nr 1:");
        int liczbaMax = s.nextInt();

        for(int i =1; i <=2; i++) {
            System.out.println("Podaj liczbę nr " + (i + 1) + ":");

            int liczbaInna = s.nextInt();
            if(liczbaInna > liczbaMax) {
                liczbaMax = liczbaInna;
            }
        }
        System.out.println(liczbaMax);
        s.close();
    }
}
