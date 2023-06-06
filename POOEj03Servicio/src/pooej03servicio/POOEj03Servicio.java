/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej03servicio;

import Persona.Persona;
import PersonaServicio.PersonaServicio;


/**
 *
 * @author u180448
 */
public class POOEj03Servicio {

    /**
     * @param args the command line arguments
     * Realizar una clase llamada Persona en el paquete de entidades que
tengan los siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’
para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro
atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje
3
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
● Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales
     */
    public static void main(String[] args) {
    PersonaServicio n1 = new PersonaServicio();

        // Creamos un array para almacenar los atributos de persona (array de tipo objeto)
        int cantidad = 1;
        int imc;
        Persona p1[] = new Persona[cantidad];
        // Creamos un bucle for para asignar el valor a cada array
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los datos de la persona " + (i + 1));
            p1[i] = n1.crearPersona();
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println(p1[i]);
            
        }
        System.out.println(" ");
       for (int i = 0 ; i < cantidad; i++){
           if(n1.esMayorDeEdad(p1[i])){
           System.out.println("La persona " + (i+1) + " Es mayor de edad" );
           }else{
               System.out.println("La persona " + (i+1) + " Es menor de edad");
           }
                 imc=n1.calcularPeso(p1[i]);
                
           
           switch (imc) {
               case -1:
                   System.out.println("Esta bajo de su peso ideal ");
                   System.out.println("");
                   break;
               case 0:
                   System.out.println("Esta en su peso ideal ");
                   break;
               case 1:
                   System.out.println("Esta por encima de su peso ideal");
           }
         
       }
   
       }
       
    }    
        