package entidades;

import entidades.Cliente;
import entidades.Profpedido;
import entidades.Serviciopedido;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-10T20:43:55")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Integer> pedId;
    public static volatile CollectionAttribute<Pedido, Serviciopedido> serviciopedidoCollection;
    public static volatile CollectionAttribute<Pedido, Profpedido> profpedidoCollection;
    public static volatile SingularAttribute<Pedido, Date> pedFecha;
    public static volatile SingularAttribute<Pedido, Boolean> pedEstado;
    public static volatile SingularAttribute<Pedido, String> pedDescripcion;
    public static volatile SingularAttribute<Pedido, Cliente> cliId;

}