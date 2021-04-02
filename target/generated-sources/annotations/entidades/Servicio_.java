package entidades;

import entidades.Actividad;
import entidades.Pedido;
import entidades.Profservicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-02T18:28:54")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> srvTipo;
    public static volatile SingularAttribute<Servicio, Boolean> srvEstado;
    public static volatile CollectionAttribute<Servicio, Actividad> actividadCollection;
    public static volatile SingularAttribute<Servicio, String> srvId;
    public static volatile CollectionAttribute<Servicio, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Servicio, String> srvNombre;
    public static volatile CollectionAttribute<Servicio, Profservicio> profservicioCollection;

}