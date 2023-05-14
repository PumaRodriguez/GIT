package guia5;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u180448
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     * Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        int size = 100;
        int[] vector = new int[size];
        Random rand = new Random();
        int cont0 = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;

        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(100000);
            vector[i] = n;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Valor " + i + " --- " + vector[i]);
        }

        for (int i = 0; i < 10; i++) {
            if (vector[i] >= 0 && vector[i] < 10) {
                //System.out.println("Valor de 2 digitos");  
                cont0 = cont0 + 1;
            }
            if (vector[i] >= 10 && vector[i] < 100) {
                //System.out.println("Valor de 2 digitos");  
                cont1 = cont1 + 1;
            }
            if (vector[i] >= 100 && vector[i] < 1000) {
                //System.out.println("Valor de 2 digitos");  
                cont2 = cont2 + 1;
            }
            if (vector[i] >= 1000 && vector[i] < 10000) {
                //System.out.println("Valor de 2 digitos");  
                cont3 = cont3 + 1;
            }
                        if (vector[i] >= 10000 && vector[i] < 100000) {
                //System.out.println("Valor de 2 digitos");  
                cont4 = cont4 + 1;
            }
        }
        System.out.println("Numeros de 1 digito " + cont0 + " veces");
        System.out.println("Numeros de 2 digito " + cont1 + " veces");
        System.out.println("Numeros de 3 digito " + cont2 + " veces");
        System.out.println("Numeros de 5 digito " + cont3 + " veces");
        System.out.println("Numeros de 5 digito " + cont4 + " veces");

        System.out.println("Fin \n");
}
}
