/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class AlumnoService {

    private ArrayList<Alumno> Arrayalumno = new ArrayList();

    private final Scanner leer = new Scanner(System.in);

    public void CrearAlumnos() {
        String op;

        do {
            
            Alumno alu = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            alu.setNombre(leer.next());

            System.out.println("");

            ArrayList<Integer> notas = new ArrayList();

            System.out.println("ingrese las 3 notas del alumno");

            for (int i = 1; i <= 3; i++) {

                System.out.println("Ingrese la " + i + " nota");
                notas.add(leer.nextInt());
            }
            alu.setNotas(notas);

            Arrayalumno.add(alu);

            System.out.println("desea ingresar otro Alumno S/N");
            op = leer.next();
        } while (!op.equalsIgnoreCase("n"));
    }

    public void MostrarAlumno() {

        System.out.println("La lista de alumno es: ");

        for (Alumno aux : Arrayalumno) {

            System.out.println(aux.toString());

        }

    }

    public void BuscaAlumno() {

        System.out.println("Ingrese el Alumno para calcular la ");
        String nombre_alumno = leer.next();

        for (Alumno aux : Arrayalumno) {

            if (aux.getNombre().equalsIgnoreCase(nombre_alumno)) {

                //NotaFinal(aux.getNotas());
                System.out.println(NotaFinal(aux.getNotas()));

            }

        }

    }

   /* public void NotaFinal(ArrayList<Integer> notas) {
        int sumanotas = 0;

        for (Integer suma : notas) {

            sumanotas += suma;

        }

        System.out.println(sumanotas / 3.0);
        
    }*/
    
     public double NotaFinal(ArrayList<Integer> notas) {
        int sumanotas = 0;

        for (Integer suma : notas) {

            sumanotas += suma;

        }

        return sumanotas / 3.0;
        
    }
}
