/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;
import java.util.Scanner;
/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        
    // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer zadania: ");
        System.out.println("Podaj operator: ");
        System.out.println(" Operator <<: 1 \n Operator >>: 2 \n Operator >>>: 3");
        int sterownik = scanner.nextInt();

        int operator = scanner.nextInt();
        int i;
        switch (sterownik) {
            case 1:

                System.out.println("Wybrany operator: <<, podaj liczbe: ");
                Scanner scanner1 = new Scanner(System.in);
                int a = scanner1.nextInt();
                i = a << operator;
                System.out.println("Wynik operatora <<: " + a);
                break;

            case 2:

                System.out.println("Wybrany operator: >>, podaj liczbe: ");
                Scanner scanner2 = new Scanner(System.in);
                int b = scanner2.nextInt();
                i = b >> operator;
                System.out.println("Wynik operatora >>: " + b);

                break;

            case 3:

                System.out.println("Wybramy operator: >>>, podaj liczbe: ");
                Scanner scanner3 = new Scanner(System.in);
                int c = scanner3.nextInt();
                i = c >>> operator;
                System.out.println("Wynik operatora >>>: " + c);
        }
    }
}

