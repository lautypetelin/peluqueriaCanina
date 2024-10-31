package com.lautaropetelin.peluqueriacanina.persistencia;

import com.lautaropetelin.peluqueriacanina.logica.Duenio;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.lautaropetelin.peluqueriacanina.logica.Mascota;
import com.lautaropetelin.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DuenioJpaController implements Serializable {

    private EntityManagerFactory emf = null;
    
    public DuenioJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PeluCaninaPU");
    }
    
    public DuenioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Duenio duenio) {
        if (duenio.getMascotas() == null) {
            duenio.setMascotas(new ArrayList<Mascota>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Mascota> attachedMascotas = new ArrayList<Mascota>();
            for (Mascota mascotasMascotaToAttach : duenio.getMascotas()) {
                mascotasMascotaToAttach = em.getReference(mascotasMascotaToAttach.getClass(), mascotasMascotaToAttach.getIdCliente());
                attachedMascotas.add(mascotasMascotaToAttach);
            }
            duenio.setMascotas(attachedMascotas);
            em.persist(duenio);
            for (Mascota mascotasMascota : duenio.getMascotas()) {
                Duenio oldDuenioOfMascotasMascota = mascotasMascota.getDuenio();
                mascotasMascota.setDuenio(duenio);
                mascotasMascota = em.merge(mascotasMascota);
                if (oldDuenioOfMascotasMascota != null) {
                    oldDuenioOfMascotasMascota.getMascotas().remove(mascotasMascota);
                    oldDuenioOfMascotasMascota = em.merge(oldDuenioOfMascotasMascota);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Duenio duenio) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio persistentDuenio = em.find(Duenio.class, duenio.getIdDuenio());
            List<Mascota> mascotasOld = persistentDuenio.getMascotas();
            List<Mascota> mascotasNew = duenio.getMascotas();
            List<Mascota> attachedMascotasNew = new ArrayList<Mascota>();
            for (Mascota mascotasNewMascotaToAttach : mascotasNew) {
                mascotasNewMascotaToAttach = em.getReference(mascotasNewMascotaToAttach.getClass(), mascotasNewMascotaToAttach.getIdCliente());
                attachedMascotasNew.add(mascotasNewMascotaToAttach);
            }
            mascotasNew = attachedMascotasNew;
            duenio.setMascotas(mascotasNew);
            duenio = em.merge(duenio);
            for (Mascota mascotasOldMascota : mascotasOld) {
                if (!mascotasNew.contains(mascotasOldMascota)) {
                    mascotasOldMascota.setDuenio(null);
                    mascotasOldMascota = em.merge(mascotasOldMascota);
                }
            }
            for (Mascota mascotasNewMascota : mascotasNew) {
                if (!mascotasOld.contains(mascotasNewMascota)) {
                    Duenio oldDuenioOfMascotasNewMascota = mascotasNewMascota.getDuenio();
                    mascotasNewMascota.setDuenio(duenio);
                    mascotasNewMascota = em.merge(mascotasNewMascota);
                    if (oldDuenioOfMascotasNewMascota != null && !oldDuenioOfMascotasNewMascota.equals(duenio)) {
                        oldDuenioOfMascotasNewMascota.getMascotas().remove(mascotasNewMascota);
                        oldDuenioOfMascotasNewMascota = em.merge(oldDuenioOfMascotasNewMascota);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = duenio.getIdDuenio();
                if (findDuenio(id) == null) {
                    throw new NonexistentEntityException("The duenio with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Duenio duenio;
            try {
                duenio = em.getReference(Duenio.class, id);
                duenio.getIdDuenio();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The duenio with id " + id + " no longer exists.", enfe);
            }
            List<Mascota> mascotas = duenio.getMascotas();
            for (Mascota mascotasMascota : mascotas) {
                mascotasMascota.setDuenio(null);
                mascotasMascota = em.merge(mascotasMascota);
            }
            em.remove(duenio);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Duenio> findDuenioEntities() {
        return findDuenioEntities(true, -1, -1);
    }

    public List<Duenio> findDuenioEntities(int maxResults, int firstResult) {
        return findDuenioEntities(false, maxResults, firstResult);
    }

    private List<Duenio> findDuenioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Duenio.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Duenio findDuenio(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Duenio.class, id);
        } finally {
            em.close();
        }
    }

    public int getDuenioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Duenio> rt = cq.from(Duenio.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
