//Łukasz Krawczyszn
//Nr indeksu: 46968
package com.company;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] arguments = new String[8];

        for (int i = 0; i <= arguments.length - 1; i++) {
            arguments[i] = s.nextLine();
        }
        System.out.println("Idę do sklepu " + arguments[0] + " spoglądam na półkę zawierającą " + arguments[1] + " i " + arguments[2] + " patrzę na " + arguments[3] + ", ale zauważam i wybieram z półki " + arguments[4] + ". Idę z tym do kasy, zauważając dodatkowo " + arguments[5] + ", ale nie biorę tego. Przy kasie płacę " + arguments[6] + " i wychodzę, udając się w kierunku " + arguments[7]);
        s.close();
    }
}
