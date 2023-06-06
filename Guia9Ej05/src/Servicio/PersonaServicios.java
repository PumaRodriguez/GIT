/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class PersonaServicios {
    Scanner leer = new Scanner(System.in);
    
/*Método crearPersona: que pida al usuario Nombre y fecha de nacimiento 
de la persona a crear. Retornar el objeto Persona creado.*/
    
    public Persona crearPersona(){
        Persona p = new Persona();
        String nombre;
        
        int day, month, year;
        System.out.println("Ingrese su nombre: ");
        p.setPersona(leer.nextLine());
        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("Ingrese el día: ");
        day=leer.nextInt();
        System.out.println("Ingrese el mes: ");
        month=leer.nextInt();
        System.out.println("Ingrese el año: ");
        year=leer.nextInt();
        
        Date fecha = new Date(year-1900,month-1,day);
        p.setEdad(fecha);
        return p;
    }

/*
Método calcularEdad: que calcule la edad del usuario utilizando 
el atributo de fecha de nacimiento y la fecha actual.*/
    
    public int calcularEdad(Persona p){
        
        Date fechaActual = new Date();
        int edadPersona;
        edadPersona = fechaActual.getYear() - p.getEdad().getYear();
  
        return edadPersona;

    }
    
/*Método menorQue: recibe como parámetro una Persona y una edad. 
Retorna true si la persona es menor que la edad consultada o false en caso contrario.*/
    
    public boolean menorQue(Persona p, int edad){
        //int edadp = calcularEdad(p);
       
       /* if (edadp < edad) {
            return true;
            
        } else {
            return false;
        }*/
        return calcularEdad(p) < edad ;
    }
    
/*Método mostrarPersona: que muestra la información de la persona deseada.
*/
    
   public void mostrarPerona(Persona p){
       System.out.println("El nombre es "+p.getPersona());
       System.out.println("La fecha de nacimiento es "+p.getEdad());
       System.out.println("La edad es "+calcularEdad(p));
   }
    
}
