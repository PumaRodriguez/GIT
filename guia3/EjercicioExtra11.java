package guia3;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u180448
 */
public class EjercicioExtra11 {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero:"));
        int cantidadDigitos = 0; // contador para la cantidad de dígitos

        while (numero != 0) {
            numero = numero / 10; // división sucesiva por 10
            cantidadDigitos++; // se incrementa el contador de dígitos
        }
        JOptionPane.showMessageDialog(null, "El número tiene " + cantidadDigitos + " dígitos.") ;
        System.out.println("El número tiene " + cantidadDigitos + " dígitos.");
        // TODO code application logic here
    }

}