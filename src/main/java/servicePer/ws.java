/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicePer;

import ejb.CatalogoFacadeLocal;
import ejb.CiudadFacadeLocal;
import ejb.KitFacadeLocal;
import ejb.MaterialFacadeLocal;
import ejb.ServicioFacadeLocal;
import ejb.UsuarioFacadeLocal;
import ejb.MaterialservicioFacadeLocal;
import ejb.ProfservicioFacadeLocal;
import entidades.Catalogo;
import entidades.Ciudad;
import entidades.Kit;
import entidades.Materialservicio;
import entidades.Profservicio;
import entidades.Servicio;
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
    
    @EJB
    private ServicioFacadeLocal servicio;
    
    @EJB
    private MaterialservicioFacadeLocal materialservicio;
    
    @EJB
    private ProfservicioFacadeLocal profesionalservicio;
    
    @EJB
    private KitFacadeLocal kit;
    
    @EJB
    private CatalogoFacadeLocal catalogo;
 

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
        
    //Consultar servicios con estado true    
    @GET
    @Path("servicioshabilitados")
    @Produces({"application/json; charset=utf-8"})
    @Consumes({"application/json; charset=utf-8"})
        public List<Servicio> servioshabilitados() {
        List<Servicio> listServicio = null;
        try {
            listServicio = servicio.obtenerserviciosactivos();
            return listServicio;
        } catch (Exception e) {
            listServicio = null;
            return listServicio;
        }
    } 
        
    //Consultar materiales por servicio   
    @GET
    @Path("materialporservicio/{codigosrv}")
    @Produces({"application/json; charset=utf-8"})
    @Consumes({"application/json; charset=utf-8"})
    public List<Materialservicio> materialporservicio(@PathParam("codigosrv") String codigosrv) {
        List<Materialservicio> listMaterialdeServicio = null;
        try {
            listMaterialdeServicio = materialservicio.obtenermaterialesdeservicio(codigosrv);
            return listMaterialdeServicio;
        } catch (Exception e) {
            listMaterialdeServicio = null;
            return listMaterialdeServicio;
        }
    } 
    
    //Consultar los profesionales de un servicio   
    @GET
    @Path("profecionalporservicio/{codigosrv}")
    @Produces({"application/json; charset=utf-8"})
    @Consumes({"application/json; charset=utf-8"})
    public List<Profservicio> profesionalporservicio(@PathParam("codigosrv") String codigosrv) {
        List<Profservicio> listProfesionaldeServicio = null;
        try {
            listProfesionaldeServicio = profesionalservicio.obtenerprofesionalesdeservicio(codigosrv);
            return listProfesionaldeServicio;
        } catch (Exception e) {
            listProfesionaldeServicio = null;
            return listProfesionaldeServicio;
        }
    }  
    
    //Obtener lista de los kits de un servicio   
    @GET
        @Path("kitporservicio/{codigosrv}")
    @Produces({"application/json; charset=utf-8"})
    @Consumes({"application/json; charset=utf-8"})
    public List<Kit> kitporservicio(@PathParam("codigosrv") String codigosrv) {
        List<Kit> listKitdeServicio = null;
        try {
            listKitdeServicio = kit.obtenerkitsdeservicio(codigosrv);
            return listKitdeServicio;
        } catch (Exception e) {
            listKitdeServicio = null;
            return listKitdeServicio;
        }
    } 
    
    //Obtener lista de servicios ordenados por prioridad   
    @GET
    @Path("servicioporprioridad")
    @Produces({"application/json; charset=utf-8"})
    @Consumes({"application/json; charset=utf-8"})
    public List<Servicio> servicioporprioridad() {
        List<Servicio> listServicioporPrioridad = null;
        try {
            listServicioporPrioridad = servicio.obtenerservicioporprioridad();
            return listServicioporPrioridad;
        } catch (Exception e) {
            listServicioporPrioridad = null;
            return listServicioporPrioridad;
        }
    } 
    
    //Obtener registro catalogo usando el codigo CAT como parametro y no el id  
    @GET
    @Path("catalogoporcodigo/{codigocat}")
    @Produces({"application/json; charset=utf-8"})
    @Consumes({"application/json; charset=utf-8"})
    public Catalogo catalogoPorCodigo(@PathParam("codigocat") String codigocat) {
        Catalogo listCatalogoporCod = null;
        try {
            listCatalogoporCod = catalogo.obtenerCatalogo(codigocat);
            return listCatalogoporCod;
        } catch (Exception e) {
            listCatalogoporCod = null;
            return listCatalogoporCod;
        }
    } 
}   
