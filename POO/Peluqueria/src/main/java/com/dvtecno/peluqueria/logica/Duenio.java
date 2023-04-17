package com.dvtecno.peluqueria.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDuenio;
    private String nombre;
    private String CellDuenio;

    public Duenio() {
    }

    public Duenio(int idDuenio, String nombre, String CellDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.CellDuenio = CellDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCellDuenio() {
        return CellDuenio;
    }

    public void setCellDuenio(String CellDuenio) {
        this.CellDuenio = CellDuenio;
    }

}
