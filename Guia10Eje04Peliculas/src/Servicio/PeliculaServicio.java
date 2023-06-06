/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import Servicio.Utilidad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Utilidad u1 = new Utilidad();
    boolean respuesta = true;
    private ArrayList<Pelicula> peliculas = new ArrayList();

    public void init() {

        do {
            Pelicula p1 = new Pelicula();

            System.out.println("Ingrese el nombre de la pelicula : ");
            p1.setTitulo(leer.next());

            System.out.println("Ingrese el nombre del director de la pelicula: ");
            p1.setDirectorPelicula(leer.next());

            System.out.println("Ingrese la duración de la pelicula: ");
            p1.setDuracionPelicula(leer.nextDouble());
            
            peliculas.add(p1);

            respuesta = u1.verificarDato();

        } while (respuesta);

    }

    //Mostrar en pantalla todas las películas.
    public void mostrarPelicula() {

        for (Pelicula peli : peliculas) {
            System.out.println("Las pelicula/s son: \n" + peli);

        }

    }

    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    
    public void mostrarPeliculaSuperior() {
        
        for (Pelicula peli : peliculas) {
            if (peli.getDuracionPelicula() > 1){
                System.out.println("Las pelicula/s con una duración mayor a una hora son: \n" + peli);
            }
        }

    }

    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void ordenarPeliculaMayor(Pelicula p1) {
        System.out.println("Peliculas ordenadas de menor a mayor:\n ");
        Comparator<Pelicula> compa;
        compa = Comparator.comparing(Pelicula::getDuracionPelicula);
        Collections.sort(peliculas, compa);
        mostrarPelicula();
    }

    //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
    public void ordenarPeliculaMenor(Pelicula p1) {
        System.out.println("Peliculas ordenadas de mayor a menor: \n");
        Comparator<Pelicula> compa;
        compa = Comparator.comparing(Pelicula::getDuracionPelicula);
        Collections.sort(peliculas, compa.reversed());
        mostrarPelicula();
    }

    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarTitulo(Pelicula p1) {
        System.out.println("Peliculas ordenadas alfabeticamente: \n");
        Comparator<Pelicula> compa;
        compa = Comparator.comparing(Pelicula::getTitulo);
        Collections.sort(peliculas, compa);
        mostrarPelicula();

    }

    public void ordenarDirector(Pelicula p1) {
        System.out.println("Director de la pelicula ordenado alfabeticamente:\n");
        Comparator<Pelicula> compa;
        compa = Comparator.comparing(Pelicula::getDirectorPelicula);
        Collections.sort(peliculas, compa);
        mostrarPelicula();
    }

}
