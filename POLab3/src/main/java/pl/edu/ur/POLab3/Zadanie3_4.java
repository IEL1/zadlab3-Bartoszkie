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
public class Zadanie3_4 {
    
     public static int Fibonacci (int n){
        
        if ( n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        else {
         return Fibonacci(n-1) + Fibonacci(n-2);   
        }
    }
    
 public static void main (String[] args){
     
     Scanner sc1 = new Scanner(System.in);
     System.out.println("Podaj wyraz ciagu Fibonacciego do obliczenia: ");
     int n = sc1.nextInt();
     System.out.println("Wynik:  " + Fibonacci(n));
 }
}

