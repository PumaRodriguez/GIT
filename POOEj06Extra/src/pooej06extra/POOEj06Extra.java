/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej06extra;

import Entidad.Rectangulo;

/**
 *
 * @author u180448
 */
public class POOEj06Extra {

    /**
     * @param args the command line arguments
     * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
     */
    public static void main(String[] args) {
        
        // Crear un objeto Rectangulo con lados de 4 y 6
        Rectangulo rectangulo1 = new Rectangulo(4.5, 6.5);
        
        // Calcular y mostrar el área del rectángulo
        double area = rectangulo1.calcularArea();
        System.out.println("El área del rectángulo es: " + area);
    }
        // TODO code application logic here
    }

