package guia4;


import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u180448
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     * Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer numero:"));
        //System.out.println("Ingresa el primer número: ");
        //double num1 = leer.nextDouble();
        double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo numero:"));
       //System.out.println("Ingresa el segundo número: ");
        //double num2 = leer.nextDouble();
        double resultado = 0;
       int operacion;
       do {
        /*  
        System.out.println("INGRESE LA OPERACION A REALIZAR");
        System.out.println("1 SUMAR");
        System.out.println("2 RESTAR ");
        System.out.println("3 MULTIPLICAR ");
        System.out.println("4 DIVIDIR");
        System.out.println("5 SALIR ");
        operacion = leer.nextInt();
        */
        String [ ] arreglo={ "SUMA", "RESTA", "MULTIPLICACION", "DIVIDIR", "SALIR"};
        operacion = JOptionPane.showOptionDialog(null, "Elija la Operacion", "Elije...",0, JOptionPane.QUESTION_MESSAGE,null, arreglo,"");
        switch (operacion) {
            case 0:
                resultado = sumar(num1, num2);
                break;
            case 1:
                resultado = restar(num1, num2);
                break;
            case 2:
                resultado = multiplicar(num1, num2);
                break;
            case 3:
                resultado = dividir(num1, num2);
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null, "operacion no valida");
                //System.out.println("Operación no válida.");
                     
        }
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        //System.out.println("El resultado es: " + resultado);
        } while(operacion != 4);
        JOptionPane.showMessageDialog(null, "*******GRACIAS***********");   
      
      
    }       
     
        
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por Cero");
            //System.out.println("No se puede dividir entre cero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
     
}

        
        // TODO code application logic here
    

