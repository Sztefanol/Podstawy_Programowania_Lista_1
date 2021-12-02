//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Liczenie raty ze zmiennym oprocentowaniem z kapitalizacją roczną");
        System.out.println("Podaj liczbę rat");
        int liczbaRat = s.nextInt();

        System.out.println("Podaj wartość towaru");
        double wartosc = s.nextDouble();
        if(wartosc > 50000.0){
            System.out.println("Cena przekracza 50 000!");
            s.close();
            System.exit(-1);
        }

        int liczbaKapitalizacji = 1 + (liczbaRat - 1) / 12;
        System.out.println(liczbaKapitalizacji);

        if(liczbaKapitalizacji <= 1)
            System.out.println("1Rata miesięczna wynosi:" + wartosc * Math.pow(1.06, liczbaKapitalizacji) / liczbaRat);
        else if(liczbaKapitalizacji <= 2)
            System.out.println("2Rata miesięczna wynosi:" + wartosc * Math.pow(1.06, liczbaKapitalizacji) / liczbaRat);
        else if(liczbaKapitalizacji <= 4)
            System.out.println("3Rata miesięczna wynosi:" + wartosc * Math.pow(1.10, liczbaKapitalizacji) / liczbaRat);
        s.close();
    }
}
