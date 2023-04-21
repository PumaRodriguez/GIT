package guia4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u180448
 */
public class Ejercicio1Variantem_metodo2 {

    /**
     * @param args the command line arguments}
     * Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opcion;
        int resultado, numero1, numero2;
        System.out.println("ingrese primer numero");
        numero1 = leer.nextInt();
        System.out.println("ingrese segundo numero");
        numero2 = leer.nextInt();
        do {
            System.out.println("elija la opcion (+) (-) (*) (/)");
            System.out.println("(salir) para salir");
            opcion = leer.next();
            switch (opcion){
                case "+":
                    resultado = suma(numero1, numero2);
                    System.out.println("la suma es: "+resultado);
                    break;
                case "-":
                     resultado = resta(numero1, numero2);
                    System.out.println("la resta es: "+resultado);
                     break;
                case "*":
                     resultado = multiplicacion(numero1, numero2);
                    System.out.println("el producto es: "+resultado);
                     break;
                case "/":
                     double resultados = division(numero1, numero2);
                    System.out.println("el cociente es: "+resultados);
                     break;
               case "salir":
                   //opcion="salir";
                System.out.println("saliendo");
                  break;
                default:
                    System.out.println("opcion incorrecta");
                     break;
            }
        } while ("salir".equalsIgnoreCase(opcion));  

    }
    //equalsIgnoreCase(String str) Sirve para comparar si dos cadenas
//son iguales, ignorando la grafía de la
//palabra. Devuelve true si son iguales
//y false si no.


    public static int suma(int numero1, int numero2) {
        int respuesta = numero1 + numero2;
        return respuesta;
    }
     public static int resta(int numero1, int numero2) {
        int respuesta = numero1 - numero2;
        return respuesta;
    }
      public static int multiplicacion(int numero1, int numero2) {
        int respuesta = numero1 * numero2;
        return respuesta;
    }
       public static double division(int numero1, int numero2) {
        int respuesta = numero1 / numero2;
        return respuesta;
    }
}
        // TODO code application logic here
    

