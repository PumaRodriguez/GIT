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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     * Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
     */
    public static void main(String[] args) {
         Random aleatorio = new Random();
          Scanner leer = new Scanner(System.in);
          System.out.println(" Favor de ingresar el tamaño del Vector: ") ;
          int tamaño = leer.nextInt();
     
         int vector[];
      vector=new int[tamaño]; // Le ponemos la dimension al vector
            
// Asigno valores mediante el for
for (int i = 0; i <tamaño; i++) {
  vector[i] = aleatorio.nextInt(5);
}

System.out.println(" ingrese el numero entero a buscar ") ;
          int opcion = leer.nextInt();
       int aux=0;   
// Muestro el vector
for (int i = 0; i <tamaño; i++) {
   if (vector[i] == opcion) {
      aux=aux+1;
       System.out.println("el numero: " + vector[i] + " esta en la posicion: " + i);
   }
}
      if (aux>1){
    System.out.println("el numero esta repetido " + aux + " veces");
}else{
           System.out.println("el numero no esta en el vector");
}
 


}
        // TODO code application logic here
    }

