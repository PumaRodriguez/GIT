/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej02servicio;


/**
 *
 * @author u180448
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete
Entidades con los atributos capacidadMáxima (la cantidad máxima de
café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Agregar constructor vacío y con
parámetros así como setters y getters. Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.
1.
 */


    /**
     * @param args the command line arguments
     */

import java.util.Scanner;
import Servicio.CafeteraServicio;
public class POOEj02Servicio {
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    CafeteraServicio c1 = new CafeteraServicio();
      c1.llenarCafetera();
      c1.servirTaza();
      c1.vaciarCafetera();
      c1.agregarCafe();



    }

}

