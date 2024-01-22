package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idDuenio;
    @Basic
    private String nombre;
    private String celular;
    private String direccion;
    
    //Constructores
    public Duenio() {}

    public Duenio(int idDuenio, String nombre, String celular, String direccion) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }
    
    //Métodos getter y setter
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Método toString
    @Override
    public String toString() {
        return idDuenio + " - " + nombre + ", " + celular + ", " + direccion;
    }
}