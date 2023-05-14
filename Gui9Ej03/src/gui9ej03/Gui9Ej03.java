/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui9ej03;

import Servicio.ArregloServicio;

/**
 *
 * @author u180448
 */
public class Gui9Ej03 {

    /**
     * @param args the command line arguments Crear en el Main dos arreglos. El
     * arreglo A de 50 números reales y el arreglo B de 20 números reales.
     * Despues En el Main nuevamente: inicializar A, mostrar A, ordenar A,
     * inicializar B, mostrar A y B.
     *
     *
     */
    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        ArregloServicio service = new ArregloServicio();

        // Inicializar A
        service.inicializarA(A);

        // Mostrar A
        System.out.println("Este es el Arreglo A:");
        service.mostrar(A);
        System.out.println("");

        // Ordenar A
        service.ordenar(A);
        System.out.println("");

        // Mostrar A ordenado
        System.out.println("Arreglo A Ordenado de Mayor a Menor:");
        service.mostrar(A);
        System.out.println("");

        // Inicializar B
        service.inicializarB(A, B);
        System.out.println("");

        // Mostrar B
        System.out.println("Este es el Arreglo B:");
        service.mostrar(B);
        System.out.println("");
    }
    // TODO code application logic here
}
