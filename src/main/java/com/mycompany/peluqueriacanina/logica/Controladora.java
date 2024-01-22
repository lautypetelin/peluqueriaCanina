package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia persis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, String alergico, String atencionEspecial, String nombreDuenio, String direccion, String celular, String observaciones) {
    
        //Creamos el dueño y asignamos sus valores.
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelular(celular);
        duenio.setDireccion(direccion);
        
        //Creamos la mascota y asignamos sus valores.
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setDuenio(duenio);
        
        persis.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return persis.traerMascotas();
    }

    public void borrarMascota(int idMascota) {
        persis.borrarMascota(idMascota);
    }

    public Mascota traerMascota(int idMascota) {
        return persis.traerMascota(idMascota);
    }

    public void modificarMascota(Mascota masco, String nombreMascota, String raza, String color, String alergico, String atencionEspecial, String nombreDuenio, String direccion, String celular, String observaciones) {
        
        //Seteo nuevos valores a la mascota.
        masco.setNombre(nombreMascota);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencionEspecial);
        masco.setObservaciones(observaciones);
        
        //Modifico mascota.
        persis.modificarMascota(masco);
        
        //Seteo nuevos valores al dueño.
        Duenio duenio = this.buscarDuenio(masco.getDuenio().getIdDuenio());
        duenio.setNombre(nombreDuenio);
        duenio.setDireccion(direccion);
        duenio.setCelular(celular);
        
        //Modifico dueño.
        this.modificarDuenio(duenio);
    }
    
    //Métodos adicionales
    private Duenio buscarDuenio(int idDuenio) {
        return persis.traerDuenio(idDuenio);
    }
    
    private void modificarDuenio(Duenio duenio) {
        persis.modificarDuenio(duenio);
    }
}