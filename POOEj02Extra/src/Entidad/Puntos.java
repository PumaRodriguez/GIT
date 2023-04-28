/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Puntos {       // Definimos la clase Puntos y los 4 atributos (Puntos)
    
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    

    // Metodo constructor pasando atributos
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
// Metodo Crear Puntos, Acá se solicita al usuario ingresar los puntos a calcular
    public void crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la coordenada X1: ");
        this.x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada Y1: ");
        this.y1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada X2: ");
        this.x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada Y2: ");
        this.y2 = scanner.nextDouble();
        scanner.close();
    }
    
// Metodo calcular Distancia, Se utiliza llama a la clase Math. disponible en java. Idem Clase Scanner
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
        return distancia;
    }
}
