package entidades;

import entidades.Material;
import entidades.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-18T11:20:56")
@StaticMetamodel(Ventamaterial.class)
public class Ventamaterial_ { 

    public static volatile SingularAttribute<Ventamaterial, Integer> vtmtId;
    public static volatile SingularAttribute<Ventamaterial, Venta> vntId;
    public static volatile SingularAttribute<Ventamaterial, Material> matId;
    public static volatile SingularAttribute<Ventamaterial, Integer> vtmtCantidad;

}