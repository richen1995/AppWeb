package entidades;

import entidades.Persona;
import entidades.Provincia;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-10T20:43:55")
@StaticMetamodel(Ciudad.class)
public class Ciudad_ { 

    public static volatile CollectionAttribute<Ciudad, Persona> personaCollection;
    public static volatile SingularAttribute<Ciudad, String> cidCodigo;
    public static volatile SingularAttribute<Ciudad, Provincia> prvCodigo;
    public static volatile SingularAttribute<Ciudad, String> cidNombre;
    public static volatile SingularAttribute<Ciudad, Boolean> cidEstado;

}