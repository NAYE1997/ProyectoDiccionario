/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.diccionario.model;

public class Palabra {
    private String espanol;
    private String ingles;
    private String pronunciacion;
    
    public Palabra(String espanol, String ingles, String pronunciacion) {
        this.espanol = espanol;
        this.ingles = ingles;
        this.pronunciacion = pronunciacion;
    }

    public String getEspanol() {
        return espanol;
    }

    public String getIngles() {
        return ingles;
    }

    public String getPronunciacion() {
        return pronunciacion;
    }

    public void setEspanol(String espanol) {
        this.espanol = espanol;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public void setPronunciacion(String pronunciacion) {
        this.pronunciacion = pronunciacion;
    }

    @Override
    public String toString() {
        return "Español: " + espanol + " | Inglés: " + ingles + " | Pron: " + pronunciacion;
    }
}