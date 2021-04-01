package entidades;

import entidades.Cotizacion;
import entidades.Visita;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-01T00:21:09")
@StaticMetamodel(Clienteprobable.class)
public class Clienteprobable_ { 

    public static volatile SingularAttribute<Clienteprobable, String> cpApellido;
    public static volatile SingularAttribute<Clienteprobable, String> cpNombre;
    public static volatile CollectionAttribute<Clienteprobable, Cotizacion> cotizacionCollection;
    public static volatile SingularAttribute<Clienteprobable, String> cpCedula;
    public static volatile SingularAttribute<Clienteprobable, Integer> cpId;
    public static volatile SingularAttribute<Clienteprobable, String> cpCelular;
    public static volatile CollectionAttribute<Clienteprobable, Visita> visitaCollection;
    public static volatile SingularAttribute<Clienteprobable, String> cpDireccion;

}