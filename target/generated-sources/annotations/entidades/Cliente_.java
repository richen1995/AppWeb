package entidades;

import entidades.Actividad;
import entidades.Pedido;
import entidades.Persona;
import entidades.Venta;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-01T00:21:09")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile CollectionAttribute<Cliente, Venta> ventaCollection;
    public static volatile SingularAttribute<Cliente, Persona> perCedula;
    public static volatile CollectionAttribute<Cliente, Actividad> actividadCollection;
    public static volatile SingularAttribute<Cliente, Boolean> cliEstado;
    public static volatile CollectionAttribute<Cliente, Pedido> pedidoCollection;
    public static volatile SingularAttribute<Cliente, String> cliId;

}