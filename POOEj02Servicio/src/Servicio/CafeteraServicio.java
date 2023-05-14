/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class CafeteraServicio {
    
    Cafetera Cafe = new Cafetera();

    private final Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera() {
        Cafe.setCantidadActual(Cafe.getCapMaxima());
        System.out.println("Se lleno la cafetera");
        return Cafe;
    }

    public Cafetera servirTaza() {
        int Taza = 250;
        if (Taza > Cafe.getCantidadActual()) {
            Cafe.setCantidadActual(Cafe.getCantidadActual() - Taza);
            do {
                Cafe.setCantidadActual(Cafe.getCantidadActual() + 1);
                Taza--;
            } while (Cafe.getCantidadActual() != 0);
            System.out.println("No habia suficiente café en la cafetera, se le sirvio " + Taza);
        } else {
            Cafe.setCantidadActual(Cafe.getCantidadActual() - Taza);
            System.out.println("Se llenó la taza");
        }
        
        return Cafe;
    }
    public Cafetera vaciarCafetera(){
        Cafe.setCantidadActual(0);
        System.out.println("Se vació la cafetera");
        return Cafe;
    }
    public Cafetera agregarCafe(){
        
        System.out.println("Ingrese la cantidad de cafe a agregar");
       // Cafe.setCantidadActual(leer.nextInt());
       int carga = leer.nextInt();
        if (carga > Cafe.getCapMaxima()) {
            System.out.println("Te pasaste emocion");
            
        }else{
            System.out.println("Se cargo exitosamente");
            Cafe.setCantidadActual(carga);
        }
        return Cafe;
    }
}
