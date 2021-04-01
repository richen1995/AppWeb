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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Richard
 */
@Entity
@Table(name = "tipopago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipopago.findAll", query = "SELECT t FROM Tipopago t")
    , @NamedQuery(name = "Tipopago.findByTipgId", query = "SELECT t FROM Tipopago t WHERE t.tipgId = :tipgId")
    , @NamedQuery(name = "Tipopago.findByTipgCodigo", query = "SELECT t FROM Tipopago t WHERE t.tipgCodigo = :tipgCodigo")
    , @NamedQuery(name = "Tipopago.findByTipgNombre", query = "SELECT t FROM Tipopago t WHERE t.tipgNombre = :tipgNombre")
    , @NamedQuery(name = "Tipopago.findByTipgEstado", query = "SELECT t FROM Tipopago t WHERE t.tipgEstado = :tipgEstado")})
public class Tipopago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tipg_id")
    private Integer tipgId;
    @Size(max = 25)
    @Column(name = "tipg_codigo")
    private String tipgCodigo;
    @Size(max = 25)
    @Column(name = "tipg_nombre")
    private String tipgNombre;
    @Column(name = "tipg_estado")
    private Boolean tipgEstado;
    @OneToMany(mappedBy = "tipgId")
    private Collection<Factura> facturaCollection;

    public Tipopago() {
    }

    public Tipopago(Integer tipgId) {
        this.tipgId = tipgId;
    }

    public Integer getTipgId() {
        return tipgId;
    }

    public void setTipgId(Integer tipgId) {
        this.tipgId = tipgId;
    }

    public String getTipgCodigo() {
        return tipgCodigo;
    }

    public void setTipgCodigo(String tipgCodigo) {
        this.tipgCodigo = tipgCodigo;
    }

    public String getTipgNombre() {
        return tipgNombre;
    }

    public void setTipgNombre(String tipgNombre) {
        this.tipgNombre = tipgNombre;
    }

    public Boolean getTipgEstado() {
        return tipgEstado;
    }

    public void setTipgEstado(Boolean tipgEstado) {
        this.tipgEstado = tipgEstado;
    }

    @XmlTransient
    public Collection<Factura> getFacturaCollection() {
        return facturaCollection;
    }

    public void setFacturaCollection(Collection<Factura> facturaCollection) {
        this.facturaCollection = facturaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipgId != null ? tipgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopago)) {
            return false;
        }
        Tipopago other = (Tipopago) object;
        if ((this.tipgId == null && other.tipgId != null) || (this.tipgId != null && !this.tipgId.equals(other.tipgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Tipopago[ tipgId=" + tipgId + " ]";
    }
    
}
