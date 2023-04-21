/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia5;

/**
 *
 * @author u180448
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {
        
      int vector[];
      vector=new int[100]; // Le ponemos la dimension al vector
            
// Puedo asignar valores de esta manera

//vector[0] = 3;

// Asigno valores mediante el for
for (int i = 0; i <100; i++) {
  vector[i] = i;
}

// Muestro el vector
for (int i = 99; i > -1; i--) {
System.out.println("[" + vector[i] + "]");
}
    }
}

