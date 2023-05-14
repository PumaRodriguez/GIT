/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author u180448
 */

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre, opc;
        int edad;

        do {
            
            nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
            edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad:"));       
         
                if (edad >= 18) {
                JOptionPane.showMessageDialog(null, " tiene " + edad + " años y es mayor de edad");
               
                } else {
                JOptionPane.showMessageDialog(null, " tiene " + edad + " años y no es mayor de edad");
           
             }
              
                         opc = JOptionPane.showInputDialog(null, "Desea Seguir cargando personas S/N");
           
          } while (!opc.equalsIgnoreCase("n"));
         JOptionPane.showMessageDialog(null, " GRACIAS, hasta Luego");
        // TODO code application logic here
    }

}