/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui9ej02extra;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicios;

/**
 *
 * @author u180448
 */
public class Guia9Ej02extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AhorcadoServicios ahorcadoServicio = new AhorcadoServicios();

        Ahorcado ahorcado = ahorcadoServicio.crearJuego();

        ahorcadoServicio.longitud(ahorcado);

        ahorcadoServicio.juego(ahorcado);
    }
        // TODO code application logic here
    }

