package guia2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Guia2_Ejercicio2 {

    /**
     * @param args the command line arguments
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingresa tu nombre:");
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresado es:" + "[" + nombre + "]");
        
    }
    
}
