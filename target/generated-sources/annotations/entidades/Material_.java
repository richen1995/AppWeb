package entidades;

import entidades.Catalogo;
import entidades.Materialkit;
import entidades.Materialservicio;
import entidades.Ordenmaterial;
import entidades.Ventamaterial;
import entidades.Viscotmaterial;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-18T11:20:56")
@StaticMetamodel(Material.class)
public class Material_ { 

    public static volatile SingularAttribute<Material, Integer> matStock;
    public static volatile SingularAttribute<Material, Double> matPotencia;
    public static volatile SingularAttribute<Material, String> matMarca;
    public static volatile CollectionAttribute<Material, Ventamaterial> ventamaterialCollection;
    public static volatile CollectionAttribute<Material, Materialkit> materialkitCollection;
    public static volatile SingularAttribute<Material, BigDecimal> matPrecio;
    public static volatile SingularAttribute<Material, String> matDescripcion;
    public static volatile SingularAttribute<Material, String> matCompatibilidad;
    public static volatile CollectionAttribute<Material, Viscotmaterial> viscotmaterialCollection;
    public static volatile SingularAttribute<Material, String> matColor;
    public static volatile SingularAttribute<Material, Catalogo> catId;
    public static volatile CollectionAttribute<Material, Materialservicio> materialservicioCollection;
    public static volatile SingularAttribute<Material, Double> matCorriente;
    public static volatile SingularAttribute<Material, String> matImagen;
    public static volatile SingularAttribute<Material, String> matId;
    public static volatile SingularAttribute<Material, String> matNombre;
    public static volatile SingularAttribute<Material, String> matTipoconexion;
    public static volatile CollectionAttribute<Material, Ordenmaterial> ordenmaterialCollection;
    public static volatile SingularAttribute<Material, Double> matVoltaje;

}