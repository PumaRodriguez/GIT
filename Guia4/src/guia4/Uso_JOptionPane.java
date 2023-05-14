package guia4;


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
public class Uso_JOptionPane {

    /**
     * @param args the command line arguments
     * PRACTICA METODO JOptionPane " Ingreso y muestra de variables"
     * 
     * ARREGLO  JOptionPane.showInputDialog(Componente, Mensaje, Titulo, Tipo de Mensaje, Icono, Arreglo, Valor inicial)
     */
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        /*JOptionPane.showInputDialog(Componente, Mensaje, Titulo, Tipo de Mensaje, Icono, Arreglo, Valor inicial);
        Arreglo: en esta parte declaramos un arreglo de Objetos, para agregar nuestras propias opciones,
        este valor puede dejarse nulo.
        Vaor Inicial: este parametro va en conjunto con el anterior y le da el valor por defecto al dialogo de entre los 
        objetos del arreglo, puede dejarse nulo.
        */
        
        // **********  INGRESO DE DATOS A VARIABLES ****************
        /*
         cadena = JOptionPane.showInputDialog(null, "Ingrese su cadena:");
         entero =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un entero:"));
         letra = JOptionPane.showInputDialog(null, "Ingrese una letra:").charAt(0);
         decimal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un decimal:"));
         
         // *********** MUESTRA DE VARIABLES ********************
         
         JOptionPane.showMessageDialog(null, " La cadena ingresada es: " + cadena);
         JOptionPane.showMessageDialog(null, " El entero es ingresado es: " + entero);
         JOptionPane.showMessageDialog(null, " La letra ingresada es:  " + letra);
         JOptionPane.showMessageDialog(null, " El numero decimal es: " + decimal);
         */
         //****************USO DE MENU DE ELECCION **************
         
         String [ ] arreglo={ "SUMA", "RESTA", "MULTIPLICACION", "DIVIDIR", "SALIR"};
         int opcion = JOptionPane.showOptionDialog(null, "Elija la Operacion", "Elije...",0, JOptionPane.QUESTION_MESSAGE,null, arreglo,"");// TODO code application logic here
         JOptionPane.showMessageDialog(null, " La respuesta fue: " + opcion);
         JOptionPane.showMessageDialog(null, " La respuesta fue : " + arreglo [opcion]);
         
         
         String animal = (JOptionPane.showInputDialog(null,"Seleccione el animal:", "ANIMALES", JOptionPane.PLAIN_MESSAGE, null, new Object [ ] {"Selecciona", "Gato", "Perro", "Caballo"},"Selecciona")).toString();
         JOptionPane.showMessageDialog(null, "Tu animal es: " + animal, "ANIMALES", JOptionPane.PLAIN_MESSAGE);
         
         
          int num =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero:", "Numeros Aleatorios", JOptionPane.PLAIN_MESSAGE));
          JOptionPane.showMessageDialog(null, "Tu numero es: " + num, "Numeros Aleatorios", JOptionPane.PLAIN_MESSAGE);

}}