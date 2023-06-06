/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author u180448 En el servicio de Alumno deberemos tener un bucle que crea un
 * objeto Alumno. Se pide toda la información al usuario y ese Alumno se guarda
 * en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro
 * Alumno o no. Después de ese bucle tendremos el siguiente método en el
 * servicio de Alumno: Método notaFinal(): El usuario ingresa el nombre del
 * alumno que quiere calcular su nota final y se lo busca en la lista de
 * Alumnos. Si está en la lista, se llama al método. Dentro del método se usará
 * la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main.
 */
public class AlumnoServicio {

    private List<Alumno> listaAlumnos;

    public AlumnoServicio() {
        listaAlumnos = new ArrayList<>();
    }

    public void crearAlumnos() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();

            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                int nota = scanner.nextInt();
                scanner.nextLine();
                notas.add(nota);
            }

            Alumno alumno = new Alumno(nombre, notas);
            listaAlumnos.add(alumno);

            System.out.print("¿Desea crear otro alumno? (s/n): ");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
    }

    public double notaFinal(String nombreAlumno) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                int suma = 0;
                for (int nota : notas) {
                    suma += nota;
                }
                return (double) suma / notas.size();
            }
        }
        return -1; // Si el alumno no se encuentra en la lista, retornamos -1 para indicar que no se pudo calcular la nota final.
    }
}