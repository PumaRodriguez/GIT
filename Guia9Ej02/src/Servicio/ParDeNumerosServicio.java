/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.ParDeNumeros;

/**
 *
 * @author u180448
 * Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
 */
public class ParDeNumerosServicio {
    
    //a) Método mostrarValores que muestra cuáles son los dos números guardados.
    
    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println("El valor del primer número es: " + numeros.getNum1());
        System.out.println("El valor del segundo número es: " + numeros.getNum2());
    }
    
    //b) Método devolverMayor para retornar cuál de los dos atributos tieneel mayor valor
    
    public double devolverMayor(ParDeNumeros numeros) {
        return Math.max(numeros.getNum1(), numeros.getNum2());
    }
    
    //c) Método calcularPotencia para calcular la potencia del mayor valor de
    //la clase elevado al menor número. Previamente se deben redondear
    //ambos valores.
    
    public double calcularPotencia(ParDeNumeros numeros) {
        double mayor = devolverMayor(numeros);
        double menor = Math.min(numeros.getNum1(), numeros.getNum2());
        //mayor = Math.round(mayor);
        //menor = Math.round(menor);
        return Math.pow(mayor, menor);
    }
    
    //d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
    //dos valores. Antes de calcular la raíz cuadrada se debe obtener el
    //valor absoluto del número.
    
    public double calculaRaiz(ParDeNumeros numeros) {
        double num1 = Math.abs(numeros.getNum1());
        double num2 = Math.abs(numeros.getNum2());
        double menor = Math.min(num1, num2);
        return Math.sqrt(menor);
    }
}
