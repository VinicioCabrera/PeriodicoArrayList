/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Usuario
 */
public class Seccion {

    private String nombre;
    private String noticias;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoticia(String noticia) {
        this.noticias = noticia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNoticia() {
        return this.noticias;
    }
}
