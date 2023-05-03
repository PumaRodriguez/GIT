/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej05extra;
 
import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author u180448
 */
public class POOEj05Extra {

    /**
     * @param args the command line arguments
     * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado empleado1 = new Empleado("Juan Perez", 35, 2000.0);
    double aumento1 = empleado1.calcular_aumento();
    System.out.println("El aumento salarial del " + empleado1.getNombre() + " es de $" + aumento1);

    Empleado empleado2 = new Empleado("Maria Garcia", 28, 1500.0);
    double aumento2 = empleado2.calcular_aumento();
    System.out.println("El aumento salarial del " + empleado2.getNombre() + " es de $" + aumento2);
    
   Empleado empleado3 = new Empleado();
       System.out.println(" Ingrese el nombre: ");
        empleado3.setNombre(leer.nextLine());
        System.out.println(" Ingrese la Edad: ");
        empleado3.setEdad(leer.nextInt());
        System.out.println(" Ingrese el Salario: ");
        empleado3.setSalario(leer.nextDouble());
    double aumento3 = empleado3.calcular_aumento();
    System.out.println("El aumento salarial del " + empleado3.getNombre() + " es de $" + aumento3);
}
        // TODO code application logic here
    }

