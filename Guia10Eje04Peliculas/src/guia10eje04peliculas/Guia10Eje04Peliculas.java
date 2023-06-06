/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10eje04peliculas;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;

/**
 *
 * @author u180448
 */
public class Guia10Eje04Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PeliculaServicio ps = new PeliculaServicio();
        Pelicula p1 = new Pelicula();

        System.out.println("*****CARGAR PELICUA/S******");
        ps.init();
        System.out.println("****MOSTRAR PELICULAS*****");
        ps.mostrarPelicula();
        System.out.println("***MOSTRAR PELICULAS SUPERIOR A 1 HORA*****");
        ps.mostrarPeliculaSuperior();
       /* System.out.println("***MOSTRAR ORDENADAS DE MAYOR A MENOR TIEMPO****   ");
        ps.ordenarPeliculaMayor(p1);
        System.out.println("***MOSTRAR ORDENADAS DE MENOR A MAYOR TIEMPO****");
        ps.ordenarPeliculaMenor(p1);
        System.out.println(" *** ORDENA ALFABETICAMENTE EL TITULO ****");
        ps.ordenarTitulo(p1);
        System.out.println(" *** ORDENA ALFABETICAMENTE EL DIRECTOR ****");
        ps.ordenarDirector(p1);*/

    }
}
