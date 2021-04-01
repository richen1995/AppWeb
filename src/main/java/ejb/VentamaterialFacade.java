/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entidades.Ventamaterial;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Richard
 */
@Stateless
public class VentamaterialFacade extends AbstractFacade<Ventamaterial> implements VentamaterialFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_luxAD_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VentamaterialFacade() {
        super(Ventamaterial.class);
    }
    
}
