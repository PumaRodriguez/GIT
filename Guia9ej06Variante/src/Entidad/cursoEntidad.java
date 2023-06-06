/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author u180448
 */
public class cursoEntidad {
    private String nombreCurso;
    private double cantHorasxDia;
    private int cantidadDiasxSemana;
    private String turno;
    private double precioxHora;
    private String[] alumnos=new String[5];

    public cursoEntidad() {
    }

    public cursoEntidad(String nombreCurso, double cantHorasxDia, int cantidadDiasxSemana, String turno, double precioxHora) {
        this.nombreCurso = nombreCurso;
        this.cantHorasxDia = cantHorasxDia;
        this.cantidadDiasxSemana = cantidadDiasxSemana;
        this.turno = turno;
        this.precioxHora = precioxHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCantHorasxDia() {
        return cantHorasxDia;
    }

    public void setCantHorasxDia(double cantHorasxDia) {
        this.cantHorasxDia = cantHorasxDia;
    }

    public int getCantidadDiasxSemana() {
        return cantidadDiasxSemana;
    }

    public void setCantidadDiasxSemana(int cantidadDiasxSemana) {
        this.cantidadDiasxSemana = cantidadDiasxSemana;
    }

    public String isTurno() {
        return turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioxHora() {
        return precioxHora;
    }

    public void setPrecioxHora(double precioxHora) {
        this.precioxHora = precioxHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
}
    

