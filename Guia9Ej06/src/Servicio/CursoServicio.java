package Servicio;


import Entidad.Curso;
import java.util.Scanner;

/*
 * 
d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
5
 */

/**
 *
 * @author u180448
 */
public class CursoServicio {
    Scanner input = new Scanner(System.in);
    
    public String[] cargarAlumno(){
        
        String alumno[] = new String[5];
        System.out.println("Cargaremos nombre de Alumnos(5)");
        for (int i = 0; i < alumno.length; i++) {
            System.out.printf("Cargue el nombre del alumno %d %n ",i+1);
            alumno[i]=input.next();
        }
        return alumno;
    }
    
    public Curso crearCurso(String[] array){
    
         String nombreCurso;
         int CantHorasDia;
         int CantHorasSem;
         String turno;
         double precioHora;
         String alumno[] = new String[5] ;
         
         System.out.print("Ingrese Nombre del Curso: ");
         nombreCurso = input.next();
         System.out.print("Ingrese Cantidad Horas por día: ");
         CantHorasDia = input.nextInt();
         System.out.print("Ingrese Cantidad Horas por Semana: ");
         CantHorasSem = input.nextInt();
         System.out.print("Ingrese Turno (Mañana/Tarde): ");
         turno = input.next();
         System.out.print("Ingrese precio por hora: ");
         precioHora=input.nextDouble();
         alumno = array;
         
         return new Curso(nombreCurso,CantHorasDia,CantHorasSem,turno,precioHora,alumno);
    
    }

    public void mostrar(Curso clase){
    
        System.out.println("Nombre del curso: "+ clase.getNombreCurso());
        System.out.println("Cantidad Horas por dia: "+ clase.getCantHorasDia());
        System.out.println("Cantidad dias por semana: "+clase.getCantHorasSem());
        System.out.println("Turno:  "+clase.getTurno());
        System.out.println("Precio por hora: "+clase.getPrecioHora());
        System.out.println("Listado de alumnos: ");
        for (int i = 0; i < clase.getAlumno().length; i++) {
            System.out.println(">>> " + clase.getAlumno()[i] );
        }
    
    
    
    }
    
    public double calcularGananciaSemanal(Curso Curso_1){
        
        double ganancia;
    
        ganancia = ((Curso_1.getCantHorasDia()*Curso_1.getPrecioHora()) * Curso_1.getAlumno().length) * Curso_1.getCantHorasSem() ;
    
    
        return ganancia;
    }
    
}
