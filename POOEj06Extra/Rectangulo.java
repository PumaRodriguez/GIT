/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author u180448
 */
public class Rectangulo {
                                         // clase Rectangulo con Atributos
    private final double lado1;
    private final double lado2;
    
                                                // Constructor con parametros
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
                                                 // Método para calcular el área
    public double calcularArea() {
        return (lado1 * lado2);
    }
}

