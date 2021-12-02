//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String imie = s.nextLine();
        System.out.println("Hello " + imie + "!");
        s.close();
    }
}
