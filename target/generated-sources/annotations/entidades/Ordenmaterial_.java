package entidades;

import entidades.Material;
import entidades.Ordentrabajo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-01T00:21:09")
@StaticMetamodel(Ordenmaterial.class)
public class Ordenmaterial_ { 

    public static volatile SingularAttribute<Ordenmaterial, Integer> ordmtId;
    public static volatile SingularAttribute<Ordenmaterial, Integer> ordmtCantidad;
    public static volatile SingularAttribute<Ordenmaterial, Material> matId;
    public static volatile SingularAttribute<Ordenmaterial, Ordentrabajo> ordtrId;

}