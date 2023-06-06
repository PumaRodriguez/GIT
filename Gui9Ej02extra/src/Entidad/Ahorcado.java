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
public class Ahorcado {
    private char[] palabra;
    public int letrasEncontradas;
    public int jugadasMaximas;

    public Ahorcado(char[] palabra, int jugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = 0;
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }
}
