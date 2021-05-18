package entidades;

import entidades.Actividadservicio;
import entidades.Cliente;
import entidades.Ordentrabajo;
import entidades.Profactividad;
import entidades.Servicio;
import entidades.Visita;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-18T11:20:56")
@StaticMetamodel(Actividad.class)
public class Actividad_ { 

    public static volatile CollectionAttribute<Actividad, Servicio> servicioCollection;
    public static volatile CollectionAttribute<Actividad, Actividadservicio> actividadservicioCollection;
    public static volatile SingularAttribute<Actividad, Double> actCostomanoobra;
    public static volatile SingularAttribute<Actividad, Boolean> actEstado;
    public static volatile SingularAttribute<Actividad, Integer> actId;
    public static volatile CollectionAttribute<Actividad, Profactividad> profactividadCollection;
    public static volatile SingularAttribute<Actividad, String> actDireccion;
    public static volatile CollectionAttribute<Actividad, Ordentrabajo> ordentrabajoCollection;
    public static volatile SingularAttribute<Actividad, Date> actFechafin;
    public static volatile SingularAttribute<Actividad, String> actDescripcion;
    public static volatile SingularAttribute<Actividad, String> actTipo;
    public static volatile SingularAttribute<Actividad, Date> actFechaini;
    public static volatile CollectionAttribute<Actividad, Visita> visitaCollection;
    public static volatile SingularAttribute<Actividad, Cliente> cliId;

}