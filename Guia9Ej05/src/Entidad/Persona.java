/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author u180448
 */
public class Persona {
    public Date edad;
    private String persona;

    public Persona() {
    }

    public Persona(String persona, Date edad) {
        this.persona = persona;
        this.edad = edad;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public Date getEdad() {
        return edad;
    }

    public void setEdad(Date edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "persona=" + persona + ", edad=" + edad + '}';
    }
    
}
