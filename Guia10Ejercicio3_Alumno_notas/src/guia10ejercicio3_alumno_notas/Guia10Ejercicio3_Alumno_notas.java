/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia10ejercicio3_alumno_notas;

import java.util.ArrayList;
import Servicio.AlumnoService;

/**
 *
 * @author u180448
 */
public class Guia10Ejercicio3_Alumno_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         AlumnoService a1 = new AlumnoService();
          a1.CrearAlumnos();
          a1.MostrarAlumno();
          a1.BuscaAlumno();
         // System.out.println(a1.BuscaAlumno());
          
        // TODO code application logic here
    }

}