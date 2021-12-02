//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Liczenie powierzchni i objętości kuli");
        System.out.println("Podaj promień:");
        double r = s.nextDouble();

        double powierzchnia = 4.0 * Math.PI * r*r;
        double objetosc = 4.0/3.0 * Math.PI * r*r*r;

        System.out.println("Powierzchnia: " + powierzchnia);
        System.out.println("Objętość: " + objetosc);
        s.close();
    }
}
