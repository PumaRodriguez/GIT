/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package POOEj01;

import Entidad.Libro;
import java.util.Scanner;


/**
 *
 * @author u180448
 */
public class Ejercicio1_Libro {

public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
         // TODO code application logic here
        //Crear una clase llamada Libro que contenga los siguientes atributos: 
        //ISBN, Titulo, Autor, Numero de paginas, y un constructor con todos los atributos pasados 
        //por parametro y un constructor vacio. Crear un metodo para cargar un libro pidiendo los datos 
        //al usuario y luego informar mediante otro metodo el numero de ISBN, el titulo, el autor del libro y el numero de paginas.
       
        Libro n1 = new Libro("hola","jose","lola", 1000 );
        Libro n2 = new Libro();
        System.out.println("Voy a mostrar el n1 ya cargado");
        
        n1.imprimirLibro();
        
        System.out.println(" **************** ");
        
        System.out.println(" Cargar el segundo Libro");
          n2.cargarLibro();
       
          //n1.imprimirLibro();
          System.out.println(" segundo libro");
          n2.imprimirLibro();
        
          
    }
        // TODO code application logic here
    }

