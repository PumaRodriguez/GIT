/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej01extra;

import Entidad.Cancion;

/**
 *
 * @author u180448
 */
public class POOEj01Extra {

    /**
     * @param args the command line arguments
     * Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
     */
    public static void main(String[] args) {
        
Cancion cancion1 = new Cancion(); // Constructor vacío
Cancion cancion2 = new Cancion("Hola Mundo", "Yo"); // Constructor con parámetros
       

System.out.println(" Titulo de la cancion2: " + cancion2.getTitulo());
System.out.println("Autor de la cancion2: " + cancion2.getAutor());

cancion1.setTitulo("Hola Mundo Remix - Otro título de la canción");  // Ingresa el Titulo con set
cancion1.setAutor("YOx2 - Otro autor de la canción"); // Ingresamos el Autor set

System.out.println(" Titulo Cancion1: " + cancion1.getTitulo()); // vemos el Titulo con get
System.out.println(" Autor Cancion1: " + cancion1.getAutor()); // vemos el Autor con get



        // TODO code application logic here
    }

}