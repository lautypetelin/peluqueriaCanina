package com.lautaropetelin.peluqueriacanina.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Duenio implements Serializable {
    
    // Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idDuenio;
    @Basic
    private String nombre;
    private String celular;
    private String direccion;
    @OneToMany(mappedBy = "duenio")
    private List<Mascota> mascotas;
    
    // Constructores
    public Duenio() {}

    public Duenio(int idDuenio, String nombre, String celular, String direccion, List<Mascota> mascotas) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
        this.mascotas = mascotas;
    }
    
    // Getters y Setters
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

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    // Método toString
    @Override
    public String toString() {
        return idDuenio + " - " + nombre;
    }
}