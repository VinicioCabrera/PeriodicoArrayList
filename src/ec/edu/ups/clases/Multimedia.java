/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * @author vinicio campoverde
 * @author Usuario
 */
public class Multimedia {

    private String formato;
    private double tamañobytes;
    private String path;
    private String nombre;

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setTamañoBytes(double tamañobytes) {
        this.tamañobytes = tamañobytes;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return this.formato;
    }

    public double getTamañoBytes() {
        return this.tamañobytes;
    }

    public String getPath() {
        return this.path;
    }

    public String getNombre() {
        return this.nombre;
    }
}
