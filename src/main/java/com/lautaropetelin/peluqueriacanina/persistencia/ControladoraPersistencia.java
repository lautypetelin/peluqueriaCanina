package com.lautaropetelin.peluqueriacanina.persistencia;

import com.lautaropetelin.peluqueriacanina.logica.Duenio;
import com.lautaropetelin.peluqueriacanina.logica.Mascota;
import com.lautaropetelin.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardarMascota(Mascota mascota, Duenio duenio) {
        
        // Crear en la BD la mascota
        mascotaJpa.create(mascota);
        
        try {
            // Crear en la BD el dueño
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            // La excepción está controlada desde la clase CargaDatos
        }
        
    } 

    public List<Mascota> traerMascotas() {
 
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int idMascota) {
        try {
            mascotaJpa.destroy(idMascota);
        } catch (NonexistentEntityException ex) {
            // La excepción está controlada desde la clase VerDatos
        }
    }

    public Mascota traerMascota(int idMascota) {
        
        return mascotaJpa.findMascota(idMascota);
    }

    public void modificarMascota(Mascota mascota) {
        
        try {
            mascotaJpa.edit(mascota);
        } catch (NonexistentEntityException ex) {
            // Excepción controlada desde la clase ModificarDatos
        } catch (Exception e){
            // Excepción controlada desde la clase ModificarDatos
        }
    }

    public Duenio traerDuenio(int idDuenio) {
        return duenioJpa.findDuenio(idDuenio);
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (NonexistentEntityException e){
            // Excepción controlada desde la clase ModificarDatos
        } catch (Exception ex) {
            // Excepción controlada desde la clase ModificarDatos
        }
    }

    public void borrarDuenio(int idDuenio) {
        try {
            duenioJpa.destroy(idDuenio);
        } catch (NonexistentEntityException ex) {
            // La excepción está controlada desde la clase VerDatos
        }
    }

    public List<Duenio> traerDuenios() {
        return duenioJpa.findDuenioEntities();
    }

    public void guardarDuenio(Duenio duenio) {
        
        // Crear en la BD el dueño
        duenioJpa.create(duenio);
    }
}