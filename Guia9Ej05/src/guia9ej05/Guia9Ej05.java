/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9ej05;

import Entidad.Persona;
import Servicio.PersonaServicios;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Guia9Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicios ps = new PersonaServicios ();
        Persona persona = ps.crearPersona();
        
        System.out.println(persona);
        
        System.out.println("La edad es "+ps.calcularEdad(persona));
        
        System.out.println("es menor? "+ps.menorQue(persona, 33));
        
        ps.mostrarPerona(persona);
        // TODO code application logic here
    }

}