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
public class Ejercicio7Extra {

    /**
     * @param args the command line arguments
     * Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. Recordar que la sucesión de
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a
él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente
fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una
función que reciba como parámetro el valor de “n” y que calcule la serie
hasta llegar a ese valor.
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector: ");  //ingrese el tamaño del vector   
        int n = leer.nextInt();
        int fibonaccin [] = new int [n];
       
        for (int i = 0; i < n; i++) {                  // carga el vecor con La sucesión de Fibonacci
            if (i == 0 || i == 1) {                      // Compara ya que la primera posicion debe ser 1 para que funcione el For con [i]
             fibonaccin[i] = 1;}
          else{
         fibonaccin[i] = fibonaccin[i-1] + fibonaccin[i-2];
            }
        }
        System.out.print("Sucesión de Fibonacci: ");   // Muestra La sucesión de Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print(fibonaccin[i] + " ");
            // TODO code application logic here
    }
        System.out.println("");
        }
}
