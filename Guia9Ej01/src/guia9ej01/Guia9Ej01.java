/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9ej01;

import Endidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Guia9Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.init();

        int menu;

        do {

            System.out.println( "\u001B[32m" + " ¡¡EL MENU DE LAS FRASES!!" + "\u001B[32m");
            System.out.println("\u001B[35m" + "------------------------------------------" + "\u001B[35m");
            System.out.println("\u001B[36m" + "1. Ver cuantas vocales tiene tu frase \n"
                    + "\u001B[36m"+  "2. Inverti tu frase (Gratis)  \n"
                    + "\u001B[37m"+"3. Cuantas veces se repite una letra \n"
                    + "\u001B[37m"+"4. Comparar longitud de frases \n"
                    + "\u001B[33m"+"5. Uni tu frase \n"
                    + "\u001B[37m"+"6. Reemplaza la letra A de tu frase por el caracter deseado  \n"
                    + "\u001B[36m"+ "7. Busca una letra en tu frase \n"
                    + "8. Salir"  + "\u001B[36m");
              System.out.println("\u001B[31m"+ "Ingrese la opcion"+ "\u001B[31m");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("La cantidad de vocales son: "+cs.mostrarVocales(c1));
                    System.out.println("");
                    break;
                case 2:
                    cs.invertirFrase(c1);
                    System.out.println("");
                    break;
                case 3:
                    cs.vecesRepetido(c1);
                    System.out.println("");
                    break;
                case 4:
                    cs.compararLongitud(c1);
                    System.out.println("");
                    break;
                case 5:
                    cs.unirFrases(c1);
                    System.out.println("");
                    break;
                case 6:
                    cs.reemplazar(c1);
                    System.out.println("");
                    break;
                case 7:
                    cs.contiene(c1);
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    
                    break;
                default:
                    System.out.println("Ingreseaste mal una opción del menú, aprendé a contar");
            }

        } while (menu != 8);

    }

    }

