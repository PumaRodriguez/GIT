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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingresa un valor limite Positivo:");
        int limite = leer.nextInt();
        System.out.println(" Ingrese un numero:");
        int numero = leer.nextInt();
        while (numero < limite) {
            System.out.println(" Ingrese un nuevo numero:");
        int numero2 = leer.nextInt();
        numero=(numero+numero2);
        }
            System.out.println("llego al limite");
      
    }
    }

