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
public class Ejercicio1Extra {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int vector [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor para la posición " + i );
          vector[i] = leer.nextInt(); 
        }
        int sumar=0;
        for (int i = 0; i < n; i++) {
            sumar = vector[i] + sumar;
        }
        System.out.println("La suma de los índices es: " + sumar);
        // TODO code application logic here
    }

}