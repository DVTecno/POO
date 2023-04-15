

package com.dvtecno.peluqueria.logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity//permite mapear la clase al marcarla como una entidad y se puede crear la clase como una tabla
public class Mascota {
    @Id //marca como id y va siempre por encima delo que selecciono como id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)// Genera el id secuencialmente
    private int numCliente;
    //@Basic //Marca como basico, lo cual si no se pone por defecto ya los es
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEspecial;
    private String observaciones;
    @OneToOne//es tipo de relacion uno a uno, aqui se marca
    private Duenio unDuenio;

    public Mascota() {
    }

    public Mascota(int numCliente, String nombre, String raza, String color, String alergico, String atencionEspecial, String observaciones, Duenio unDuenio) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.unDuenio = unDuenio;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Duenio unDuenio) {
        this.unDuenio = unDuenio;
    }
    
   
}
