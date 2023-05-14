package guia5;


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
public class Ejericio6CuboMagico {

    /**
     * @param args the command line arguments
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         int matriz[][] = new int [3] [3];
       System.out.println(" Para matriz magica 2, 7, 6, 9, 5, 1, 4, 3, 8 ");
        System.out.println(" Por favor ingrese los numeros de la matriz ");  // Solicita ingresar los numeros
        for (int i = 0; i<3; i++){  
            for (int j = 0; j<3; j++){
                System.out.println(" Ingrese el numero en la Posicion: " + i + j);          
                 matriz[i][j] = leer.nextInt();
                while (matriz[i][j] < 1 || matriz[i][j] > 9) {    // Valida que los numeros ingresados
                    System.out.println("Ingrese un número válido (del 1 al 9):");
                    matriz[i][j] = leer.nextInt();
            }
            }
        }
        System.out.println("***********");   // Muestra como quedo la matriz
         for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            
             System.out.println("");
         }
          System.out.println("**********");
          
          boolean bandera = true;
          int k=-1;
          int vector[] = new int [8];
         
          for (int i = 0; i<3; i++){
              k++;
              for (int j = 0; j<3; j++){
              vector[k]= (vector[k] + matriz[i][j]); // Suma las filas y las pone en una posicion del vector
              vector[k+3]=(vector[k+3]+ matriz [j][i]); // Suma las columnas y las pone en una posicion del vector
              }   
          }
          for (int i = 0; i<3; i++){
              vector[3*2]= (vector[3*2] + matriz[i][i]);  // Suma la diagonal principal
              vector[(3*2)+1]=(vector[(3*2)+1]+ matriz [i] [(3-1)-i]);  // Suma la diagonal Secundaria
          }
          
         System.out.println("***********");   // muestra el vector con los resultados de la sumas
         for (int i = 0; i<8; i++){
                System.out.print("[" + vector[i] + "]");
            } 
             System.out.println("");
         System.out.println("***********"); 
     
         
         int i = 0;                                // Se compara igualdad en cada posicion del vector
         while (bandera && i<7){    
             bandera = (vector[i] == vector[i+1]);
             i++;           
          }
         
         if (bandera){
             System.out.println("La Matriz es Magica");
         }else{
          System.out.println(" La Matriz No es Magica");
             }
    }
         }


         
    


    
         
          
          


          
          
        
	/*
	Para i=0 Hasta n-1 HAcer 
		vector(n*2)= vector(n*2) + matriz(i,i)    /// Suma la diagonal Principal
		vector((n*2)+1)= vector((n*2)+1) + matriz(i,((n-1)-i)) /// Suma diagonal Suegra
	FinPara
	
	Para i=0 Hasta (n*2)+1 Hacer   /// muestra los valores en todo el vector
		Escribir Sin Saltar vector(i)
	FinPara
	Escribir""
	
	i=0
	
	Mientras bandera=Verdadero y i<(n*2) hacer   ///compara que todos los valores del vector sean iguales
		Si vector(i) <> vector(i+1) Entonces        
			bandera = Falso
		FinSi
		i=i+1
	FinMientras
	
	Si bandera = Verdadero Entonces
		Escribir " La Matriz es Magica"
	Sino
		Escribir " La Matriz No es Magica"
	FinSi
          
          */
        
        // TODO code application logic here
    

