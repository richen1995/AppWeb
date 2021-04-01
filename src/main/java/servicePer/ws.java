/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicePer;

import ejb.CiudadFacadeLocal;
import ejb.UsuarioFacadeLocal;
import entidades.Ciudad;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


/**
 *
 * @author Richard
 */

@Stateless
@Path("")
public class ws {
    @EJB
    private UsuarioFacadeLocal usuario;
    
    @EJB
    private CiudadFacadeLocal ciudad;
    
    @GET
    @Path("sessionusuario/{email}/{password}")
    @Produces({"application/json; charset=utf-8"})
    @Consumes({"application/json; charset=utf-8"})
        public Usuario usuariodadocedula(@PathParam("email") String email, @PathParam("password") String password) {
        Usuario lstReturn = new Usuario();
        try {
            lstReturn = usuario.obtenerusuario(email, password);
            return lstReturn;
        } catch (Exception e) {
            lstReturn = null;
            return lstReturn;
        }
    }   
        
    @GET
    @Path("ciudadesdeprovincia/{codprovincia}")
    @Produces({"application/json; charset=utf-8"})
    @Consumes({"application/json; charset=utf-8"})
        public List<Ciudad> ciudadesdeprovincia(@PathParam("codprovincia") String codprovincia) {
        List<Ciudad> listCiudad = null;
        try {
            listCiudad = ciudad.obtenerciudadesdeprovincia(codprovincia);
            return listCiudad;
        } catch (Exception e) {
            listCiudad = null;
            return listCiudad;
        }
    } 
    
}
