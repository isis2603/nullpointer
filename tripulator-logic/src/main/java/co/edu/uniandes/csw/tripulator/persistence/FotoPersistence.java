/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.tripulator.persistence;

import co.edu.uniandes.csw.tripulator.entities.EventoEntity;
import co.edu.uniandes.csw.tripulator.entities.FotoEntity;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author josef
 */
@Stateless
public class FotoPersistence {
    
    private static final Logger logger = Logger.getLogger(FotoPersistence.class.getName());

    @PersistenceContext(unitName = "TripulatorPU")
    protected EntityManager em;

    public List<FotoEntity> findAll(Long idViajero, Long idItinerario) {
        logger.info("Consultando todos las fotos");
        TypedQuery<FotoEntity> q = em.createQuery("select u from FotoEntity u where (u.itinerario.id = :idItinerario) ", FotoEntity.class);
        q.setParameter("idItinerario", idItinerario);
        return q.getResultList();
    }
    
    public FotoEntity find(Long idItinerario, Long idFoto) {
        logger.log(Level.INFO, "Consultando foto con id={0}", idFoto);
        TypedQuery<FotoEntity> q = em.createQuery("select u from FotoEntity u where (u.itinerario.id = :idItinerario) and (u.id = :idFoto)", FotoEntity.class);
        q.setParameter("idItinerario", idItinerario);
        q.setParameter("idFoto", idFoto);
        return q.getSingleResult();
    }
    
       public FotoEntity create(FotoEntity entity) {
        logger.info("Creando una foto nueva");
        em.persist(entity);
        logger.info("Foto creada");
        return entity;
    }
       
       
    public void delete(Long id) {
        logger.log(Level.INFO, "Borrando foto con id={0}", id);
        FotoEntity entity = em.find(FotoEntity.class, id);
        em.remove(entity);
    }
    
}
