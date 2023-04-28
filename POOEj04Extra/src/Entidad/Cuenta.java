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
public class Cuenta {    // Se crea la Clase Cuenta y atributos titular y Saldo
    private String titular;
    private double saldo;

    // Metodo constructor vacio
    public Cuenta() {
    }

    // Metodo constructor con parametros
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Metodo Get para ver titular y saldo
    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Metodo Set para Titular y saldo
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
// Metodo Retirar Dinero
    public void retirar_dinero(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("No hay suficiente saldo para realizar esta operación.");
        }
    }
    
}
