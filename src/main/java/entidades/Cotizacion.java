/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Richard
 */
@Entity
@Table(name = "cotizacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizacion.findAll", query = "SELECT c FROM Cotizacion c")
    , @NamedQuery(name = "Cotizacion.findByCotId", query = "SELECT c FROM Cotizacion c WHERE c.cotId = :cotId")
    , @NamedQuery(name = "Cotizacion.findByCotManobra", query = "SELECT c FROM Cotizacion c WHERE c.cotManobra = :cotManobra")
    , @NamedQuery(name = "Cotizacion.findByCotIva", query = "SELECT c FROM Cotizacion c WHERE c.cotIva = :cotIva")
    , @NamedQuery(name = "Cotizacion.findByCotFecha", query = "SELECT c FROM Cotizacion c WHERE c.cotFecha = :cotFecha")})
public class Cotizacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cot_id")
    private Integer cotId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cot_manobra")
    private Double cotManobra;
    @Column(name = "cot_iva")
    private Double cotIva;
    @Column(name = "cot_fecha")
    @Temporal(TemporalType.DATE)
    private Date cotFecha;
    @OneToMany(mappedBy = "cotId")
    private Collection<Viscotmaterial> viscotmaterialCollection;
    @JoinColumn(name = "cp_id", referencedColumnName = "cp_id")
    @ManyToOne
    private Clienteprobable cpId;
    @JoinColumn(name = "prof_id", referencedColumnName = "prof_id")
    @ManyToOne
    private Profesional profId;

    public Cotizacion() {
    }

    public Cotizacion(Integer cotId) {
        this.cotId = cotId;
    }

    public Integer getCotId() {
        return cotId;
    }

    public void setCotId(Integer cotId) {
        this.cotId = cotId;
    }

    public Double getCotManobra() {
        return cotManobra;
    }

    public void setCotManobra(Double cotManobra) {
        this.cotManobra = cotManobra;
    }

    public Double getCotIva() {
        return cotIva;
    }

    public void setCotIva(Double cotIva) {
        this.cotIva = cotIva;
    }

    public Date getCotFecha() {
        return cotFecha;
    }

    public void setCotFecha(Date cotFecha) {
        this.cotFecha = cotFecha;
    }

    @XmlTransient
    public Collection<Viscotmaterial> getViscotmaterialCollection() {
        return viscotmaterialCollection;
    }

    public void setViscotmaterialCollection(Collection<Viscotmaterial> viscotmaterialCollection) {
        this.viscotmaterialCollection = viscotmaterialCollection;
    }

    public Clienteprobable getCpId() {
        return cpId;
    }

    public void setCpId(Clienteprobable cpId) {
        this.cpId = cpId;
    }

    public Profesional getProfId() {
        return profId;
    }

    public void setProfId(Profesional profId) {
        this.profId = profId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cotId != null ? cotId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotizacion)) {
            return false;
        }
        Cotizacion other = (Cotizacion) object;
        if ((this.cotId == null && other.cotId != null) || (this.cotId != null && !this.cotId.equals(other.cotId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cotizacion[ cotId=" + cotId + " ]";
    }
    
}
