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
public class Ejercicio1VarianteMetodo {

    /**
     * @param args the command line arguments
     * Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
     */
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
    
    
   
   
   int menu;
    
    do{
        
    
        System.out.println("Menu MaxSangre");
        System.out.println("1.suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. dividir");
        System.out.println("5. salir");
        
        System.out.println("Seleccione Operacion: ");
        menu = leer.nextInt();
        
        switch (menu){
            case 1:
                suma() ;
                break;
                case 2:
                resta() ;
                break;
                case 3:
                multiplicacion();
                break;
                case 4:
                dividir();
                break;
                case 5:
                 break;
                default:
                    System.out.println("Opcion Invalida Gil");
        }
        
    }while(menu != 5);
    System.out.println("El Programa Finalizado");
    }
static void suma(){
System.out.println("Operacion suma");
  System.out.println("Ingrese un numero");
  int num1 = leer.nextInt(); 
  System.out.println("Ingrese el segundo numero");
  int num2 = leer.nextInt(); 
int r = num1 + num2;
System.out.println("El resultado es: " + r);
}
static void resta(){
System.out.println("Operacion resta");
  System.out.println("Ingrese un numero");
  int num1 = leer.nextInt(); 
  System.out.println("Ingrese el segundo numero");
  int num2 = leer.nextInt(); 
int r = num1 - num2;
System.out.println("El resultado es: " + r);
}

static void multiplicacion(){
System.out.println("Operacion multiplicacion");
  System.out.println("Ingrese un numero");
  int num1 = leer.nextInt(); 
  System.out.println("Ingrese el segundo numero");
  int num2 = leer.nextInt(); 
int r = num1 * num2;
System.out.println("El resultado es: " + r);
}
static void dividir(){
System.out.println("Operacion division");
  System.out.println("Ingrese un numero");
  int num1 = leer.nextInt(); 
  System.out.println("Ingrese el segundo numero");
  int num2 = leer.nextInt(); 
int r = num1 / num2;
System.out.println("El resultado es: " + r);
}
}
        // TODO code application logic here
    

