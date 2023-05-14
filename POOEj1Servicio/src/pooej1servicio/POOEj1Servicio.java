/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej1servicio;


import Servicio.CuentaBancariaServicio;

/**
 *
 * @author u180448
 */
public class POOEj1Servicio {

    /**
     * @param args the command line arguments
     * Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo),
saldoActual. Agregar constructor vacío, con parámetros, getters y
setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
     */
    public static void main(String[] args) {
        
     
CuentaBancariaServicio servicio1 = new CuentaBancariaServicio();

// Crear una cuenta bancaria
servicio1.crearCuenta();
       

// Mostrar el saldo actual de la cuenta
servicio1.consultarSaldo();
      

// Mostrar todos los datos de la cuenta
servicio1.consultarDatos();
       

// Ingresar Dinero
servicio1.ingresar();
        

// Retirtar Dinero
servicio1.retirar();
       

// Retiro Rapido 
servicio1.extraccionRapida();
       
     
    }
}


