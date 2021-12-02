//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        double val1 = s.nextDouble();

        System.out.println("Podaj operator:");
        s.nextLine();
        String operator = s.nextLine();

        System.out.println("Podaj drugą liczbę:");
        double val2 = s.nextDouble();

        switch(operator){
            case "+" -> System.out.println("Wynik: " + (val1 + val2));
            case "-" -> System.out.println("Wynik: " + (val1 - val2));
            case "*" -> System.out.println("Wynik: " + val1 * val2);
            case "/" -> System.out.println("Wynik: " + val1 / val2);
            default -> System.out.println("Nieznany operator: " + operator);
        }
        s.close();
    }
}
