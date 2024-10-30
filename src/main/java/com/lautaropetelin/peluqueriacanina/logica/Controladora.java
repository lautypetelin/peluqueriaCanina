package com.lautaropetelin.peluqueriacanina.logica;

import com.lautaropetelin.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String alergico, String atencionEspecial, String nombreDuenio, String direccion, String celular, String observaciones) {
    
        // Crear dueño y asignar valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celular);
        duenio.setDireccion(direccion);
        
        // Crear mascota y asignar sus valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setDuenio(duenio);
        
        controlPersis.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int idMascota) {
        controlPersis.borrarMascota(idMascota);
    }

    public Mascota traerMascota(int idMascota) {
        return controlPersis.traerMascota(idMascota);
    }

    public void modificarMascota(Mascota masco, String nombreMascota, String raza, String color, String alergico, String atencionEspecial, String nombreDuenio, String direccion, String celular, String observaciones) {
        
        // Setear nuevos valores a la mascota
        masco.setNombre(nombreMascota);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencionEspecial);
        masco.setObservaciones(observaciones);
        
        // Modificar mascota en la BD
        controlPersis.modificarMascota(masco);
        
        // Setear nuevos valores al dueño
        Duenio duenio = this.buscarDuenio(masco.getDuenio().getIdDuenio());
        duenio.setNombre(nombreDuenio);
        duenio.setDireccion(direccion);
        duenio.setCelular(celular);
        
        // Modificar dueño en la BD
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int idDuenio) {
        return controlPersis.traerDuenio(idDuenio);
    }
    
    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }

    public void borrarDuenio(int idDuenio) {
        controlPersis.borrarDuenio(idDuenio);
    }
}