/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9ej06;

import Servicio.CursoServicio;
import Entidad.Curso;

/**
 *
 * @author u180448
 * Un profesor particular está dando cursos para grupos de cinco alumnos
y necesita un programa para organizar la información de cada curso.
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los
siguientes métodos:
 */
public class Guia9Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CursoServicio CS = new CursoServicio();
        
       
        Curso Curso1 = CS.crearCurso(CS.cargarAlumno());
        
        System.out.println("La ganancia de este curso es: "+ CS.calcularGananciaSemanal(Curso1));
               
         //System.out.println(Curso1);
        CS.mostrar(Curso1);
         
    }
    }

