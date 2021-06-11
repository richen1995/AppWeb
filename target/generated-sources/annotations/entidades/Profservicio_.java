package entidades;

import entidades.Profesional;
import entidades.Servicio;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-10T20:43:55")
@StaticMetamodel(Profservicio.class)
public class Profservicio_ { 

    public static volatile SingularAttribute<Profservicio, Integer> prfsrv;
    public static volatile SingularAttribute<Profservicio, Servicio> srvId;
    public static volatile SingularAttribute<Profservicio, Profesional> profId;

}