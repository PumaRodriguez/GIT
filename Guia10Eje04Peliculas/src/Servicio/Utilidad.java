/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Scanner;

/**
 *
 * @author u180448
 */
class Utilidad {
    static Scanner leer = new Scanner(System.in);
    public boolean verificarDato(){
            boolean aux1 = true;
            boolean respuesta = true;
          do{
                System.out.println("Quieres seguir ingresando datos?  \n"
                    + "S / N");
            String tecla = leer.nextLine();
                
            if (tecla.equalsIgnoreCase("s") || tecla.equalsIgnoreCase("n") ) {
            aux1 = false;
            
            if(tecla.equalsIgnoreCase("n")){
                respuesta = false;
            }else{
                respuesta =  true;
            }
            
            
            }else{
                aux1 = true;
                System.out.println("Ingresaste una letra erronea, intentelo otra vez");
            }
            }while(aux1);
            
          
        return respuesta;
    }
    
    
    
}
