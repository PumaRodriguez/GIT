package guia3;

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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * Crear un programa que dado un número determine si es par o impar
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        System.out.println(" Ingresa un Numero:");
        int numero = leer.nextInt();
        if (numero%2==0) {
            System.out.println("Es un numero Par");
        }else {System.out.println("Es un nuemro Impar");
    }

}
}