package guia5;


import java.util.Random;
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
public class Ejercicio3Extra {

    /**
     * @param args the command line arguments
     * Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
     */
   
    static Random rand = new Random();
    static Scanner leer = new Scanner(System.in);
    
     public static void main(String[] args) {
        int vector[] = new int[6];
        
        llenarVector(vector);
        
        mostrarVector(vector);

    }

    private static void llenarVector(int[] vector) {
        for (int i = 0; i < 6; i++) {
            vector[i] = rand.nextInt(10)+1;
        }
    }

    private static void mostrarVector(int[] vector) {
        for (int i = 0; i < 6; i++) {
            System.out.println(vector[i]);
        }
        // TODO code application logic here
    }

}