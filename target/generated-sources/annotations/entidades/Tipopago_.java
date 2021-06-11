package entidades;

import entidades.Factura;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-10T20:43:55")
@StaticMetamodel(Tipopago.class)
public class Tipopago_ { 

    public static volatile SingularAttribute<Tipopago, String> tipgNombre;
    public static volatile SingularAttribute<Tipopago, Boolean> tipgEstado;
    public static volatile SingularAttribute<Tipopago, Integer> tipgId;
    public static volatile SingularAttribute<Tipopago, String> tipgCodigo;
    public static volatile CollectionAttribute<Tipopago, Factura> facturaCollection;

}