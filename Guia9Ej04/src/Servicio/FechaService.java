/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

/**
 *
 * @author u180448
 * Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
 */

import java.util.Date;
import java.util.Scanner;


public class FechaService {
    
    Scanner scanner = new Scanner(System.in);
    

    public Date fechaNacimiento() {
        System.out.print("Ingrese el día de su nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de su nacimiento: ");
        int mes = scanner.nextInt() - 1; // Restamos 1 porque los meses en Java se representan de 0 a 11

        System.out.print("Ingrese el año de su nacimiento: ");
        int anio = scanner.nextInt() - 1900; // Restamos 1900 porque en Java se cuenta a partir de 1900

        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }
         // Calculamos la diferencia en años aproximada
    public int diferencia(Date fecha1, Date fecha2) {
        long diferenciaMillis = fecha1.getTime() - fecha2.getTime();
        long diferenciaAnios = diferenciaMillis / (1000L * 60 * 60 * 24 * 365); 

        return (int) diferenciaAnios;
    }
}
