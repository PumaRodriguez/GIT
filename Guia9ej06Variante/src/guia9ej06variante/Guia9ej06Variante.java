/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9ej06variante;

import Servicio.cursoServicio;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Guia9ej06Variante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    cursoServicio c1 = new cursoServicio();
      //  System.out.println(c1.cargarAlumnos());
      c1.crearCurso();
        System.out.println("La ganancia semanal seria: $"+c1.calcularGananciaSemanal());


    }

}
        // TODO code application logic here
    

