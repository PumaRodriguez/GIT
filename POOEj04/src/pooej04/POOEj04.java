/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej04;

import Entidad.Rectangulo;

/**
 *
 * @author u180448
 */
public class POOEj04 {

    /**
     * @param args the command line arguments
     * Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura. La clase incluirá un
método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. También incluirá un método para calcular la superficie del
rectángulo y un método para calcular el perímetro del rectángulo. Por
último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los
métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
Rectangulo r = new Rectangulo();
r.crearRectangulo();
System.out.println("La base del rectángulo es: " + r.getBase());
System.out.println("La altura del rectángulo es: " + r.getAltura());
System.out.println("La superficie del rectángulo es: " + r.calcularSuperficie());
System.out.println("El perímetro del rectángulo es: " + r.calcularPerimetro());
System.out.println("Dibujo del rectángulo:");
r.dibujarRectangulo();
    }

}