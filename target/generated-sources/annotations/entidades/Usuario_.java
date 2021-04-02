package entidades;

import entidades.Permiso;
import entidades.Persona;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-02T18:28:54")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Date> usFechainicial;
    public static volatile SingularAttribute<Usuario, Date> usFechafinal;
    public static volatile SingularAttribute<Usuario, Persona> perCedula;
    public static volatile SingularAttribute<Usuario, String> usRol;
    public static volatile SingularAttribute<Usuario, String> usEmail;
    public static volatile SingularAttribute<Usuario, String> usPassword;
    public static volatile SingularAttribute<Usuario, Boolean> usEstado;
    public static volatile SingularAttribute<Usuario, Permiso> pmId;
    public static volatile SingularAttribute<Usuario, Integer> usId;

}