/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.CuentaBancaria;
import java.util.Scanner;



/**
 *
 * @author u180448
 */
public class CuentaBancariaServicio {
     CuentaBancaria cuenta = new CuentaBancaria();
    Scanner leer = new Scanner(System.in);
    
public  CuentaBancaria crearCuenta () { // Metodo servicio Crear cuenta
        
        //System.out.println("Cuenta:" +cuenta.getNumeroCuenta());
         
        System.out.println("Ingrese el número de cuenta: ");
        
        cuenta.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese el DNI del cliente: ");
        
        cuenta.setDniCliente(leer.nextLong());
        
        System.out.println("Ingrese el saldo inicial: ");
        
        cuenta.setSaldoActual(leer.nextDouble());
        
        return cuenta;
    }


    public void ingresar() {   // Metodo servicio ingresar Dinero
        System.out.println(" Ingrese el monto a depositar");
        
       double monto = leer.nextDouble();
        
      //double saldoActual = cuenta.getSaldoActual();
        cuenta.setSaldoActual(cuenta.getSaldoActual()+monto);
       // cuenta.setSaldoActual(saldoActual);
        System.out.println("Se ha ingresado $" + monto + " a la cuenta " + cuenta.getNumeroCuenta()
        + " \nSaldo actual: " + cuenta.getSaldoActual());
        
        
    }

    public void retirar() {    //Metodo sercicio retirar Dinero
        System.out.println("Ingrese el monto a Retirar");
        double monto = leer.nextDouble();
        double saldoActual = cuenta.getSaldoActual();
        if (monto <= saldoActual) {
            saldoActual -= monto;
            cuenta.setSaldoActual(saldoActual);
            System.out.println("Se ha retirado $" + monto + " de la cuenta " + cuenta.getNumeroCuenta());
        } else {
            cuenta.setSaldoActual(0);
            System.out.println("No se puede retirar $" + monto + " de la cuenta " + cuenta.getNumeroCuenta() 
                               + "\n. Se ha retirado el máximo posible hasta dejar la cuenta en 0.");
            System.out.println(" El saldo de su cuenta es:" + cuenta.getSaldoActual());
        }
    }

    public void extraccionRapida() {   // Metodo servicio Extraccion Rapida 20% Saldo
        System.out.println(" La extraccion rapida es solo del 20% de su saldo");
        double saldoActual = cuenta.getSaldoActual();
        double limite = saldoActual * 0.2;
        System.out.println("El límite de extracción rápida es de $" + limite + " y el Saldo actual es: " + cuenta.getSaldoActual());
        System.out.println("Ingrese la cantidad a retirar: ");
        double monto = leer.nextDouble();
        if (monto <= limite) {
            saldoActual -= monto;
            cuenta.setSaldoActual(saldoActual);
            System.out.println("Se ha retirado $" + monto + " de la cuenta " + cuenta.getNumeroCuenta() 
                               + " mediante extracción rápida." + "Saldo Actual:" + cuenta.getSaldoActual());
        } else {
            System.out.println("No se puede retirar $" + monto + " de la cuenta " + cuenta.getNumeroCuenta() 
                               + " mediante extracción rápida. El monto supera el límite permitido de $" + limite + "Saldo Actual: " + cuenta.getSaldoActual());
        }
    }

    public void consultarSaldo() {        //Metodo servicio Consiultar Saldo
        System.out.println("El Saldo es: " + cuenta.getSaldoActual());
    }

    public void consultarDatos() {       //Metodo servicio Consultar Datos.
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: $" + cuenta.getSaldoActual());
    }
 
}
