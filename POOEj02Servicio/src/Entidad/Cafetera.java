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
public class Cafetera {
    private int capMaxima;
    private int cantidadActual;

    public Cafetera() {
        capMaxima = 2000;
    }

    public Cafetera(int capMaxima, int cantidadActual) {
        this.capMaxima = capMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}
