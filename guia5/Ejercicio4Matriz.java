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
public class Ejercicio4Matriz {

    /**
     * @param args the command line arguments
     * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa).
     */
    public static void main(String[] args) {
        Random azar = new Random();
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                matriz[i][j]= azar.nextInt(10);
            }
        }
       
        System.out.println("Matriz A");
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print("[" + matriz[i][j] + "]");
                
            }
            System.out.println("");
            }
        System.out.println("");
        
        System.out.println("Matriz B Traspuesta"); 
         for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print("[" + matriz[j][i] + "]");
                
            }
             System.out.println("");
        // TODO code application logic here
    }
        System.out.println("");
}
}