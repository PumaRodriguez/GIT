/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia10ej01variante;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Guia10Ej01Variante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
              Scanner leer = new Scanner(System.in);
        ArrayList<String> perro = new ArrayList<>();
        String opc;

        do {
            System.out.println("Ingrese la raza del perro");
            perro.add(leer.nextLine());
            System.out.println("Desea Ingresar otra raza S o N");
            opc = leer.nextLine();
        } while (opc.equalsIgnoreCase("S"));
        mostrar(perro);


    }

    public static void mostrar(ArrayList<String> perro) {
        for (String e : perro) {
            System.out.println("La raza es: " + e);
        }
    }
        // TODO code application logic here
    }

