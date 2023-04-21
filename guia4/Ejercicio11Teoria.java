/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia4;

import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Ejercicio11Teoria {

    /**
     * @param args the command line arguments
     * Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
     * 
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();
        String codificada = codificar(frase);
        System.out.println("La frase codificada es: " + codificada);
    }

    public static String codificar(String frase) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            switch (c) {
                case 'a':
                    resultado += "@";
                    break;
                case 'e':
                    resultado += "#";
                    break;
                case 'i':
                    resultado += "$";
                    break;
                case 'o':
                    resultado += "%";
                    break;
                case 'u':
                    resultado += "*";
                    break;
                default:
                    resultado += c;
                    break;
            }
        }
        return resultado;
    }
}
        
        // TODO code application logic here
    

