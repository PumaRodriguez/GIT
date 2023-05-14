/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import static POOEj01.Ejercicio1_Libro.leer;


    public class Libro {   /// Crear una Clase Libro con los atributos 
    
    public String ISBN;
    public String titulo;
    public String autor;
    public int numPag;
    
    // Metodo Contructor Vacio
   public Libro() {
   }
   
    // Metodo Contructor con los atributos pasado por parametros
    public Libro(String ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    // Metodo para cargar el Libro.
    public void cargarLibro(){
        
        System.out.println("Ingrese el ISBN ");
        ISBN = leer.nextLine();
        System.out.println("Ingrese el titulo");
        titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        autor = leer.nextLine();
        System.out.println("Ingrese el numero de paginas");
        numPag = leer.nextInt();
        
                
    }
    
        
  /// Metodo Mostrar Libro cargado
    public void imprimirLibro(){
        System.out.println("ISBN: "  + ISBN);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + numPag);
    }
    }
