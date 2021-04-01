/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entidades.Profactividad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Richard
 */
@Stateless
public class ProfactividadFacade extends AbstractFacade<Profactividad> implements ProfactividadFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_luxAD_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProfactividadFacade() {
        super(Profactividad.class);
    }
    
}
