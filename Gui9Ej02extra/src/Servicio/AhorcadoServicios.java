/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class AhorcadoServicios {
     Scanner scanner = new Scanner(System.in);
     
    

    public Ahorcado crearJuego() {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabraString = scanner.nextLine();
        char[] palabra = palabraString.toCharArray();

        System.out.print("Ingrese la cantidad de jugadas máximas: ");
        int jugadasMaximas = scanner.nextInt();
        scanner.nextLine();

        return new Ahorcado(palabra, jugadasMaximas);
    }

    public void longitud(Ahorcado ahorcado) {
        int longitud = ahorcado.getPalabra().length;
        System.out.println("Longitud de la palabra: " + longitud);
    }

    public boolean buscar(Ahorcado ahorcado, char letra) {
        boolean encontrada = false;

        for (char c : ahorcado.getPalabra()) {
            if (c == letra) {
                encontrada = true;
                ahorcado.letrasEncontradas++;
            }
        }

        if (encontrada) {
            System.out.println("La letra " + letra + " está en la palabra.");
            System.out.println("Intentos restantes: " + (ahorcado.getJugadasMaximas() - ahorcado.getLetrasEncontradas()));
        } else {
            System.out.println("La letra " + letra + " no está en la palabra.");
            
        }

        return encontrada;
    }

    public void encontradas(Ahorcado ahorcado, char letra) {
        int letrasEncontradas = ahorcado.getLetrasEncontradas();
        int letrasFaltantes = ahorcado.getPalabra().length - letrasEncontradas;

        System.out.println("Letras encontradas: " + letrasEncontradas);
        System.out.println("Letras faltantes: " + letrasFaltantes);
    }

    public void intentos(Ahorcado ahorcado) {
       int intentosRestantes = ahorcado.getJugadasMaximas() - ahorcado.getLetrasEncontradas();
        System.out.println("Intentos restantes: " + intentosRestantes);
        
    }

    public void juego(Ahorcado ahorcado) {
        while (ahorcado.getLetrasEncontradas() < ahorcado.getPalabra().length
                && ahorcado.getLetrasEncontradas() < ahorcado.getJugadasMaximas()) {
            System.out.print("Ingrese una letra: ");
            char letra = scanner.nextLine().charAt(0);

            boolean encontrada = buscar(ahorcado, letra);
            encontradas(ahorcado, letra);

            if (!encontrada) {
                ahorcado.jugadasMaximas--;
                intentos(ahorcado);
            }
        }

        if (ahorcado.getLetrasEncontradas() == ahorcado.getPalabra().length) {
            System.out.println("¡Felicidades! Has encontrado todas las letras. Has ganado el juego.");
            System.out.println(" La Palabra es: " + Arrays.toString(ahorcado.getPalabra()));
        } else {
            System.out.println("Te has quedado sin intentos. Has perdido el juego.");
             System.out.println(" La Palabra era: " + Arrays.toString(ahorcado.getPalabra()));
        }



    }
    }