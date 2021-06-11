package entidades;

import entidades.Clienteprobable;
import entidades.Profesional;
import entidades.Viscotmaterial;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-10T20:43:55")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile SingularAttribute<Cotizacion, Date> cotFecha;
    public static volatile SingularAttribute<Cotizacion, Integer> cotId;
    public static volatile SingularAttribute<Cotizacion, Clienteprobable> cpId;
    public static volatile SingularAttribute<Cotizacion, Double> cotManobra;
    public static volatile CollectionAttribute<Cotizacion, Viscotmaterial> viscotmaterialCollection;
    public static volatile SingularAttribute<Cotizacion, Double> cotIva;
    public static volatile SingularAttribute<Cotizacion, Profesional> profId;

}