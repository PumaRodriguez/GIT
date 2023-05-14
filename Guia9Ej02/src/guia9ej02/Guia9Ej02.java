/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9ej02;

import Entidad.ParDeNumeros;
import Servicio.ParDeNumerosServicio;

/**
 *
 * @author u180448
 */
public class Guia9Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ParDeNumeros numeros = new ParDeNumeros();
    ParDeNumerosServicio servicio = new ParDeNumerosServicio();
    
    servicio.mostrarValores(numeros);
    System.out.println("El número mayor es: " + servicio.devolverMayor(numeros));
    System.out.println("La potencia del mayor número elevado al menor es: " + servicio.calcularPotencia(numeros));
    System.out.println("La raíz cuadrada del menor de los dos números es: " + servicio.calculaRaiz(numeros));
        // TODO code application logic here
    }

}