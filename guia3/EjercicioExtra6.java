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
public class EjercicioExtra6 {

    /**
     * @param args the command line arguments
     * Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de personas:");
        int personas = leer.nextInt();
        int per = 1;
        double altbaja = 0;
        double altgeneral = 0;
        double sumbaja = 0;
        double sumgeneral = 0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona " + per);
            per++;
            double alt = leer.nextDouble();
            if (alt < 1.60) {
                altbaja = (altbaja + 1);
                altgeneral = (altgeneral + 1);
                sumbaja = (sumbaja + alt);
                sumgeneral = (sumgeneral + alt);
            } else {
                altgeneral = (altgeneral + 1);
                sumgeneral = (sumgeneral + alt);
            }
        }
        System.out.println("Altura promedio menor a 1.60: " + (sumbaja / altbaja));
        System.out.println("Altura promedio general: " + (sumgeneral / altgeneral));
    }
}
        // TODO code application logic here
    

