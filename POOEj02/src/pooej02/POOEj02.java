/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej02;

import Entidad.Circunferencia;


/**
 *
 * @author u180448
 */
public class POOEj02 {

    /**
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
     * @param args
     */
    public static void main(String[] args) {
        
        // Forma de acceder a la class Circuenferencia
        
Circunferencia circunferencia1 = new Circunferencia();
circunferencia1.crearCircunferencia();
System.out.println("Radio de la circunferencia 1: " + circunferencia1.getRadio());
System.out.println("Área de la circunferencia 1: " + circunferencia1.area());
System.out.println("Perímetro de la circunferencia 1: " + circunferencia1.perimetro());

Circunferencia circunferencia2 = new Circunferencia(5);
System.out.println("Radio de la circunferencia 2: " + circunferencia2.getRadio());
System.out.println("Área de la circunferencia 2: " + circunferencia2.area());
System.out.println("Perímetro de la circunferencia 2: " + circunferencia2.perimetro());

Circunferencia circulo1 = new Circunferencia();  // Para pasar sin valor debe estare creado el constructor vacio.
circulo1.crearCircunferencia();  /// me pide ingresar el valor del Radio
System.out.println(circulo1.getRadio()); // voy a ver el valor que tiene radio
circulo1.setRadio(10); // voy a cargar el nuevo valor del Radio
System.out.println(circulo1.getRadio());
System.out.println(circulo1.perimetro());
 System.out.println(circulo1.area());



        
        // TODO code application logic here
    }

}