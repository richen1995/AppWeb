/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entidades.Profservicio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Richard
 */
@Stateless
public class ProfservicioFacade extends AbstractFacade<Profservicio> implements ProfservicioFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_luxAD_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProfservicioFacade() {
        super(Profservicio.class);
    }
    
}
