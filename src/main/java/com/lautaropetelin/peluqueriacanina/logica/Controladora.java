package com.lautaropetelin.peluqueriacanina.logica;

import com.lautaropetelin.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardarDuenio(String nombreDuenio, String direccion, String celular) {
        
        // Creamos una lista de mascotas vacía
        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        
        // Crear objeto Duenio y asignar valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setDireccion(direccion);
        duenio.setCelular(celular);
        duenio.setMascotas(listaMascotas);
        
        // Guardar duenio en la BD
        controlPersis.guardarDuenio(duenio);
    }
    
    public void guardarMascota(String nombreMascota, String raza, String color, String alergico, String atencionEspecial, String observaciones, Duenio duenio) {
        
        // Crear mascota y asignar sus valores
        Mascota mascota = new Mascota(nombreMascota, raza, color, alergico, atencionEspecial, observaciones, duenio);
        
        // Crear duenio y asignar sus valores
        
        int idDuenio = duenio.getIdDuenio();
        String nombreDuenio = duenio.getNombre();
        String direccionDuenio = duenio.getDireccion();
        String celularDuenio = duenio.getCelular();
        List<Mascota> listaMascotas = duenio.getMascotas();

        // Asignar mascota a la lista de mascotas del duenio
        listaMascotas.add(mascota);
        modificarDuenio(idDuenio, nombreDuenio, direccionDuenio, celularDuenio, listaMascotas);
        
        // Guardar mascota en la BD
        controlPersis.guardarMascota(mascota, duenio);
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

    public void modificarMascota(Mascota mascota, String nombreMascota, String raza, String color, String alergico, String atencionEspecial, String observaciones, Duenio duenio) {
        
        // Setear nuevos valores a la mascota
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencionEspecial(atencionEspecial);
        mascota.setObservaciones(observaciones);
        mascota.setDuenio(duenio);
        
        // Modificar mascota en la BD
        controlPersis.modificarMascota(mascota);
    }

    public Duenio traerDuenio(int idDuenio) {
        
        return controlPersis.traerDuenio(idDuenio);
    }
    
    public void modificarDuenio(int id, String nombre, String direccion, String celular, List<Mascota> listaMascotas) {
        
        Duenio duenio = new Duenio(id, nombre, celular, direccion, listaMascotas);
        
        controlPersis.modificarDuenio(duenio);
    }

    public void borrarDuenio(int idDuenio) {
        
        List<Mascota> listaMascotas = controlPersis.traerMascotas();
        
        if(listaMascotas.size() > 0){
            for(Mascota mascota: listaMascotas){
                if(mascota.getDuenio().getIdDuenio() == idDuenio){
                    controlPersis.borrarMascota(mascota.getIdCliente());
                }
            }
        }
        
        controlPersis.borrarDuenio(idDuenio);
    }

    public List<Duenio> traerDuenios() {
        
        return controlPersis.traerDuenios();
    }
}