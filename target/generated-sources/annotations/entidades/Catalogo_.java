package entidades;

import entidades.Material;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-18T11:20:56")
@StaticMetamodel(Catalogo.class)
public class Catalogo_ { 

    public static volatile SingularAttribute<Catalogo, Integer> catId;
    public static volatile CollectionAttribute<Catalogo, Material> materialCollection;
    public static volatile SingularAttribute<Catalogo, String> catCodigo;
    public static volatile SingularAttribute<Catalogo, Boolean> catEstado;
    public static volatile SingularAttribute<Catalogo, String> catNombre;

}