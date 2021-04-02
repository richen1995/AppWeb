package entidades;

import entidades.Cliente;
import entidades.Factura;
import entidades.Profesional;
import entidades.Ventamaterial;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-02T18:28:54")
@StaticMetamodel(Venta.class)
public class Venta_ { 

    public static volatile SingularAttribute<Venta, Integer> vntId;
    public static volatile CollectionAttribute<Venta, Ventamaterial> ventamaterialCollection;
    public static volatile SingularAttribute<Venta, Factura> facId;
    public static volatile SingularAttribute<Venta, Double> vntImporte;
    public static volatile SingularAttribute<Venta, Profesional> profId;
    public static volatile SingularAttribute<Venta, Cliente> cliId;

}