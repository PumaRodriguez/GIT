/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author u180448 Se requiere un programa que lea y guarde países, y para
 * evitar que se ingresen repetidos usaremos un conjunto. El programa pedirá un
 * país en un bucle, se guardará el país en el conjunto y después se le
 * preguntará al usuario si quiere guardar otro país o si quiere salir, si
 * decide salir, se mostrará todos los países guardados en el conjunto.
 * (Recordemos hacer los servicios en la clase correspondiente) Después
 * deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
 * cómo se ordena un conjunto. Por último, al usuario se le pedirá un país y se
 * recorrerá el conjunto con un Iterator, se buscará el país en el conjunto y si
 * está en el conjunto se eliminará el país que ingresó el usuario y se mostrará
 * el conjunto. Si el país no se encuentra en el conjunto se le informará al
 * usuario.
 */
public class PaisService {

    private Set<String> paises;
    private Scanner scanner;

    public PaisService() {
        paises = new HashSet<>();
        scanner = new Scanner(System.in);
    }

    public void leerPaises() {
        boolean continuar = true;

        do {
            System.out.print("Ingrese el nombre de un país: ");
            String pais = scanner.nextLine();

            paises.add(pais);

            System.out.print("¿Desea ingresar otro país? (s/n): ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "s":
                    break;
                case "S":
                    break;
                case "n":
                    continuar = false;
                    break;
                case "N":
                    continuar = false;
                    break;
                default:

                    do {
                        System.out.println("Ingrese una opcion valida (S/N)");
                        opcion = scanner.next();
                        if ((opcion.equalsIgnoreCase("s")) || (opcion.equalsIgnoreCase("n"))) {
                            continuar = false;
                        }
                    } while (continuar);
                    break;

            }

        } while (continuar);
    }

    public void mostrarPaises() {
        System.out.println("Países guardados:");

        for (String pais : paises) {
            System.out.println(pais);
        }
    }

    public void ordenarPaisesAlfabeticamente() {
        TreeSet<String> paisesOrdenados = new TreeSet<>(paises);

        System.out.println("Países ordenados alfabéticamente:");

        for (String pais : paisesOrdenados) {
            System.out.println(pais);
        }
    }

    public void eliminarPais() {
        System.out.print("Ingrese el nombre de un país para eliminarlo: ");
        String paisEliminar = scanner.nextLine();

        Iterator<String> iterator = paises.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            String pais = iterator.next();

            if (pais.equalsIgnoreCase(paisEliminar)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El país '" + paisEliminar + "' ha sido eliminado.");
        } else {
            System.out.println("El país '" + paisEliminar + "' no se encuentra en el conjunto.");
        }

        mostrarPaises();

        /*System.out.println("Países restantes:");

        for (String pais : paises) {
            System.out.println(pais);
        }*/
    }
}
