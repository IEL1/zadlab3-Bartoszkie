/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class zadanie1_7 {
     public static void main(String[] args) {

        System.out.println("Funkcja NOT: 1");
        System.out.println("Funkcja XOR: 1");

        Scanner scanner = new Scanner(System.in);
        int sterownik = scanner.nextInt();

        switch (sterownik) {
            case 1:

                System.out.println("uwzycie NOT: ");
                System.out.println("Podaj dwie liczby:  ");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (jakasFunkcja(a, b) != 5) {
                    System.out.println("Udało sie");
                } else {
                    System.out.println("Nie udało sie");
                }

                break;

            case 2:

                System.out.println("Uzycie XOR");
                int c = scanner.nextInt();
                int d = scanner.nextInt();

                int wynik;

                wynik = c ^ d;

                System.out.println("Udało sie, bo wynik=" + wynik);

        }
    }

    static int jakasFunkcja(int x, int y) {

        int wynik;

        wynik = x + y;

        return wynik;   

    }

}
    
    
