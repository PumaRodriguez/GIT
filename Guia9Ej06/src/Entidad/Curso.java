/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author u180448
 * a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.
 */
public class Curso {
    // Atributos
    private String nombreCurso;
    private int CantHorasDia;
    private int CantHorasSem;
    private String turno;
    private double precioHora;
    private String[] alumno = new String[5] ;
    
    
    // Constructores
    public Curso(){
    };

    public Curso(String nombreCurso, int CantHorasDia, int CantHorasSem, String turno, double precioHora, String[] alumno) {
        this.nombreCurso = nombreCurso;
        this.CantHorasDia = CantHorasDia;
        this.CantHorasSem = CantHorasSem;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumno = alumno;
    }

    // SETTER

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantHorasDia(int CantHorasDia) {
        this.CantHorasDia = CantHorasDia;
    }

    public void setCantHorasSem(int CantHorasSem) {
        this.CantHorasSem = CantHorasSem;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }
    
    // GETTERS

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantHorasDia() {
        return CantHorasDia;
    }

    public int getCantHorasSem() {
        return CantHorasSem;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public String[] getAlumno() {
        return alumno;
    }
    
    // HERRAMIENTA PARA CONTROL TOSTRING

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", CantHorasDia=" + CantHorasDia + ", CantHorasSem=" + CantHorasSem + ", turno=" + turno + ", precioHora=" + precioHora + ", alumno=" + alumno + '}';
    }
    
}
