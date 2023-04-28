/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej04extra;

import Entidad.Cuenta;



/**
 *
 * @author u180448
 */
public class POOEj04Extra {

    /**
     * @param args the command line arguments
     * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
     */
    public static void main(String[] args) {
        
        // Crear cuenta con un saldo inicial de $500 y titular "Juan"
        Cuenta cuenta1 = new Cuenta("Juan",500);
        
        // Imprimir información de la cuenta
        System.out.println("Cuenta de " + cuenta1.getTitular() + " con saldo inicial de $" + cuenta1.getSaldo());
        
        // Retirar $100 de la cuenta
        cuenta1.retirar_dinero(100);
        
        // Imprimir información de la cuenta después del retiro
        System.out.println("Cuenta de " + cuenta1.getTitular() + " después de retirar $100: $" + cuenta1.getSaldo());
        
        // Retirar $600 de la cuenta (más de lo que hay)
        cuenta1.retirar_dinero(600);
        
        // Imprimir información de la cuenta después del segundo retiro
        System.out.println("Cuenta de " + cuenta1.getTitular() + " después de intentar retirar $600: $" + cuenta1.getSaldo());
    }
        // TODO code application logic here
    }

