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
public class Cancion {      /// se crea la Clase Cancion con atributos privados Titulo y Autor
   
    private String titulo;
    private String autor;
    
    // Constructor vacío
    public Cancion() {
        // Inicializa los atributos a cadenas vacías
        this.titulo = "";
        this.autor = "";
    }
    
    // Constructor que recibe los parámetros título y autor
    public Cancion(String titulo, String autor) {
        // Asigna los valores de los parámetros a los atributos correspondientes
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Métodos getters y setters para el atributo titulo
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // Métodos getters y setters para el atributo autor
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
