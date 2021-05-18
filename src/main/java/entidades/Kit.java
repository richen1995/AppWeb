/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Richard
 */
@Entity
@Table(name = "kit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kit.findAll", query = "SELECT k FROM Kit k")
    , @NamedQuery(name = "Kit.findByKitId", query = "SELECT k FROM Kit k WHERE k.kitId = :kitId")
    , @NamedQuery(name = "Kit.findByKitMateriales", query = "SELECT k FROM Kit k WHERE k.kitMateriales = :kitMateriales")
    , @NamedQuery(name = "Kit.findByKitPrecio", query = "SELECT k FROM Kit k WHERE k.kitPrecio = :kitPrecio")})
public class Kit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "kit_id")
    private String kitId;
    @Size(max = 500)
    @Column(name = "kit_materiales")
    private String kitMateriales;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "kit_precio")
    private Double kitPrecio;
    @OneToMany(mappedBy = "kitId")
    private Collection<Materialkit> materialkitCollection;
    @JoinColumn(name = "srv_id", referencedColumnName = "srv_id")
    @ManyToOne
    private Servicio srvId;

    public Kit() {
    }

    public Kit(String kitId) {
        this.kitId = kitId;
    }

    public String getKitId() {
        return kitId;
    }

    public void setKitId(String kitId) {
        this.kitId = kitId;
    }

    public String getKitMateriales() {
        return kitMateriales;
    }

    public void setKitMateriales(String kitMateriales) {
        this.kitMateriales = kitMateriales;
    }

    public Double getKitPrecio() {
        return kitPrecio;
    }

    public void setKitPrecio(Double kitPrecio) {
        this.kitPrecio = kitPrecio;
    }

    @XmlTransient
    public Collection<Materialkit> getMaterialkitCollection() {
        return materialkitCollection;
    }

    public void setMaterialkitCollection(Collection<Materialkit> materialkitCollection) {
        this.materialkitCollection = materialkitCollection;
    }

    public Servicio getSrvId() {
        return srvId;
    }

    public void setSrvId(Servicio srvId) {
        this.srvId = srvId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kitId != null ? kitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kit)) {
            return false;
        }
        Kit other = (Kit) object;
        if ((this.kitId == null && other.kitId != null) || (this.kitId != null && !this.kitId.equals(other.kitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Kit[ kitId=" + kitId + " ]";
    }
    
}
