/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class Rectangulo {    /// Cramos la clase Rectangulo con los atributos
  private double base;
    private double altura;
    
    // Metodo Constructor vacío
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    // Metodo Constructor con parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    // Metodo Getter y setter para base
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //Metodo Getter y setter para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    // Método para crear el rectángulo
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        this.base = leer.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        this.altura = leer.nextDouble();
    }
    
    // Método para calcular la superficie del rectángulo
    public double calcularSuperficie() {
        return this.base * this.altura;
    }
    
    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (this.base + this.altura);
    }
    
    // Método para dibujar el rectángulo con asteriscos
    public void dibujarRectangulo() {
         for (int i = 0; i < this.altura ; i ++) {
             for (int j = 0; j < this.base ; j ++) {
             if (i==0 || j ==0 || j==this.base-1 || i==this.altura-1) {
             System.out.print("* ");
             }else{
                 System.out.print("  ");
             }
             }
             System.out.println();
             }
        
    }
}