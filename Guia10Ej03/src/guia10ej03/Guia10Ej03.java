/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia10ej03;

import Servicio.AlumnoServicio;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Guia10Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoServicio alumnoService = new AlumnoServicio();
        alumnoService.crearAlumnos();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = scanner.nextLine();

        double notaFinal = alumnoService.notaFinal(nombreAlumno);
        if (notaFinal != -1) {
            System.out.println("La nota final del alumno " + nombreAlumno + " es: " + notaFinal);
        } else {
            System.out.println("El alumno " + nombreAlumno + " no se encuentra en la lista.");
        }
    }
        
        // TODO code application logic here
    }

