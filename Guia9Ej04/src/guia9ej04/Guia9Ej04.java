/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia9ej04;

import Servicio.FechaService;
import java.util.Date;

/**
 *
 * @author u180448
 */
public class Guia9Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fechaService = new FechaService();

        Date fechaNacimiento = fechaService.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);

        Date fechaActual = fechaService.fechaActual();
        System.out.println("Fecha actual: " + fechaActual);

        int edad = fechaService.diferencia(fechaActual, fechaNacimiento);
        System.out.println("Edad: " + edad + " años");
    }
}
        // TODO code application logic here