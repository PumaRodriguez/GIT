/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Juego {
     private int numJugador1;
    private int numJugador2;
    private int intentosMaximos;
    private int intentosJugador2;
    private int ganadosJugador1;
    private int ganadosJugador2;
    
    public Juego(int intentosMaximos) {
        this.intentosMaximos = intentosMaximos;
    }
    
    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        
        int opcion = 1;
        while (opcion == 1) {
            // Jugador 1 elige un número
            System.out.print("Jugador 1, elige un número: ");
            numJugador1 = leer.nextInt();
            
            // Jugador 2 intenta adivinar el número
            intentosJugador2 = 0;
            do {
                System.out.print("Jugador 2, adivina el número: ");
                numJugador2 = leer.nextInt();
                intentosJugador2++;
                
                if (numJugador2 > numJugador1) {
                    System.out.println("Más bajo.");
                } else if (numJugador2 < numJugador1) {
                    System.out.println("Más alto.");
                } else {
                    System.out.println("¡Adivinaste el número en " + intentosJugador2 + " intentos!");
                    ganadosJugador2++;
                    break;
                }
            } while (intentosJugador2 < intentosMaximos);
            
            if (intentosJugador2 == intentosMaximos) {
                System.out.println("¡Se acabaron los intentos! El número era " + numJugador1 + ".");
                ganadosJugador1++;
            }
            
            // Preguntar si quieren jugar de nuevo
            System.out.print("¿Quieren jugar de nuevo? (1 = sí, 0 = no): ");
            opcion = leer.nextInt();
        }
        
        // Mostrar resultados
        System.out.println("Resultados:");
        System.out.println("Jugador 1 ganó " + ganadosJugador1 + " veces.");
        System.out.println("Jugador 2 ganó " + ganadosJugador2 + " veces.");
    }
    
}
