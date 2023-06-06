/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia10ej05paises;

import Servicio.PaisService;

/**
 *
 * @author u180448
 */
public class Guia10Ej05Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisService paisService = new PaisService();
        paisService.leerPaises();

        System.out.println("--- Todos los países ---");
        paisService.mostrarPaises();

        System.out.println("--- Países ordenados alfabéticamente ---");
        paisService.ordenarPaisesAlfabeticamente();

        paisService.eliminarPais();
    }
        
        // TODO code application logic here
    }
