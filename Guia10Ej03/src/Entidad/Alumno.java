/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.List;

/**
 *
 * @author u180448 Crear una clase llamada Alumno que mantenga información sobre
 * las notas de distintos alumnos. La clase Alumno tendrá como atributos, su
 * nombre y una lista de tipo Integer con sus 3 notas.
 */
public class Alumno {

    private String nombre;
    private List<Integer> notas;

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }
    
}
