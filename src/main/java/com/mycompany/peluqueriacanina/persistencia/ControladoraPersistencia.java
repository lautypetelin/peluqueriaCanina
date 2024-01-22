package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        
        //Creamos en la BD el dueño.
        duenioJpa.create(duenio);
        
        //Creamos en la BD la mascota.
        mascotaJpa.create(mascota);
    } 

    public List<Mascota> traerMascotas() {
 
        return mascotaJpa.findMascotaEntities();
    }

    public void borrarMascota(int idMascota) {
        try {
            mascotaJpa.destroy(idMascota);
        } catch (NonexistentEntityException ex) {
            //No hay excepción ya que esta controlada desde la clase VerDatos.
        }
    }

    public Mascota traerMascota(int idMascota) {
        return mascotaJpa.findMascota(idMascota);
    }

    public void modificarMascota(Mascota masco) {
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            //No hay excepción ya que esta controlada desde la clase ModificarDatos.
        }
    }

    public Duenio traerDuenio(int idDuenio) {
        return duenioJpa.findDuenio(idDuenio);
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            duenioJpa.edit(duenio);
        } catch (Exception ex) {
            //No hay excepción ya que esta controlada desde la clase VerDatos.
        }
    }
}