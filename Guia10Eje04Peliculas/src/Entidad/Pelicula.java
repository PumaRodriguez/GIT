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
public class Pelicula {
    
    private String titulo;
    private String directorPelicula;
    private double duracionPelicula;

    public Pelicula() {
    }
    
    public Pelicula(String titulo, String directorPelicula, double duracionPelicula) {
        this.titulo = titulo;
        this.directorPelicula = directorPelicula;
        this.duracionPelicula = duracionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirectorPelicula() {
        return directorPelicula;
    }

    public void setDirectorPelicula(String directorPelicula) {
        this.directorPelicula = directorPelicula;
    }

    public double getDuracionPelicula() {
        return duracionPelicula;
    }

    public void setDuracionPelicula(double duracionPelicula) {
        this.duracionPelicula = duracionPelicula;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", directorPelicula=" + directorPelicula + ", duracionPelicula=" + duracionPelicula + '}';
    }
    
    
}


