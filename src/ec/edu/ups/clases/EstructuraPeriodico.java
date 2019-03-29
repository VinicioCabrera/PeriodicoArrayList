/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * EstructuraPeriodico
 * 
 * Clase que permite estructurar mi periodico digital
 * 
 * @version 2.0
 * @since 2019
 * @author Gabriel
 * @see http://ups.edu.ec
 */
public class EstructuraPeriodico {

    private String ubicacion;
    private String nombrePeriodico;
    private String fecha;

    /**
     * 
     * @return 
     */
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombrePeriodico() {
        return nombrePeriodico;
    }

    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }       

    

}
