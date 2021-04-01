package entidades;

import entidades.Catalogo;
import entidades.Ordenmaterial;
import entidades.Ventamaterial;
import entidades.Viscotmaterial;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-01T00:21:09")
@StaticMetamodel(Material.class)
public class Material_ { 

    public static volatile SingularAttribute<Material, Integer> matStock;
    public static volatile SingularAttribute<Material, Double> matPotencia;
    public static volatile SingularAttribute<Material, String> matMarca;
    public static volatile CollectionAttribute<Material, Ventamaterial> ventamaterialCollection;
    public static volatile SingularAttribute<Material, Double> matPrecio;
    public static volatile SingularAttribute<Material, String> matDescripcion;
    public static volatile SingularAttribute<Material, String> matCompatibilidad;
    public static volatile CollectionAttribute<Material, Viscotmaterial> viscotmaterialCollection;
    public static volatile SingularAttribute<Material, String> matColor;
    public static volatile SingularAttribute<Material, Catalogo> catId;
    public static volatile SingularAttribute<Material, Double> matCorriente;
    public static volatile SingularAttribute<Material, byte[]> matImagen;
    public static volatile SingularAttribute<Material, String> matId;
    public static volatile SingularAttribute<Material, String> matNombre;
    public static volatile SingularAttribute<Material, String> matTipoconexion;
    public static volatile CollectionAttribute<Material, Ordenmaterial> ordenmaterialCollection;
    public static volatile SingularAttribute<Material, Double> matVoltaje;

}