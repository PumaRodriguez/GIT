/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.cursoEntidad;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class cursoServicio {
     private final Scanner leer = new Scanner(System.in);
    cursoEntidad c1 = new cursoEntidad();

    public String[] cargarAlumnos() {
        String alumno[] = new String[5];
        for (int i = 0; i < alumno.length; i++) {
            System.out.println("Ingresa el alumno " + (i+1) + ": ");
            alumno[i] = leer.next();

        }
        return alumno;
    }

    /*Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
    En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
   private String nombreCurso;
    private double cantHorasxDia;
    private int cantidadDiasxSemana;
    private String turno;
    private double precioxHora;
    private String[] alumnos=new String[6]; */
    public void crearCurso() {
        System.out.println("Asignar nombre al curso");
        c1.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día");
        c1.setCantHorasxDia(leer.nextDouble());
        System.out.println("Ingrese cantidad de días por semana");
        c1.setCantidadDiasxSemana(leer.nextInt());
            System.out.println("Ingrese M para asignar turno mañana o T para turno tarde");
            c1.setTurno(leer.next());
       // if (c1.getTurno().equalsIgnoreCase("m") || c1.getTurno().equalsIgnoreCase("t")) {
        //}
        System.out.println("Ingrese precio por hora");
        c1.setPrecioxHora(leer.nextDouble());
        c1.setAlumnos(cargarAlumnos());
        System.out.println(Arrays.toString(c1.getAlumnos()));
    }
    public double calcularGananciaSemanal(){
        return c1.getCantHorasxDia() * c1.getCantidadDiasxSemana() * c1.getPrecioxHora() * c1.getAlumnos().length;
    }
}


