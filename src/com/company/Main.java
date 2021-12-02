//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Wpisz numer zadania (1 do 8):");
        String d = s.nextLine();
        switch (d) {
            case "1" -> Zad1.main(args);
            case "2" -> Zad2.main(args);
            case "3" -> Zad3.main(args);
            case "4" -> Zad4.main(args);
            case "5" -> Zad5.main(args);
            case "6" -> Zad6.main(args);
            case "7" -> Zad7.main(args);
            case "8" -> Zad8.main(args);
            default -> System.out.println("Nieznane zadanie");
        }
    }
}
