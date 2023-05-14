/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author u180448
 * Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
 * 
 */
public class ArregloServicio {
    
    //1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
    //números aleatorios.
    
    public void inicializarA(double[] A) {
        Random r = new Random();
        for(int i = 0; i < A.length; i++) {
            A[i] = r.nextDouble() * 10;
            
        }
        System.out.println(" Inicializo el Arreglo A");
        System.out.println("");
    }
    
    //2) Método mostrar recibe un arreglo por parámetro y lo muestra por
    //pantalla.
    
    
    public void mostrar(double[] arr) {
        System.out.println(Arrays.toString(arr));
        
    }
    
    //3) Método ordenar recibe un arreglo por parámetro y lo ordena de
    //mayor a menor.
    
    public void ordenar(double[] arr) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length/2; i++) {
            double descendente = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1]= descendente;
          
            }
        }
       
    
    
    //4) Método inicializarB copia los primeros 10 números del arreglo A en el
    //arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    
    public void inicializarB(double[] A, double[] B) {
        for(int i = 0; i < 10; i++){
            B[i] = A[i];
        }
        //System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B, 10, B.length, 0.5);
    }
    
    //
}
