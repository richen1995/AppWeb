/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entidades.Clienteprobable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Richard
 */
@Local
public interface ClienteprobableFacadeLocal {

    void create(Clienteprobable clienteprobable);

    void edit(Clienteprobable clienteprobable);

    void remove(Clienteprobable clienteprobable);

    Clienteprobable find(Object id);

    List<Clienteprobable> findAll();

    List<Clienteprobable> findRange(int[] range);

    int count();
    
}
