/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author u180448
 * Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números.
 */
public class ParDeNumeros {
    
    // Atributos dos reales
    private double num1;
    private double num2;
    
    //Constructor Vacio con Math.random
    
    public ParDeNumeros() {
        this.num1 = Math.random()*2;
        this.num2 = Math.random()*2;
    }
    
    // Getters y Setters
    
    public double getNum1() {
        return num1;
    }
    
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    
    public double getNum2() {
        return num2;
    }
    
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    
}
