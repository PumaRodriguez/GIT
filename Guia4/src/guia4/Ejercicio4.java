package guia4;


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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo,
17 si es primo.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        System.out.println(primo(num));
    }
    public static boolean primo(int num){
        int mod, aux;
        aux = 0;
        for (int i = 1; i < num; i++) {
            mod = (num % i);
            if (mod == 0) {
                aux++;
            }
        }
        return aux <= 1;
        
        // TODO code application logic here
    }

}