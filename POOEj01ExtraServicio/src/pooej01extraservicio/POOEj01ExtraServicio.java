/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej01extraservicio;

import Entidad.Raices;
import Servicio.RaizServicio;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class POOEj01ExtraServicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leerMain = new Scanner(System.in);

        RaizServicio a1 = new RaizServicio();

        //Raices aux = a1.init();
        //Raices aux2 = a1.init();
        System.out.println("Ingrese cuantos datos quiere ingresar? ");
        int cantidad = leerMain.nextInt();
        Raices aux3[] = new Raices[cantidad];
        for (int i = 0; i < cantidad; i++) {
            aux3[i] = a1.init();
        }

        //System.out.println("El valor del metodo discriminante es:  " +  a1.getDiscriminante(aux));
        //System.out.println("Tiene dos soluciones = " + a1.tieneRaices(aux));
        //Calculamos el valor de las raices
        //a1.obtenerRaices(aux);
        //Calculamos el valor de una sola raiz
        //a1.obtenerRaiz(aux);
        //Hace todo
        for (int i = 0; i < cantidad; i++) {
            System.out.println(aux3[i]);
            a1.calcular(aux3[i]);
        }

    }
}
        /*
        RaizServicio a1 = new RaizServicio();
        
        Raices aux = a1.init();
        
        System.out.println(aux);
        
        //System.out.println("El valor del metodo discriminante es:  " +  a1.getDiscriminante(aux));
        
        //System.out.println("Tiene dos soluciones = " + a1.tieneRaices(aux));
        
        //Calculamos el valor de las raices
        //a1.obtenerRaices(aux);
        
        //Calculamos el valor de una sola raiz
        //a1.obtenerRaiz(aux);
        
        //Hace todo
        a1.calcular(aux);
        // TODO code application logic here
    }

}*/