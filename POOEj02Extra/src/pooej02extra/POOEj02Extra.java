/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej02extra;

import Entidad.Puntos;

/**
 *
 * @author u180448
 */
public class POOEj02Extra {

    /**
     * @param args the command line arguments
     * Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.
* distancia(p1,p2)= √ [ ((x2 - x1)^2 + (y2 - y1)^2) ]
     */
    public static void main(String[] args) {
        Puntos puntos = new Puntos(0, 0, 0, 0);
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los puntos es: " + distancia);
        
        // TODO code application logic here
    }

}