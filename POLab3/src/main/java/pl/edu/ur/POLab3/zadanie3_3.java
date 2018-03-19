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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bart
 */
@SuppressWarnings("empty-statement")
public class zadanie3_3 {

    public static int potega(int x, int n) {
        int a;
        if (n == 0) {
            return 1;
        }
        if (n % 2 != 0) {
            return x * potega(x, n - 1);
        } else {
            a = potega(x, n / 2);
        }

        return a * a;
    }

    public static void main(String[] args) {

        System.out.println("Podaj rodzaj zadania: \n Potegowanie za pomocą rekurencji: 1 \n Potegowanie za pomocą iteracji: 2");
        Scanner sc = new Scanner(System.in);
        int sterownik = sc.nextInt();

        switch (sterownik) {

            case 1:
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Podaj podstawe  potęgi:  ");
                int n = sc1.nextInt();
                System.out.println("Podaj wykładnik potegi: ");
                int x = sc1.nextInt();

                System.out.println("Wynik algorytmu szybkiego potegowania:  " + potega(n, x));

        }

    }
}
