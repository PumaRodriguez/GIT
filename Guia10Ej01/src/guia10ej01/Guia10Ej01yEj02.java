/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author u180448 Diseñar un programa que lea y guarde razas de perros en un
 * ArrayList de tipo String. El programa pedirá una raza de perro en un bucle,
 * el mismo se guardará en la lista y después se le preguntará al usuario si
 * quiere guardar otro perro o si quiere salir. Si decide salir, se mostrará
 * todos los perros guardados en el ArrayList.
 */
public class Guia10Ej01yEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> razasPerros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la raza del perro: ");
            String raza = scanner.nextLine();
            razasPerros.add(raza);

            System.out.print("¿Desea ingresar otra raza de perro? (s/n): ");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        
        mostrarListaPerros(razasPerros);

       /* System.out.println("Perros guardados:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }*/

        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        
        
        System.out.print("Ingrese el perro a eliminar: ");
        String perroEliminar = scanner.nextLine();

        Iterator<String> iterator = razasPerros.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            String raza = iterator.next();

            if (raza.equalsIgnoreCase(perroEliminar)) {
                iterator.remove();
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Perro eliminado. Lista de perros actualizada:");
            mostrarListaPerros(razasPerros);
        } else {
            System.out.println("El perro no se encuentra en la lista. Lista de perros actual:");
            mostrarListaPerros(razasPerros);
        }
    }

    private static void mostrarListaPerros(ArrayList<String> razasPerros) {
        Collections.sort(razasPerros);
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }

// TODO code application logic here
}
