package guia5;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u180448
 */
public class Ejercicio2Extra {

    /**
     * @param args the command line arguments
     * Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna
diferencia entre los elementos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");  /// Pide el tamaño de los vectores
        int n = leer.nextInt();
        int vectorA [] = new int [n];
        int vectorB [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Vector A: Ingrese el valor para la posición " + i );   // Completa los vectores A y B
          vectorA[i] = leer.nextInt(); 
           System.out.println("Vector B: Ingrese el valor para la posición " + i );   // Completa los vectores A y B
          vectorB[i] = leer.nextInt(); 
        }
        System.out.println(" VECTOR A ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorA[i] + "]");
        }
        System.out.println("");
        System.out.println("");
         System.out.println(" VECTOR B ");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + vectorB[i] + "]");
        }
        System.out.println("");
        
                                                              // Realiza la comparacion de vectores y para..
        for (int i = 0; i < n; i++) {                 
            if (vectorA[i]==vectorB[i]) {
                System.out.println(" Venimos safando..........");
            }else{
               i=n;
            }
                System.out.println(" Ouch!!! Hay elementos diferentes en los Vectores: ");
        }
    }
}
