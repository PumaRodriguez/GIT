/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author u180448
 */
public class Empleado {      // Se crea la clase Empleado con los atriburos, Nombre, Edad, salario.
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {   // Metodo constructor con parametros
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {   // Metodo Constructor Vacio. para empleado solicitando Datos en el Main
    }

    

    public void setNombre(String nombre) {  // metodo GET / SET nombre
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {  // Metodo GET / SET Edad
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setSalario(double salario) {   // Metodo GET/SET Salario
        this.salario = salario;
    }

    public double getSalario() { 
        return salario;
    }

    public double calcular_aumento() {   // Metodo Calcular Aumento. 
        double aumento;
        if (edad > 30) {
            aumento = salario * 0.1;
        } else {
            aumento = salario * 0.05;
        }
        return aumento;
    }
}
