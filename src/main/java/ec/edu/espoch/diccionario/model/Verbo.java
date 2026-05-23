/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.diccionario.model;

public class Verbo extends Palabra {
    private String tiempoPasado;

    public Verbo(String esp, String ing, String pron, String pasado) {
        super(esp, ing, pron);
        this.tiempoPasado = pasado;
    }

    public String obtenerDetalle() {
        return "Verbo - Pasado: " + tiempoPasado;
    }

    public String getTiempoPasado() { return tiempoPasado; }
}