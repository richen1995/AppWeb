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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Richard
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v")
    , @NamedQuery(name = "Venta.findByVntImporte", query = "SELECT v FROM Venta v WHERE v.vntImporte = :vntImporte")
    , @NamedQuery(name = "Venta.findByVntId", query = "SELECT v FROM Venta v WHERE v.vntId = :vntId")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vnt_importe")
    private Double vntImporte;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "vnt_id")
    private Integer vntId;
    @JoinColumn(name = "cli_id", referencedColumnName = "cli_id")
    @ManyToOne
    private Cliente cliId;
    @JoinColumn(name = "fac_id", referencedColumnName = "fac_id")
    @ManyToOne
    private Factura facId;
    @JoinColumn(name = "prof_id", referencedColumnName = "prof_id")
    @ManyToOne
    private Profesional profId;
    @OneToMany(mappedBy = "vntId")
    private Collection<Ventamaterial> ventamaterialCollection;

    public Venta() {
    }

    public Venta(Integer vntId) {
        this.vntId = vntId;
    }

    public Double getVntImporte() {
        return vntImporte;
    }

    public void setVntImporte(Double vntImporte) {
        this.vntImporte = vntImporte;
    }

    public Integer getVntId() {
        return vntId;
    }

    public void setVntId(Integer vntId) {
        this.vntId = vntId;
    }

    public Cliente getCliId() {
        return cliId;
    }

    public void setCliId(Cliente cliId) {
        this.cliId = cliId;
    }

    public Factura getFacId() {
        return facId;
    }

    public void setFacId(Factura facId) {
        this.facId = facId;
    }

    public Profesional getProfId() {
        return profId;
    }

    public void setProfId(Profesional profId) {
        this.profId = profId;
    }

    @XmlTransient
    public Collection<Ventamaterial> getVentamaterialCollection() {
        return ventamaterialCollection;
    }

    public void setVentamaterialCollection(Collection<Ventamaterial> ventamaterialCollection) {
        this.ventamaterialCollection = ventamaterialCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vntId != null ? vntId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.vntId == null && other.vntId != null) || (this.vntId != null && !this.vntId.equals(other.vntId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Venta[ vntId=" + vntId + " ]";
    }
    
}
